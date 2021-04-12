package uniandes.isis2304.parranderos.persistencia;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.parranderos.negocio.Vacuna;

public class SQLVacuna {
	
	private final static String SQL = PersistenciaVacuAndes.SQL;
	
	private PersistenciaVacuAndes pp;
	
	public SQLVacuna(PersistenciaVacuAndes pp)
	{
		this.pp = pp;
	}
	
	public long agregarVacuna(PersistenceManager pm, long id, String laboratorio, String condiciones_preservacion, long lote_vacuna)
	{
		Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaVacuna() +"(id, laboraotio, condiciones_preservacion, lote_vacuna) VALUES (?, ?, ?, ?)");
		q.setParameters(id, laboratorio, condiciones_preservacion, lote_vacuna);
		return (long)q.executeUnique();
	}
	
	public long eliminarVacunaPorId(PersistenceManager pm, long id)
	{
		Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaVacuna() + " WHERE id = ?");
        q.setParameters(id);
        return (long) q.executeUnique();
	}
	
	public Vacuna darVacunaPorId (PersistenceManager pm, long id) 
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaVacuna() + " WHERE id = ?");
		q.setResultClass(Vacuna.class);
		q.setParameters(id);
		return (Vacuna) q.executeUnique();
	}
	
	public List<Vacuna> darVacunasPorLaboratorio(PersistenceManager pm, String laboratorio)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaVacuna() +" WHERE laboratorio = ?");
		q.setResultClass(Vacuna.class);
		q.setParameters(laboratorio);
		return (List<Vacuna>) q.executeList();
	}
	
	public List<Vacuna> darVacunasPorLoteVacuna(PersistenceManager pm, long lote_vacuna)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaVacuna() +" WHERE lote_vacuna = ?");
		q.setResultClass(Vacuna.class);
		q.setParameters(lote_vacuna);
		return (List<Vacuna>) q.executeList();
	}
	
	public List<Vacuna> darVacunas(PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaVacuna());
		q.setResultClass(Vacuna.class);
		return (List<Vacuna>) q.executeList();
	}
	
	public long actualizarVacunaPorCondicionesPreservacion(PersistenceManager pm, long id, String cantidad_preservacion)
	{
		Query q = pm.newQuery(SQL, "UPDATE " + pp.darTablaVacuna() + " SET condiciones_preservacion = ? WHERE id = ?");
        q.setParameters(id);
        return (long) q.executeUnique();
	}

}
