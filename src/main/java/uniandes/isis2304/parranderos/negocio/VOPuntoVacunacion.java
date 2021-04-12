package uniandes.isis2304.parranderos.negocio;

public interface VOPuntoVacunacion {

	/**
	 * @return the id
	 */
	long getId();

	/**
	 * @param id the id to set
	 */
	void setId(long id);

	/**
	 * @return the localizacion
	 */
	String getLocalizacion();

	/**
	 * @param localizacion the localizacion to set
	 */
	void setLocalizacion(String localizacion);

	/**
	 * @return the capacidad_atencion_simultanea
	 */
	int getCapacidad_atencion_simultanea();

	/**
	 * @param capacidad_atencion_simultanea the capacidad_atencion_simultanea to set
	 */
	void setCapacidad_atencion_simultanea(int capacidad_atencion_simultanea);

	/**
	 * @return the capacidad_atencion_diaria
	 */
	int getCapacidad_atencion_diaria();

	/**
	 * @param capacidad_atencion_diaria the capacidad_atencion_diaria to set
	 */
	void setCapacidad_atencion_diaria(int capacidad_atencion_diaria);

	/**
	 * @return the comdiciones_preservacion
	 */
	String getComdiciones_preservacion();

	/**
	 * @param comdiciones_preservacion the comdiciones_preservacion to set
	 */
	void setComdiciones_preservacion(String comdiciones_preservacion);

	/**
	 * @return the capacidad_vacunas
	 */
	int getCapacidad_vacunas();

	/**
	 * @param capacidad_vacunas the capacidad_vacunas to set
	 */
	void setCapacidad_vacunas(int capacidad_vacunas);

	/**
	 * @return the cantidad_vacunados
	 */
	int getCantidad_vacunados();

	/**
	 * @param cantidad_vacunados the cantidad_vacunados to set
	 */
	void setCantidad_vacunados(int cantidad_vacunados);

}