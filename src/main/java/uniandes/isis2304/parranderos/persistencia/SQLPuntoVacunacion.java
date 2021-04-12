package uniandes.isis2304.parranderos.persistencia;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.parranderos.negocio.PuntoVacunacion;

public class SQLPuntoVacunacion {
	
	private final static String SQL = PersistenciaVacuAndes.SQL;
	
	private PersistenciaVacuAndes pp;
	
	public SQLPuntoVacunacion(PersistenciaVacuAndes pp)
	{
		this.pp = pp;
	}
	
	public long agregarPuntoVacunacion(PersistenceManager pm, long id, String localizacion, int capacidad_atencion_simultanea, int capacidad_atencion_diaria, String condiciones_preservacion, int capacidad_vacunas, int cantidad_vacunados, long administradorOficinaEps, long departamento)
	{
		Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaPuntoVacunacion() +"(id, localizacion, capacidad_atencion_simultanea, capacidad_atencion_diaria, condiciones_preservacion, cantidad_vacunados, administradorOficinaEps, departamento) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");
		q.setParameters(id, localizacion, capacidad_atencion_simultanea, capacidad_atencion_diaria, condiciones_preservacion, capacidad_vacunas, cantidad_vacunados, administradorOficinaEps, departamento);
		return (long)q.executeUnique();
	}
	
	public long eliminarPuntoVacunacionPorId(PersistenceManager pm, long id)
	{
		Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaPuntoVacunacion() + " WHERE id = ?");
        q.setParameters(id);
        return (long) q.executeUnique();
	}
	
	public PuntoVacunacion darPuntoVacunacionPorId (PersistenceManager pm, long id) 
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaPuntoVacunacion() + " WHERE id = ?");
		q.setResultClass(PuntoVacunacion.class);
		q.setParameters(id);
		return (PuntoVacunacion) q.executeUnique();
	}
	
	public List<PuntoVacunacion> darPuntosVacunacionPorLocalizacion(PersistenceManager pm, String localizacion)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaPuntoVacunacion()+" WHERE localizacion = ?");
		q.setResultClass(PuntoVacunacion.class);
		q.setParameters(localizacion);
		return (List<PuntoVacunacion>) q.executeList();
	}
	
	public List<PuntoVacunacion> darPuntosVacunacionPorDepartamento(PersistenceManager pm, long departamento)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaPuntoVacunacion()+" WHERE departamento = ?");
		q.setResultClass(PuntoVacunacion.class);
		q.setParameters(departamento);
		return (List<PuntoVacunacion>) q.executeList();
	}
	
	public List<PuntoVacunacion> darPuntosVacunacion(PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaPuntoVacunacion());
		q.setResultClass(PuntoVacunacion.class);
		return (List<PuntoVacunacion>) q.executeList();
	}
	
	public long actualizarPuntoVacunacionPorCapacidadSimultanea(PersistenceManager pm, long id, int capacidad_atencion_simultanea)
	{
		Query q = pm.newQuery(SQL, "UPDATE " + pp.darTablaPuntoVacunacion() + " SET capacidad_atencion_simultanea = ? WHERE id = ?");
        q.setParameters(capacidad_atencion_simultanea, id);
        return (long) q.executeUnique();
	}
	
	public long actualizarPuntoVacunacionPorCapacidadDiaria(PersistenceManager pm, long id, int capacidad_atencion_diaria)
	{
		Query q = pm.newQuery(SQL, "UPDATE " + pp.darTablaPuntoVacunacion() + " SET capacidad_atencion_diaria = ? WHERE id = ?");
        q.setParameters(capacidad_atencion_diaria, id);
        return (long) q.executeUnique();
	}

	public long actualizarPuntoVacunacionPorCapacidadVacunas(PersistenceManager pm, long id, int capacidad_vacunas)
	{
		Query q = pm.newQuery(SQL, "UPDATE " + pp.darTablaPuntoVacunacion() + " SET capacidad_vacunas = ? WHERE id = ?");
        q.setParameters(capacidad_vacunas, id);
        return (long) q.executeUnique();
	}
	
	public long actualizarPuntoVacunacionPorCantidadVacunados(PersistenceManager pm, long id)
	{
		Query q = pm.newQuery(SQL, "UPDATE " + pp.darTablaPuntoVacunacion() + " SET cantidad_vacunados = cantidad_vacunados + 1 WHERE id = ?");
        q.setParameters(id);
        return (long) q.executeUnique();
	}
	
	public long actualizarPuntoVacunacionPorAdministradorOficinaEps(PersistenceManager pm, long id, long administradorOficinaEps)
	{
		Query q = pm.newQuery(SQL, "UPDATE " + pp.darTablaPuntoVacunacion() + " SET administradorOficinaEps = ? WHERE id = ?");
        q.setParameters(administradorOficinaEps, id);
        return (long) q.executeUnique();
	}
	
}
