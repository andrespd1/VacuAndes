package uniandes.isis2304.parranderos.persistencia;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

public class SQLUtil {
	
	private final static String SQL = PersistenciaVacuAndes.SQL;
	
	private PersistenciaVacuAndes pp;
	
	public SQLUtil (PersistenciaVacuAndes pp)
	{
		this.pp = pp;
	}

	public long nextval (PersistenceManager pm)
	{
        Query q = pm.newQuery(SQL, "SELECT "+ pp.darSeqVacuAndes () + ".nextval FROM DUAL");
        q.setResultClass(Long.class);
        long resp = (long) q.executeUnique();
        return resp;
	}
	
	public long [] limpiarVacuAndes (PersistenceManager pm)
	{
        Query qAdministradorOficinaEps = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaAdministradorOficinaEps ());
        Query qAdministradorPlanVacunacion = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaAdministradorPlanVacunacion ());
        Query qAdministradorPuntoVacunacion = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaAdministradorPuntoVacunacion ());
        Query qCargo = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaCargo ());
        Query qCitaVacunacion = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaCitaVacunacion ());
        Query qCiudadano = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaCiudadano ());
        Query qDepartamento = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaDepartamento ());
        Query qEpsRegional = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaEpsRegional ());
        Query qLoteVacuna = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaLoteVacuna ());
        Query qMinisterioSalud = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaMinisterioSalud ());
        Query qOperadorPuntoVacunacion = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaOperadorPuntoVacunacion ());
        Query qPlanVacunacion = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaPlanVacunacion ());
        Query qPuntoVacunacion = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaPuntoVacunacion ());
        Query qTalentoHumano = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaTalentoHumano ());
        Query qUsuario = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaUsuario ());
        Query qVacuna = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaVacuna ());
        
        long administradorOficinaEpsEliminado = (long) qAdministradorOficinaEps.executeUnique();
        long administradorPlanVacunacionEliminado = (long) qAdministradorPlanVacunacion.executeUnique();
        long administradorPuntoVacunacionEliminado = (long) qAdministradorPuntoVacunacion.executeUnique();
        long cargoEliminado = (long) qCargo.executeUnique();
        long citaVacunacionEliminado = (long) qCitaVacunacion.executeUnique();
        long ciudadanoEliminado = (long) qCiudadano.executeUnique();
        long departamentoEliminado = (long) qDepartamento.executeUnique();
        long EpsRegionalEliminado = (long) qEpsRegional.executeUnique();
        long LoteVacunaEliminado = (long) qLoteVacuna.executeUnique();
        long MinisterioSaludEliminado = (long) qMinisterioSalud.executeUnique();
        long OperadorPuntoVacunacionEliminado = (long) qOperadorPuntoVacunacion.executeUnique();
        long PlanVacunacionEliminado = (long) qPlanVacunacion.executeUnique();
        long PuntoVacunacionEliminado = (long) qPuntoVacunacion.executeUnique();
        long TalentoHumanoEliminado = (long) qTalentoHumano.executeUnique();
        long UsuarioEliminado = (long) qUsuario.executeUnique();
        long VacunaEliminado = (long) qVacuna.executeUnique();
        
        return new long[] {administradorOficinaEpsEliminado, administradorPlanVacunacionEliminado, administradorPuntoVacunacionEliminado
        		,cargoEliminado, citaVacunacionEliminado, ciudadanoEliminado, departamentoEliminado, EpsRegionalEliminado, LoteVacunaEliminado,
        		MinisterioSaludEliminado, OperadorPuntoVacunacionEliminado, PlanVacunacionEliminado, PuntoVacunacionEliminado, TalentoHumanoEliminado,
        		UsuarioEliminado, VacunaEliminado};
        
	}

}
