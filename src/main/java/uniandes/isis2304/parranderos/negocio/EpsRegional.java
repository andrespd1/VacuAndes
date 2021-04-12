package uniandes.isis2304.parranderos.negocio;

import java.util.ArrayList;
import java.util.List;

public class EpsRegional implements VOEpsRegional {
	
	private long id;
	
	private String nombre;
	
	private VODepartamento municipio;
	
	private VOAdministradorOficinaEps administradorOficinaEps;
	
	private List<LoteVacuna> lotes_vacunas;

	public EpsRegional() {
		super();
		this.id = 0;
		this.nombre = "";
		this.municipio = new Departamento();
		this.administradorOficinaEps = new AdministradorOficinaEps();
		this.lotes_vacunas = new ArrayList<LoteVacuna>();
	}
	
	public EpsRegional(long id, String nombre, VODepartamento municipio, VOAdministradorOficinaEps administradorOficinaEps,
			List<LoteVacuna> lotes_vacunas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.municipio = municipio;
		this.administradorOficinaEps = administradorOficinaEps;
		this.lotes_vacunas = lotes_vacunas;
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
	 * @return the municipio
	 */
	@Override
	public VODepartamento getMunicipio() {
		return municipio;
	}

	/**
	 * @param municipio the municipio to set
	 */
	@Override
	public void setMunicipio(VODepartamento municipio) {
		this.municipio = municipio;
	}

	/**
	 * @return the administradorOficinaEps
	 */
	@Override
	public VOAdministradorOficinaEps getAdministradorOficinaEps() {
		return administradorOficinaEps;
	}

	/**
	 * @param administradorOficinaEps the administradorOficinaEps to set
	 */
	@Override
	public void setAdministradorOficinaEps(VOAdministradorOficinaEps administradorOficinaEps) {
		this.administradorOficinaEps = administradorOficinaEps;
	}

	/**
	 * @return the lotes_vacunas
	 */
	@Override
	public List<LoteVacuna> getLotes_vacunas() {
		return lotes_vacunas;
	}

	/**
	 * @param lotes_vacunas the lotes_vacunas to set
	 */
	@Override
	public void setLotes_vacunas(List<LoteVacuna> lotes_vacunas) {
		this.lotes_vacunas = lotes_vacunas;
	}
	
	
	
}
