package uniandes.isis2304.parranderos.persistencia;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.parranderos.negocio.TalentoHumano;

public class SQLTalentoHumano {
	
	private final static String SQL = PersistenciaVacuAndes.SQL;
	
	private PersistenciaVacuAndes pp;
	
	public SQLTalentoHumano(PersistenciaVacuAndes pp)
	{
		this.pp = pp;
	}
	
	public long agregarTalentoHumano(PersistenceManager pm, long id, long punto_vacunacion)
	{
		Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaTalentoHumano() +"(id, punto_vacunacion) VALUES (?, ?)");
		q.setParameters(id, punto_vacunacion);
		return (long)q.executeUnique();
	}
	
	public long eliminarTalentoHumanoPorId(PersistenceManager pm, long id)
	{
		Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaTalentoHumano() + " WHERE id = ?");
        q.setParameters(id);
        return (long) q.executeUnique();
	}
	
	public TalentoHumano darTalentoHumanoPorId (PersistenceManager pm, long id) 
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaTalentoHumano() + " WHERE id = ?");
		q.setResultClass(TalentoHumano.class);
		q.setParameters(id);
		return (TalentoHumano) q.executeUnique();
	}
	
	public List<TalentoHumano> darTalentosHumanos(PersistenceManager pm, long punto_vacunacion)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaTalentoHumano() +" WHERE punto_vacunacion = ?");
		q.setResultClass(TalentoHumano.class);
		q.setParameters(punto_vacunacion);
		return (List<TalentoHumano>) q.executeList();
	}
	
	public List<TalentoHumano> darTalentosHumanos(PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaTalentoHumano());
		q.setResultClass(TalentoHumano.class);
		return (List<TalentoHumano>) q.executeList();
	}
	
	public long actualizarTalentoHumanoPorPuntoVacunacion(PersistenceManager pm, long id, long punto_vacunacion)
	{
		Query q = pm.newQuery(SQL, "UPDATE " + pp.darTablaTalentoHumano() + " SET punto_vacunacion = ? WHERE id = ?");
        q.setParameters(punto_vacunacion);
        return (long) q.executeUnique();
	}

}
