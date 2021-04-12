package uniandes.isis2304.parranderos.negocio;

public interface VOCiudadano {

	/**
	 * @return the identificacion
	 */
	String getIdentificacion();

	/**
	 * @param identificacion the identificacion to set
	 */
	void setIdentificacion(String identificacion);

	/**
	 * @return the nombre
	 */
	String getNombre();

	/**
	 * @param nombre the nombre to set
	 */
	void setNombre(String nombre);

	/**
	 * @return the edad
	 */
	int getEdad();

	/**
	 * @param edad the edad to set
	 */
	void setEdad(int edad);

	/**
	 * @return the etapa
	 */
	int getEtapa();

	/**
	 * @param etapa the etapa to set
	 */
	void setEtapa(int etapa);

	/**
	 * @return the municipio
	 */
	VODepartamento getMunicipio();

	/**
	 * @param municipio the municipio to set
	 */
	void setMunicipio(VODepartamento municipio);

	/**
	 * @return the eps_regional
	 */
	VOEpsRegional getEps_regional();

	/**
	 * @param eps_regional the eps_regional to set
	 */
	void setEps_regional(VOEpsRegional eps_regional);

	/**
	 * @return the estado
	 */
	String getEstado();

	/**
	 * @param estado the estado to set
	 */
	void setEstado(String estado);

	/**
	 * @return the disposicion
	 */
	boolean isDisposicion();

	/**
	 * @param disposicion the disposicion to set
	 */
	void setDisposicion(boolean disposicion);

	/**
	 * @return the cita_vacunacion
	 */
	VOCitaVacunacion getCita_vacunacion();

	/**
	 * @param cita_vacunacion the cita_vacunacion to set
	 */
	void setCita_vacunacion(VOCitaVacunacion cita_vacunacion);

}