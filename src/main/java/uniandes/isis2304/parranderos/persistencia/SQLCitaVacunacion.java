package uniandes.isis2304.parranderos.persistencia;

import java.sql.Timestamp;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.parranderos.negocio.CitaVacunacion;

public class SQLCitaVacunacion {
	
	private final static String SQL = PersistenciaVacuAndes.SQL;
	
	private PersistenciaVacuAndes pp;
	
	public SQLCitaVacunacion(PersistenciaVacuAndes pp)
	{
		this.pp = pp;
	}

	public long agregarCitaVacunacion(PersistenceManager pm, long id_ciudadano, long punto_vacunacion, Timestamp fecha, long administradorPuntoVacunacion)
	{
		Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaCitaVacunacion() +"(id_ciudadano, punto_vacunacion, fecha, administradorPuntoVacunacion) VALUES (?, ?, ?, ?)");
		q.setParameters(id_ciudadano, punto_vacunacion, fecha, administradorPuntoVacunacion);
		return (long)q.executeUnique();
	}
	
	public long eliminarCitaVacunacionPorId(PersistenceManager pm, long id)
	{
		Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaCitaVacunacion() + " WHERE id = ?");
        q.setParameters(id);
        return (long) q.executeUnique();
	}
	
	public CitaVacunacion darCitaVacunacionPorId (PersistenceManager pm, long id) 
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaCitaVacunacion() + " WHERE id = ?");
		q.setResultClass(CitaVacunacion.class);
		q.setParameters(id);
		return (CitaVacunacion) q.executeUnique();
	}
	
	public List<CitaVacunacion> darCitaVacunaciones(PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaCitaVacunacion());
		q.setResultClass(CitaVacunacion.class);
		return (List<CitaVacunacion>) q.executeList();
	}
	
	public long actualizarCitaVacunacionPorFecha(PersistenceManager pm, long id, Timestamp fecha)
	{
		Query q = pm.newQuery(SQL, "UPDATE " + pp.darTablaCitaVacunacion() + " SET fecha = ? WHERE id = ?");
        q.setParameters(fecha, id);
        return (long) q.executeUnique();
	}
	
	public long actualizarCitaVacunacionPorPuntoVacunacion(PersistenceManager pm, long id, long idPunto_vacunacion)
	{
		Query q = pm.newQuery(SQL, "UPDATE " + pp.darTablaCitaVacunacion() + " SET punto_vacunacion = ? WHERE id = ?");
        q.setParameters(idPunto_vacunacion, id);
        return (long) q.executeUnique();
	}
}
