package uniandes.isis2304.parranderos.negocio;

import java.util.ArrayList;
import java.util.List;

public class Departamento implements VODepartamento {
	
	private long id;
	
	private String nombre;
	
	private int cantidad_vacunados;
	
	private int cantidad_no_vacunados;
	
	private List<EpsRegional> eps_regionales;
	
	public Departamento() {
		this.id = 0;
		this.nombre = "";
		this.cantidad_vacunados = 0;
		this.cantidad_no_vacunados = 0;
		this.eps_regionales = new ArrayList();
	}

	public Departamento(long id, String nombre, int cantidad_vacunados, int cantidad_no_vacunados,
			List<EpsRegional> eps_regionales) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cantidad_vacunados = cantidad_vacunados;
		this.cantidad_no_vacunados = cantidad_no_vacunados;
		this.eps_regionales = eps_regionales;
	}

	/**
	 * @return the id
	 */
	@Override
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	@Override
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	@Override
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the cantidad_vacunados
	 */
	@Override
	public int getCantidad_vacunados() {
		return cantidad_vacunados;
	}

	/**
	 * @param cantidad_vacunados the cantidad_vacunados to set
	 */
	@Override
	public void setCantidad_vacunados(int cantidad_vacunados) {
		this.cantidad_vacunados = cantidad_vacunados;
	}

	/**
	 * @return the cantidad_no_vacunados
	 */
	@Override
	public int getCantidad_no_vacunados() {
		return cantidad_no_vacunados;
	}

	/**
	 * @param cantidad_no_vacunados the cantidad_no_vacunados to set
	 */
	@Override
	public void setCantidad_no_vacunados(int cantidad_no_vacunados) {
		this.cantidad_no_vacunados = cantidad_no_vacunados;
	}

	/**
	 * @return the eps_regionales
	 */
	@Override
	public List<EpsRegional> getEps_regionales() {
		return eps_regionales;
	}

	/**
	 * @param eps_regionales the eps_regionales to set
	 */
	@Override
	public void setEps_regionales(List<EpsRegional> eps_regionales) {
		this.eps_regionales = eps_regionales;
	} 
	
	

}
