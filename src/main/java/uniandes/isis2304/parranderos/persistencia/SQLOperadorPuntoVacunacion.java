package uniandes.isis2304.parranderos.persistencia;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.parranderos.negocio.OperadorPuntoVacunacion;

public class SQLOperadorPuntoVacunacion {
	
	private final static String SQL = PersistenciaVacuAndes.SQL;
	
	private PersistenciaVacuAndes pp;
	
	public SQLOperadorPuntoVacunacion(PersistenciaVacuAndes pp)
	{
		this.pp = pp;
	}
	
	public long agregarOperadorPuntoVacunacion(PersistenceManager pm, long id, long punto_vacunacion)
	{
		Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaOperadorPuntoVacunacion() +"(id, punto_vacunacion) VALUES (?, ?)");
		q.setParameters(id, punto_vacunacion);
		return (long)q.executeUnique();
	}
	
	public long eliminarOperadorPuntoVacunacionPorId(PersistenceManager pm, long id)
	{
		Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaOperadorPuntoVacunacion() + " WHERE id = ?");
        q.setParameters(id);
        return (long) q.executeUnique();
	}
	
	public OperadorPuntoVacunacion darOperadorPuntoVacunacionPorId (PersistenceManager pm, long id) 
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaOperadorPuntoVacunacion() + " WHERE id = ?");
		q.setResultClass(OperadorPuntoVacunacion.class);
		q.setParameters(id);
		return (OperadorPuntoVacunacion) q.executeUnique();
	}
	
	public OperadorPuntoVacunacion darOperadorPuntoVacunacionPorPuntoVacunacion (PersistenceManager pm, long punto_vacunacion) 
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaOperadorPuntoVacunacion() + " WHERE id = ?");
		q.setResultClass(OperadorPuntoVacunacion.class);
		q.setParameters(punto_vacunacion);
		return (OperadorPuntoVacunacion) q.executeUnique();
	}
	
	public List<OperadorPuntoVacunacion> darOperadorPuntoVacunacions(PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaOperadorPuntoVacunacion());
		q.setResultClass(OperadorPuntoVacunacion.class);
		return (List<OperadorPuntoVacunacion>) q.executeList();
	}
	
	public long actualizarOperadorPuntoVacunacionPorPuntoVacunacion(PersistenceManager pm, long id, long punto_vacunacion)
	{
		Query q = pm.newQuery(SQL, "UPDATE " + pp.darTablaOperadorPuntoVacunacion() + " SET punto_vacuacion = ? WHERE id = ?");
        q.setParameters(punto_vacunacion, id);
        return (long) q.executeUnique();
	}

}
