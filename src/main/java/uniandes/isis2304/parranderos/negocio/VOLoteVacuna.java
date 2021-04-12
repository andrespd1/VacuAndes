package uniandes.isis2304.parranderos.negocio;

import java.util.List;

public interface VOLoteVacuna {

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
	 * @return the cantidad_vacunas
	 */
	int getCantidad_vacunas();

	/**
	 * @param cantidad_vacunas the cantidad_vacunas to set
	 */
	void setCantidad_vacunas(int cantidad_vacunas);

	/**
	 * @return the vacunas
	 */
	List<Vacuna> getVacunas();

	/**
	 * @param vacunas the vacunas to set
	 */
	void setVacunas(List<Vacuna> vacunas);

}