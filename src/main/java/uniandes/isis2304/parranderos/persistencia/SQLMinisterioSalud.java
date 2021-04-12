package uniandes.isis2304.parranderos.persistencia;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.parranderos.negocio.MinisterioSalud;

public class SQLMinisterioSalud {
	
	private final static String SQL = PersistenciaVacuAndes.SQL;
	
	private PersistenciaVacuAndes pp;
	
	public SQLMinisterioSalud(PersistenciaVacuAndes pp)
	{
		this.pp = pp;
	}
	
	public long agregarMinisterioSalud(PersistenceManager pm, long id, int etapa, int fase, long plan_vacunacion, long administradorPlanVacunacion)
	{
		Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaMinisterioSalud() +"(id, etapa, fase, plan_vacunacion, administradorPlanVacunacion) VALUES (?, ?, ?, ?, ?)");
		q.setParameters(id, etapa, fase, plan_vacunacion, administradorPlanVacunacion);
		return (long)q.executeUnique();
	}
	
	public long eliminarMinisterioSaludPorId(PersistenceManager pm, long id)
	{
		Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaMinisterioSalud() + " WHERE id = ?");
        q.setParameters(id);
        return (long) q.executeUnique();
	}
	
	public MinisterioSalud darMinisterioSaludPorId (PersistenceManager pm, long id) 
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaMinisterioSalud() + " WHERE id = ?");
		q.setResultClass(MinisterioSalud.class);
		q.setParameters(id);
		return (MinisterioSalud) q.executeUnique();
	}
	
	public List<MinisterioSalud> darMinisteriosSalud(PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaMinisterioSalud());
		q.setResultClass(MinisterioSalud.class);
		return (List<MinisterioSalud>) q.executeList();
	}
	
	public long actualizarMinisterioSaludPorEtapa(PersistenceManager pm, long id, int etapa)
	{
		Query q = pm.newQuery(SQL, "UPDATE " + pp.darTablaMinisterioSalud() + " SET etapa = ? WHERE id = ?");
        q.setParameters(etapa, id);
        return (long) q.executeUnique();
	}
	
	public long actualizarMinisterioSaludPorFase(PersistenceManager pm, long id, int fase)
	{
		Query q = pm.newQuery(SQL, "UPDATE " + pp.darTablaMinisterioSalud() + " SET fase = ? WHERE id = ?");
        q.setParameters(fase, id);
        return (long) q.executeUnique();
	}
	
	public long actualizarMinisterioSaludPorAdministrador(PersistenceManager pm, long id, long administradorPlanVacunacion)
	{
		Query q = pm.newQuery(SQL, "UPDATE " + pp.darTablaMinisterioSalud() + " SET administradorPlanVacunacion = ? WHERE id = ?");
        q.setParameters(administradorPlanVacunacion, id);
        return (long) q.executeUnique();
	}

}
