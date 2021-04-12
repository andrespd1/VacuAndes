package uniandes.isis2304.parranderos.persistencia;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.parranderos.negocio.LoteVacuna;

public class SQLLoteVacuna {

	private final static String SQL = PersistenciaVacuAndes.SQL;
	
	private PersistenciaVacuAndes pp;
	
	public SQLLoteVacuna(PersistenciaVacuAndes pp)
	{
		this.pp = pp;
	}
	
	public long agregarLoteVacuna(PersistenceManager pm, long id, String laboratorio, String condiciones_preservacion, int cantidad_vacunas, long punto_vacunacion, long eps_regional)
	{
		Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaLoteVacuna() +"(id, laboratorio, condiciones_preservacion, cantidad_vacunas, punto_vacunacion, eps_regional) VALUES (?, ?, ?, ?, ?, ?)");
		q.setParameters(id, laboratorio, condiciones_preservacion, cantidad_vacunas, punto_vacunacion, eps_regional);
		return (long)q.executeUnique();
	}
	
	public long eliminarLoteVacunaPorId(PersistenceManager pm, long id)
	{
		Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaLoteVacuna() + " WHERE id = ?");
        q.setParameters(id);
        return (long) q.executeUnique();
	}
	
	public LoteVacuna darLoteVacunaPorId (PersistenceManager pm, long id) 
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaLoteVacuna() + " WHERE id = ?");
		q.setResultClass(LoteVacuna.class);
		q.setParameters(id);
		return (LoteVacuna) q.executeUnique();
	}
	
	public List<LoteVacuna> darLoteVacunaPorLaboratorio (PersistenceManager pm, String laboratorio) 
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaLoteVacuna() + " WHERE laboratorio = ?");
		q.setResultClass(LoteVacuna.class);
		q.setParameters(laboratorio);
		return (List<LoteVacuna>) q.executeList();
	}
	
	public List<LoteVacuna> darLotesVacunas(PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaLoteVacuna());
		q.setResultClass(LoteVacuna.class);
		return (List<LoteVacuna>) q.executeList();
	}
	
	public long actualizarLoteVacunaPorPuntoVacunacion(PersistenceManager pm, long id, long idPunto_vacunacion)
	{
		Query q = pm.newQuery(SQL, "UPDATE " + pp.darTablaLoteVacuna() + " SET punto_vacunacion = ? WHERE id = ?");
        q.setParameters(idPunto_vacunacion, id);
        return (long) q.executeUnique();
	}
	
	public long actualizarLoteVacunaPorEpsRegional(PersistenceManager pm, long id, long eps_regional)
	{
		Query q = pm.newQuery(SQL, "UPDATE " + pp.darTablaLoteVacuna() + " SET eps_regional = ? WHERE id = ?");
        q.setParameters(eps_regional, id);
        return (long) q.executeUnique();
	}
}
