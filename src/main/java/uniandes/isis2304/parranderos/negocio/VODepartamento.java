package uniandes.isis2304.parranderos.negocio;

import java.util.List;

public interface VODepartamento {

	/**
	 * @return the id
	 */
	long getId();

	/**
	 * @param id the id to set
	 */
	void setId(long id);

	/**
	 * @return the nombre
	 */
	String getNombre();

	/**
	 * @param nombre the nombre to set
	 */
	void setNombre(String nombre);

	/**
	 * @return the cantidad_vacunados
	 */
	int getCantidad_vacunados();

	/**
	 * @param cantidad_vacunados the cantidad_vacunados to set
	 */
	void setCantidad_vacunados(int cantidad_vacunados);

	/**
	 * @return the cantidad_no_vacunados
	 */
	int getCantidad_no_vacunados();

	/**
	 * @param cantidad_no_vacunados the cantidad_no_vacunados to set
	 */
	void setCantidad_no_vacunados(int cantidad_no_vacunados);

	/**
	 * @return the eps_regionales
	 */
	List<EpsRegional> getEps_regionales();

	/**
	 * @param eps_regionales the eps_regionales to set
	 */
	void setEps_regionales(List<EpsRegional> eps_regionales);

}