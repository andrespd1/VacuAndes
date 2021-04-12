package uniandes.isis2304.parranderos.persistencia;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import uniandes.isis2304.parranderos.negocio.Departamento;

public class SQLDepartamento {

	private final static String SQL = PersistenciaVacuAndes.SQL;
	
	private PersistenciaVacuAndes pp;
	
	public SQLDepartamento(PersistenciaVacuAndes pp)
	{
		this.pp = pp;
	}
	
	public long agregarDepartamento(PersistenceManager pm, long id, String nombre, int cantidad_vacunados, int cantidad_no_vacunados)
	{
		Query q = pm.newQuery(SQL, "INSERT INTO " + pp.darTablaDepartamento() +"(id) VALUES (?, ?, ?, ?)");
		q.setParameters(id, nombre, cantidad_vacunados, cantidad_no_vacunados);
		return (long)q.executeUnique();
	}
	
	public long eliminarDepartamentoPorId(PersistenceManager pm, long id)
	{
		Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaDepartamento() + " WHERE id = ?");
        q.setParameters(id);
        return (long) q.executeUnique();
	}
	
	public long eliminarDepartamentoPorNombre(PersistenceManager pm, String nombre)
	{
		Query q = pm.newQuery(SQL, "DELETE FROM " + pp.darTablaDepartamento() + " WHERE nombre = ?");
        q.setParameters(nombre);
        return (long) q.executeUnique();
	}
	
	public Departamento darDepartamentoPorId (PersistenceManager pm, long id) 
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaDepartamento() + " WHERE id = ?");
		q.setResultClass(Departamento.class);
		q.setParameters(id);
		return (Departamento) q.executeUnique();
	}
	
	public Departamento darDepartamentoPorNombre (PersistenceManager pm, String nombre) 
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaDepartamento() + " WHERE nombre = ?");
		q.setResultClass(Departamento.class);
		q.setParameters(nombre);
		return (Departamento) q.executeUnique();
	}
	
	public List<Departamento> darDepartamentos(PersistenceManager pm)
	{
		Query q = pm.newQuery(SQL, "SELECT * FROM " + pp.darTablaDepartamento());
		q.setResultClass(Departamento.class);
		return (List<Departamento>) q.executeList();
	}
	
	public long actualizarDepartamentoPorAumentarCantidadVacunados(PersistenceManager pm, long id)
	{
		Query q = pm.newQuery(SQL, "UPDATE " + pp.darTablaDepartamento() + " SET cantidad_vacunados = cantidad_vacunados + 1 WHERE id = ?");
        q.setParameters(id);
        return (long) q.executeUnique();
	}
	
	public long actualizarDepartamentoPorRestarCantidadNoVacunados(PersistenceManager pm, long id)
	{
		Query q = pm.newQuery(SQL, "UPDATE " + pp.darTablaDepartamento() + " SET cantidad_no_vacunados = cantidad_no_vacunados - 1 WHERE id = ?");
        q.setParameters(id);
        return (long) q.executeUnique();
	}
	
}