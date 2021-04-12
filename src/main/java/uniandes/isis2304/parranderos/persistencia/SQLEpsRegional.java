package uniandes.isis2304.parranderos.persistencia;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.parranderos.negocio.EpsRegional;

public class SQLEpsRegional {
	
	private final static String SQL = PersistenciaVacuAndes.SQL;
	
	private PersistenciaVacuAndes pp;
	
	public SQLEpsRegional(PersistenciaVacuAndes pp)
	{
		this.pp = pp;
	}
	
	public long agregarEpsRegional(PersistenceManager pm, long id, String nombre, long departamento)
	{
		Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaEpsRegional() +"(id) VALUES (?, ?, ?)");
		q.setParameters(id, nombre, departamento);
		return (long)q.executeUnique();
	}
	
	public long eliminarEpsRegionalPorId(PersistenceManager pm, long id)
	{
		Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaEpsRegional() + " WHERE id = ?");
        q.setParameters(id);
        return (long) q.executeUnique();
	}
	
	public EpsRegional darEpsRegionalPorId (PersistenceManager pm, long id) 
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaEpsRegional() + " WHERE id = ?");
		q.setResultClass(EpsRegional.class);
		q.setParameters(id);
		return (EpsRegional) q.executeUnique();
	}
	
	public List<EpsRegional> darEpsRegionales(PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaEpsRegional());
		q.setResultClass(EpsRegional.class);
		return (List<EpsRegional>) q.executeList();
	}
	
	public long actualizarEpsRegionalPorNombre(PersistenceManager pm, long id, String nombre)
	{
		Query q = pm.newQuery(SQL, "UPDATE " + pp.darTablaEpsRegional() + " SET nombre = ? WHERE id = ?");
        q.setParameters(nombre, id);
        return (long) q.executeUnique();
	}

}
