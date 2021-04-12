package uniandes.isis2304.parranderos.persistencia;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.parranderos.negocio.AdministradorPuntoVacunacion;

public class SQLAdministradorPuntoVacunacion {
	
	private final static String SQL = PersistenciaVacuAndes.SQL;
	
	private PersistenciaVacuAndes pp;
	
	public SQLAdministradorPuntoVacunacion(PersistenciaVacuAndes pp)
	{
		this.pp = pp;
	}
	
	public long agregarAdministradorPuntoVacunacion(PersistenceManager pm, long id, long idPunto_vacunacion)
	{
		Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaAdministradorPuntoVacunacion() +"(id, punto_vacunacion) VALUES (?, ?)");
		q.setParameters(id, idPunto_vacunacion);
		return (long)q.executeUnique();
	}
	
	public long eliminarAdministradorPuntoVacunacionPorId(PersistenceManager pm, long id)
	{
		Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaAdministradorPuntoVacunacion() + " WHERE id = ?");
        q.setParameters(id);
        return (long) q.executeUnique();
	}
	
	public AdministradorPuntoVacunacion darAdiministradorPlanVacunacionPorId (PersistenceManager pm, long id) 
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaAdministradorPuntoVacunacion() + " WHERE id = ?");
		q.setResultClass(AdministradorPuntoVacunacion.class);
		q.setParameters(id);
		return (AdministradorPuntoVacunacion) q.executeUnique();
	}
	
	public List<AdministradorPuntoVacunacion> darAdministradoresPuntoVacunacion(PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaAdministradorPuntoVacunacion());
		q.setResultClass(AdministradorPuntoVacunacion.class);
		return (List<AdministradorPuntoVacunacion>) q.executeList();
	}
	
	public long actualizarAdministradorPuntoVacunacionPorId(PersistenceManager pm, long id, long idPunto_vacunacion)
	{
		Query q = pm.newQuery(SQL, "UPDATE " + pp.darTablaAdministradorPuntoVacunacion() + " SET punto_vacunacion = ? WHERE id = ?");
        q.setParameters(idPunto_vacunacion, id);
        return (long) q.executeUnique();
	}

}
