/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad	de	los	Andes	(Bogotá	- Colombia)
 * Departamento	de	Ingeniería	de	Sistemas	y	Computación
 * Licenciado	bajo	el	esquema	Academic Free License versión 2.1
 * 		
 * Curso: isis2304 - Sistemas Transaccionales
 * Proyecto: Parranderos Uniandes
 * @version 1.0
 * @author Germán Bravo
 * Julio de 2018
 * 
 * Revisado por: Claudia Jiménez, Christian Ariza
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package uniandes.isis2304.parranderos.persistencia;


import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.LinkedList;
import java.util.List;

import javax.jdo.JDODataStoreException;
import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Transaction;

import org.apache.log4j.Logger;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import uniandes.isis2304.parranderos.negocio.Ciudadano;

/**
 * Clase para el manejador de persistencia del proyecto Parranderos
 * Traduce la información entre objetos Java y tuplas de la base de datos, en ambos sentidos
 * Sigue un patrón SINGLETON (Sólo puede haber UN objeto de esta clase) para comunicarse de manera correcta
 * con la base de datos
 * Se apoya en las clases SQLBar, SQLBebedor, SQLBebida, SQLGustan, SQLSirven, SQLTipoBebida y SQLVisitan, que son 
 * las que realizan el acceso a la base de datos
 * 
 * @author Germán Bravo
 */
public class PersistenciaVacuAndes 
{
	/* ****************************************************************
	 * 			Constantes
	 *****************************************************************/
	/**
	 * Logger para escribir la traza de la ejecución
	 */
	private static Logger log = Logger.getLogger(PersistenciaVacuAndes.class.getName());
	
	/**
	 * Cadena para indicar el tipo de sentencias que se va a utilizar en una consulta
	 */
	public final static String SQL = "javax.jdo.query.SQL";

	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * Atributo privado que es el único objeto de la clase - Patrón SINGLETON
	 */
	private static PersistenciaVacuAndes instance;
	
	/**
	 * Fábrica de Manejadores de persistencia, para el manejo correcto de las transacciones
	 */
	private PersistenceManagerFactory pmf;
	
	/**
	 * Arreglo de cadenas con los nombres de las tablas de la base de datos, en su orden:
	 * Secuenciador, tipoBebida, bebida, bar, bebedor, gustan, sirven y visitan
	 */
	private List <String> tablas;
	
	private SQLUtil sqlUtil;
	
	private SQLAdministradorOficinaEps sqlAdministradorOficinaEps;
	
	private SQLAdministradorPlanVacunacion sqlAdministradorPlanVacunacion;
	
	private SQLAdministradorPuntoVacunacion sqlAdministradorPuntoVacunacion;
	
	private SQLCargo sqlCargo;
	
	private SQLCitaVacunacion sqlCitaVacunacion;
	
	private SQLCiudadano sqlCiudadano;
	
	private SQLDepartamento sqlDepartamento;
	
	private SQLEpsRegional sqlEpsRegional;
	
	private SQLLoteVacuna sqlLoteVacuna;
	
	private SQLMinisterioSalud sqlMinisterioSalud;
	
	private SQLOperadorPuntoVacunacion sqlOperadorPuntoVacunacion;
	
	private SQLPlanVacunacion sqlPlanVacunacion;
	
	private SQLPuntoVacunacion sqlPuntoVacunacion;
	
	private SQLTalentoHumano sqlTalentoHumano;
	
	private SQLUsuario sqlUsuario;
	
	private SQLVacuna sqlVacuna;
	
	/* ****************************************************************
	 * 			Métodos del MANEJADOR DE PERSISTENCIA
	 *****************************************************************/

	/**
	 * Constructor privado con valores por defecto - Patrón SINGLETON
	 */
	private PersistenciaVacuAndes ()
	{
		pmf = JDOHelper.getPersistenceManagerFactory("VacuAndes");		
		crearClasesSQL ();
		
		// Define los nombres por defecto de las tablas de la base de datos
		tablas = new LinkedList<String> ();
		tablas.add ("VacuAndes_sequence");
		tablas.add ("AdministradoresOficinaEps");
		tablas.add ("AdministradoresPlanVacunacion");
		tablas.add ("AdministradoresPuntoVacunacion");
		tablas.add ("Cargos");
		tablas.add ("CitasVacunacion");
		tablas.add ("Ciudadanos");
		tablas.add ("Depertamentos");
		tablas.add ("EpsRegionales");
		tablas.add ("LotesVacunas");
		tablas.add ("MinisterioSalud");
		tablas.add ("OperadoresPuntoVacunacion");
		tablas.add ("PlanVacunacion");
		tablas.add ("PuntosVacunacion");
		tablas.add ("TalentoHumano");
		tablas.add ("Usuarios");
		tablas.add ("Vacunas");
}

	/**
	 * Constructor privado, que recibe los nombres de las tablas en un objeto Json - Patrón SINGLETON
	 * @param tableConfig - Objeto Json que contiene los nombres de las tablas y de la unidad de persistencia a manejar
	 */
	private PersistenciaVacuAndes (JsonObject tableConfig)
	{
		crearClasesSQL ();
		tablas = leerNombresTablas (tableConfig);
		
		String unidadPersistencia = tableConfig.get ("unidadPersistencia").getAsString ();
		log.trace ("Accediendo unidad de persistencia: " + unidadPersistencia);
		pmf = JDOHelper.getPersistenceManagerFactory (unidadPersistencia);
	}

	/**
	 * @return Retorna el único objeto PersistenciaParranderos existente - Patrón SINGLETON
	 */
	public static PersistenciaVacuAndes getInstance ()
	{
		if (instance == null)
		{
			instance = new PersistenciaVacuAndes ();
		}
		return instance;
	}
	
	/**
	 * Constructor que toma los nombres de las tablas de la base de datos del objeto tableConfig
	 * @param tableConfig - El objeto JSON con los nombres de las tablas
	 * @return Retorna el único objeto PersistenciaParranderos existente - Patrón SINGLETON
	 */
	public static PersistenciaVacuAndes getInstance (JsonObject tableConfig)
	{
		if (instance == null)
		{
			instance = new PersistenciaVacuAndes (tableConfig);
		}
		return instance;
	}

	/**
	 * Cierra la conexión con la base de datos
	 */
	public void cerrarUnidadPersistencia ()
	{
		pmf.close ();
		instance = null;
	}
	
	/**
	 * Genera una lista con los nombres de las tablas de la base de datos
	 * @param tableConfig - El objeto Json con los nombres de las tablas
	 * @return La lista con los nombres del secuenciador y de las tablas
	 */
	private List <String> leerNombresTablas (JsonObject tableConfig)
	{
		JsonArray nombres = tableConfig.getAsJsonArray("tablas") ;

		List <String> resp = new LinkedList <String> ();
		for (JsonElement nom : nombres)
		{
			resp.add (nom.getAsString ());
		}
		
		return resp;
	}
	
	/**
	 * Crea los atributos de clases de apoyo SQL
	 */
	private void crearClasesSQL ()
	{
		sqlAdministradorOficinaEps = new SQLAdministradorOficinaEps(this);
		sqlAdministradorPlanVacunacion = new SQLAdministradorPlanVacunacion(this);
		sqlAdministradorPuntoVacunacion = new SQLAdministradorPuntoVacunacion(this);
		sqlCargo = new SQLCargo(this);
		sqlCitaVacunacion = new SQLCitaVacunacion(this);
		sqlCiudadano = new SQLCiudadano(this);
		sqlDepartamento = new SQLDepartamento(this);
		sqlEpsRegional = new SQLEpsRegional(this);
		sqlLoteVacuna = new SQLLoteVacuna(this);
		sqlMinisterioSalud = new SQLMinisterioSalud(this);
		sqlOperadorPuntoVacunacion = new SQLOperadorPuntoVacunacion(this);
		sqlPlanVacunacion = new SQLPlanVacunacion(this);
		sqlPuntoVacunacion = new SQLPuntoVacunacion(this);
		sqlTalentoHumano = new SQLTalentoHumano(this);
		sqlUsuario = new SQLUsuario(this);
		sqlVacuna = new SQLVacuna(this);
	}

	/**
	 * @return La cadena de caracteres con el nombre del secuenciador de parranderos
	 */
	public String darSeqVacuAndes ()
	{
		return tablas.get (0);
	}
	
	public String darTablaAdministradorOficinaEps()
	{
		return tablas.get(1);
	}
	
	public String darTablaAdministradorPlanVacunacion()
	{
		return tablas.get(2);
	}
	
	public String darTablaAdministradorPuntoVacunacion()
	{
		return tablas.get(3);
	}
	
	public String darTablaCargo()
	{
		return tablas.get(4);
	}
	
	public String darTablaCitaVacunacion()
	{
		return tablas.get(5);
	}
	
	public String darTablaCiudadano()
	{
		return tablas.get(6);
	}
	
	public String darTablaDepartamento()
	{
		return tablas.get(7);
	}
	
	public String darTablaEpsRegional()
	{
		return tablas.get(7);
	}
	
	public String darTablaLoteVacuna()
	{
		return tablas.get(8);
	}
	
	public String darTablaMinisterioSalud()
	{
		return tablas.get(9);
	}
	
	public String darTablaOperadorPuntoVacunacion()
	{
		return tablas.get(11);
	}
	
	public String darTablaPlanVacunacion()
	{
		return tablas.get(12);
	}
	
	public String darTablaPuntoVacunacion()
	{
		return tablas.get(13);
	}
	
	public String darTablaTalentoHumano()
	{
		return tablas.get(14);
	}
	
	public String darTablaUsuario()
	{
		return tablas.get(15);
	}
	
	public String darTablaVacuna()
	{
		return tablas.get(16);
	}
	/**
	 * Transacción para el generador de secuencia de Parranderos
	 * Adiciona entradas al log de la aplicación
	 * @return El siguiente número del secuenciador de Parranderos
	 */
	private long nextval ()
	{
        long resp = sqlUtil.nextval (pmf.getPersistenceManager());
        log.trace ("Generando secuencia: " + resp);
        return resp;
    }
	
	/**
	 * Extrae el mensaje de la exception JDODataStoreException embebido en la Exception e, que da el detalle específico del problema encontrado
	 * @param e - La excepción que ocurrio
	 * @return El mensaje de la excepción JDO
	 */
	private String darDetalleException(Exception e) 
	{
		String resp = "";
		if (e.getClass().getName().equals("javax.jdo.JDODataStoreException"))
		{
			JDODataStoreException je = (javax.jdo.JDODataStoreException) e;
			return je.getNestedExceptions() [0].getMessage();
		}
		return resp;
	}
	
	public long asignarCiudadanoPuntoVacunacion(long idenitificacion, long punto_vacunacion)
	{
		PersistenceManager pm = pmf.getPersistenceManager();
        Transaction tx=pm.currentTransaction();
        try {
        	tx.begin();
        	long resp = sqlCiudadano.actualizarCiudadanoPorPuntoVacunacion(pm, idenitificacion, punto_vacunacion);
        	
        	tx.commit();
        	
        	return resp;
        }
        catch (Exception e)
        {
        	log.error ("Exception : " + e.getMessage() + "\n" + darDetalleException(e));
            return -1;
        }
        finally
        {
            if (tx.isActive())
            {
                tx.rollback();
            }
            pm.close();
        }
	}
	
	public long asignarCitaVacunacionCiudadano(long identificacion, long punto_vacunacion, Timestamp fecha, long administradorPuntoVacunacion)
	{
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		try {
			tx.begin();
			long resp = sqlCitaVacunacion.agregarCitaVacunacion(pm, identificacion, punto_vacunacion, fecha, administradorPuntoVacunacion);
			tx.commit();
			
			return resp;
		}
		catch (Exception e)
        {
        	log.error ("Exception : " + e.getMessage() + "\n" + darDetalleException(e));
            return -1;
        }
        finally
        {
            if (tx.isActive())
            {
                tx.rollback();
            }
            pm.close();
        }
	}
	
//	public long registrarAvanceProcesoVacunacionPersona(long )
	
	public long [] limpiarVacuAndes ()
	{
		PersistenceManager pm = pmf.getPersistenceManager();
        Transaction tx=pm.currentTransaction();
        try
        {
            tx.begin();
            long [] resp = sqlUtil.limpiarVacuAndes (pm);
            tx.commit ();
            log.info ("Borrada la base de datos");
            return resp;
        }
        catch (Exception e)
        {
        	log.error ("Exception : " + e.getMessage() + "\n" + darDetalleException(e));
        	return new long[] {-1, -1, -1, -1, -1, -1, -1};
        }
        finally
        {
            if (tx.isActive())
            {
                tx.rollback();
            }
            pm.close();
        }
		
	}

 }
