package uniandes.isis2304.parranderos.negocio;

import java.util.List;

public interface VOEpsRegional {

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
	 * @return the municipio
	 */
	VODepartamento getMunicipio();

	/**
	 * @param municipio the municipio to set
	 */
	void setMunicipio(VODepartamento municipio);

	/**
	 * @return the administradorOficinaEps
	 */
	VOAdministradorOficinaEps getAdministradorOficinaEps();

	/**
	 * @param administradorOficinaEps the administradorOficinaEps to set
	 */
	void setAdministradorOficinaEps(VOAdministradorOficinaEps administradorOficinaEps);

	/**
	 * @return the lotes_vacunas
	 */
	List<LoteVacuna> getLotes_vacunas();

	/**
	 * @param lotes_vacunas the lotes_vacunas to set
	 */
	void setLotes_vacunas(List<LoteVacuna> lotes_vacunas);

}