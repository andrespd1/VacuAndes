package uniandes.isis2304.parranderos.negocio;

import java.util.Date;

public interface VOCitaVacunacion {

	/**
	 * @return the id
	 */
	long getId();

	/**
	 * @param id the id to set
	 */
	void setId(long id);

	/**
	 * @return the fecha
	 */
	Date getFecha();

	/**
	 * @param fecha the fecha to set
	 */
	void setFecha(Date fecha);

	/**
	 * @return the punto_vacunacion
	 */
	VOPuntoVacunacion getPunto_vacunacion();

	/**
	 * @param punto_vacunacion the punto_vacunacion to set
	 */
	void setPunto_vacunacion(VOPuntoVacunacion punto_vacunacion);

	/**
	 * @return the ciudadano
	 */
	VOCiudadano getCiudadano();

	/**
	 * @param ciudadano the ciudadano to set
	 */
	void setCiudadano(VOCiudadano ciudadano);

}