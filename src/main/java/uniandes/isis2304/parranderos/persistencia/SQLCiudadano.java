package uniandes.isis2304.parranderos.persistencia;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.parranderos.negocio.Ciudadano;

public class SQLCiudadano {

	private final static String SQL = PersistenciaVacuAndes.SQL;
	
	private PersistenciaVacuAndes pp;
	
	public SQLCiudadano(PersistenciaVacuAndes pp)
	{
		this.pp = pp;
	}
	
	public long agregarCiudadano(PersistenceManager pm, long id, String nombre, int edad, String disposicion, int etapa, String estado, long punto_vacunacion, long departamento)
	{
		Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaCiudadano() +"(identificacion, nombre, edad, disposicion, etapa, estado, punto_vacunacion, departamento) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
		
		q.setParameters(id, nombre, edad, disposicion, etapa, estado, punto_vacunacion, departamento);
		return (long)q.executeUnique();
	}
	
	public long eliminarCiudadanoPorId(PersistenceManager pm, long id)
	{
		Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaCiudadano() + " WHERE id = ?");
        q.setParameters(id);
        return (long) q.executeUnique();
	}
	
	public Ciudadano darCiudadanoPorId (PersistenceManager pm, long id) 
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaCiudadano() + " WHERE id = ?");
		q.setResultClass(Ciudadano.class);
		q.setParameters(id);
		return (Ciudadano) q.executeUnique();
	}
	
	public List<Ciudadano> darCiudadanos(PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaCiudadano());
		q.setResultClass(Ciudadano.class);
		return (List<Ciudadano>) q.executeList();
	}
	
	public long actualizarCiudadanoPorNombre(PersistenceManager pm, long id, String nombre)
	{
		Query q = pm.newQuery(SQL, "UPDATE " + pp.darTablaCiudadano() + " SET nombre = ? WHERE id = ?");
        q.setParameters(nombre, id);
        return (long) q.executeUnique();
	}
	
	public long actualizarCiudadanoPorEdad(PersistenceManager pm, long id, int edad)
	{
		Query q = pm.newQuery(SQL, "UPDATE " + pp.darTablaCiudadano() + " SET edad = ? WHERE id = ?");
        q.setParameters(edad, id);
        return (long) q.executeUnique();
	}
	
	public long actualizarCiudadanoPorDiposicion(PersistenceManager pm, long id, String disposicion)
	{
		Query q = pm.newQuery(SQL, "UPDATE " + pp.darTablaCiudadano() + " SET disposicion = ? WHERE id = ?");
        q.setParameters(disposicion, id);
        return (long) q.executeUnique();
	}
	
	public long actualizarCiudadanoPorEtapa(PersistenceManager pm, long id, int etapa)
	{
		Query q = pm.newQuery(SQL, "UPDATE " + pp.darTablaCiudadano() + " SET etapa = ? WHERE id = ?");
        q.setParameters(etapa, id);
        return (long) q.executeUnique();
	}
	
	public long actualizarCiudadanoPorEstado(PersistenceManager pm, long id, String estado)
	{
		Query q = pm.newQuery(SQL, "UPDATE " + pp.darTablaCiudadano() + " SET estado = ? WHERE id = ?");
        q.setParameters(estado, id);
        return (long) q.executeUnique();
	}
	
	public long actualizarCiudadanoPorPuntoVacunacion(PersistenceManager pm, long id, long idPunto_vacunacion)
	{
		Query q = pm.newQuery(SQL, "UPDATE " + pp.darTablaCiudadano() + " SET punto_vacunacion = ? WHERE id = ?");
        q.setParameters(idPunto_vacunacion, id);
        return (long) q.executeUnique();
	}
	
	public long actualizarCiudadanoPorMunicipio(PersistenceManager pm, long id, long idDepartamento)
	{
		Query q = pm.newQuery(SQL, "UPDATE " + pp.darTablaCiudadano() + " SET departamento = ? WHERE id = ?");
        q.setParameters(idDepartamento, id);
        return (long) q.executeUnique();
	}
	
}
