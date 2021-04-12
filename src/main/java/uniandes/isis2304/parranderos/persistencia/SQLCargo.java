package uniandes.isis2304.parranderos.persistencia;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.parranderos.negocio.Cargo;

public class SQLCargo {
	
	private final static String SQL = PersistenciaVacuAndes.SQL;
	
	private PersistenciaVacuAndes pp;
	
	public SQLCargo(PersistenciaVacuAndes pp)
	{
		this.pp = pp;
	}
	
	public long agregarCargo(PersistenceManager pm, long id)
	{
		Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaCargo() +"(id) VALUES (?)");
		q.setParameters(id);
		return (long)q.executeUnique();
	}
	
	public long eliminarCargoPorId(PersistenceManager pm, long id)
	{
		Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaCargo() + " WHERE id = ?");
        q.setParameters(id);
        return (long) q.executeUnique();
	}
	
	public Cargo darCargoPorId (PersistenceManager pm, long id) 
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaCargo() + " WHERE id = ?");
		q.setResultClass(Cargo.class);
		q.setParameters(id);
		return (Cargo) q.executeUnique();
	}
	
	public List<Cargo> darCargos(PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaCargo());
		q.setResultClass(Cargo.class);
		return (List<Cargo>) q.executeList();
	}
	
	public long actualizarCargoPorId(PersistenceManager pm, long id, long idEps_regional)
	{
		Query q = pm.newQuery(SQL, "UPDATE " + pp.darTablaCargo() + " SET id = ? WHERE id = ?");
        q.setParameters(id);
        return (long) q.executeUnique();
	}

}
