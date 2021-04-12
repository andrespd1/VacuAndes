package uniandes.isis2304.parranderos.persistencia;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.parranderos.negocio.PlanVacunacion;

public class SQLPlanVacunacion {
	
	private final static String SQL = PersistenciaVacuAndes.SQL;
	
	private PersistenciaVacuAndes pp;
	
	public SQLPlanVacunacion(PersistenciaVacuAndes pp)
	{
		this.pp = pp;
	}
	
	public long agregarPlanVacunacion(PersistenceManager pm, long id, long administradorPlanVacunacion)
	{
		Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaPlanVacunacion() +"(id, administradorPlanVacunacion) VALUES (?, ?)");
		q.setParameters(id, administradorPlanVacunacion);
		return (long)q.executeUnique();
	}
	
	public long eliminarPlanVacunacionPorId(PersistenceManager pm, long id)
	{
		Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaPlanVacunacion() + " WHERE id = ?");
        q.setParameters(id);
        return (long) q.executeUnique();
	}
	
	public PlanVacunacion darPlanVacunacionPorId (PersistenceManager pm, long id) 
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaPlanVacunacion() + " WHERE id = ?");
		q.setResultClass(PlanVacunacion.class);
		q.setParameters(id);
		return (PlanVacunacion) q.executeUnique();
	}
	
	public List<PlanVacunacion> darPlanVacunacions(PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaPlanVacunacion());
		q.setResultClass(PlanVacunacion.class);
		return (List<PlanVacunacion>) q.executeList();
	}
	
	public long actualizarPlanVacunacionPorId(PersistenceManager pm, long id, long idEps_regional)
	{
		Query q = pm.newQuery(SQL, "UPDATE " + pp.darTablaPlanVacunacion() + " SET id = ? WHERE id = ?");
        q.setParameters(id);
        return (long) q.executeUnique();
	}

}
