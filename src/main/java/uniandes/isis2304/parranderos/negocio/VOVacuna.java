package uniandes.isis2304.parranderos.negocio;

public interface VOVacuna {

	/**
	 * @return the id
	 */
	long getId();

	/**
	 * @param id the id to set
	 */
	void setId(long id);

	/**
	 * @return the laboratorio
	 */
	String getLaboratorio();

	/**
	 * @param laboratorio the laboratorio to set
	 */
	void setLaboratorio(String laboratorio);

	/**
	 * @return the condiciones_preservacion
	 */
	String getCondiciones_preservacion();

	/**
	 * @param condiciones_preservacion the condiciones_preservacion to set
	 */
	void setCondiciones_preservacion(String condiciones_preservacion);

	/**
	 * @return the lote_vacuna
	 */
	VOLoteVacuna getLote_vacuna();

	/**
	 * @param lote_vacuna the lote_vacuna to set
	 */
	void setLote_vacuna(VOLoteVacuna lote_vacuna);

}