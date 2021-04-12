package uniandes.isis2304.parranderos.negocio;

import java.util.List;

public interface VOAdministradorPuntoVacunacion {

	/**
	 * @return the id
	 */
	long getId();

	/**
	 * @param id the id to set
	 */
	void setId(long id);

	/**
	 * @return the agenda
	 */
	List<CitaVacunacion> getAgenda();

	/**
	 * @param agenda the agenda to set
	 */
	void setAgenda(List<CitaVacunacion> agenda);

	/**
	 * @return the punto_vacunacion
	 */
	VOPuntoVacunacion getPunto_vacunacion();

	/**
	 * @param punto_vacunacion the punto_vacunacion to set
	 */
	void setPunto_vacunacion(VOPuntoVacunacion punto_vacunacion);

}