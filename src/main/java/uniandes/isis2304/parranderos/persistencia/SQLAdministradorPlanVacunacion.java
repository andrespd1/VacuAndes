package uniandes.isis2304.parranderos.persistencia;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.parranderos.negocio.AdministradorPlanVacunacion;

public class SQLAdministradorPlanVacunacion {
	
	private final static String SQL = PersistenciaVacuAndes.SQL;
	
	private PersistenciaVacuAndes pp;
	
	public SQLAdministradorPlanVacunacion(PersistenciaVacuAndes pp)
	{
		this.pp = pp;
	}
	
	public long agregarAdministradorPlanVacunacion(PersistenceManager pm, long id)
	{
		Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaAdministradorPlanVacunacion() +"(id) VALUES (?)");
		q.setParameters(id);
		return (long)q.executeUnique();
	}
	
	public long eliminarAdministradorPlanVacunacionPorId(PersistenceManager pm, long id)
	{
		Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaAdministradorPlanVacunacion() + " WHERE id = ?");
        q.setParameters(id);
        return (long) q.executeUnique();
	}
	
	public AdministradorPlanVacunacion darAdiministradorPlanVacunacionPorId (PersistenceManager pm, long id) 
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaAdministradorPlanVacunacion() + " WHERE id = ?");
		q.setResultClass(AdministradorPlanVacunacion.class);
		q.setParameters(id);
		return (AdministradorPlanVacunacion) q.executeUnique();
	}
	
	public List<AdministradorPlanVacunacion> darAdministradoresPlanVacunacion(PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaAdministradorPlanVacunacion());
		q.setResultClass(AdministradorPlanVacunacion.class);
		return (List<AdministradorPlanVacunacion>) q.executeList();
	}
	
	public long actualizarAdministradorPlanVacunacionPorId(PersistenceManager pm, long id)
	{
		Query q = pm.newQuery(SQL, "UPDATE " + pp.darTablaAdministradorPlanVacunacion() + " SET id = ? WHERE id = ?");
        q.setParameters(id);
        return (long) q.executeUnique();
	}

}
