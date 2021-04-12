package uniandes.isis2304.parranderos.negocio;

import java.util.List;

public interface VOAdministradorOficinaEps {

	/**
	 * @return the id
	 */
	long getId();

	/**
	 * @param id the id to set
	 */
	void setId(long id);

	/**
	 * @return the eps_regional
	 */
	VOEpsRegional getEps_regional();

	/**
	 * @param eps_regional the eps_regional to set
	 */
	void setEps_regional(VOEpsRegional eps_regional);

	/**
	 * @return the puntos_vacunacion
	 */
	List<PuntoVacunacion> getPuntos_vacunacion();

	/**
	 * @param puntos_vacunacion the puntos_vacunacion to set
	 */
	void setPuntos_vacunacion(List<PuntoVacunacion> puntos_vacunacion);

}