package uniandes.isis2304.parranderos.persistencia;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.parranderos.negocio.AdministradorOficinaEps;

public class SQLAdministradorOficinaEps {
	
	private final static String SQL = PersistenciaVacuAndes.SQL;
	
	private PersistenciaVacuAndes pp;
	
	public SQLAdministradorOficinaEps(PersistenciaVacuAndes pp)
	{
		this.pp = pp;
	}
	
	public long agregarAdministradorOficinaEps(PersistenceManager pm, long id, long idEps_regional)
	{
		Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaAdministradorOficinaEps() +"(id,eps_regional) VALUES (?, ?)");
		q.setParameters(id, idEps_regional);
		return (long)q.executeUnique();
	}
	
	public long eliminarAdministradorOficinaEpsPorId(PersistenceManager pm, long id)
	{
		Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaAdministradorOficinaEps() + " WHERE id = ?");
        q.setParameters(id);
        return (long) q.executeUnique();
	}
	
	public AdministradorOficinaEps darAdiministradorOficinaEpsPorId (PersistenceManager pm, long id) 
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaAdministradorOficinaEps() + " WHERE id = ?");
		q.setResultClass(AdministradorOficinaEps.class);
		q.setParameters(id);
		return (AdministradorOficinaEps) q.executeUnique();
	}
	
	public AdministradorOficinaEps darAdiministradorOficinaEpsPorEps (PersistenceManager pm, long idEps_regional) 
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaAdministradorOficinaEps() + " WHERE eps_regional = ?");
		q.setResultClass(AdministradorOficinaEps.class);
		q.setParameters(idEps_regional);
		return (AdministradorOficinaEps) q.executeUnique();
	}
	
	public List<AdministradorOficinaEps> darAdministradoresOficinaEps(PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaAdministradorOficinaEps());
		q.setResultClass(AdministradorOficinaEps.class);
		return (List<AdministradorOficinaEps>) q.executeList();
	}
	
	public long actualizarAdministradorOficinaEpsPorId(PersistenceManager pm, long id, long idEps_regional)
	{
		Query q = pm.newQuery(SQL, "UPDATE " + pp.darTablaAdministradorOficinaEps() + " SET eps_regional = ? WHERE id = ?");
        q.setParameters(idEps_regional, id);
        return (long) q.executeUnique();
	}
}
