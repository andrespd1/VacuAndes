package uniandes.isis2304.parranderos.negocio;

import java.util.ArrayList;
import java.util.List;

public class AdministradorOficinaEps extends Cargo implements VOAdministradorOficinaEps {
	
	private long id;

	private VOEpsRegional eps_regional;
	
	private List<PuntoVacunacion> puntos_vacunacion;

	public AdministradorOficinaEps() {
		super();
		this.id = 0;
		this.eps_regional = new EpsRegional();
		this.puntos_vacunacion = new ArrayList<PuntoVacunacion>();
	}
	
	public AdministradorOficinaEps(long id, VOEpsRegional eps_regional, List<PuntoVacunacion> puntos_vacunacion) {
		super();
		this.id = id;
		this.eps_regional = eps_regional;
		this.puntos_vacunacion = puntos_vacunacion;
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
	 * @return the eps_regional
	 */
	@Override
	public VOEpsRegional getEps_regional() {
		return eps_regional;
	}

	/**
	 * @param eps_regional the eps_regional to set
	 */
	@Override
	public void setEps_regional(VOEpsRegional eps_regional) {
		this.eps_regional = eps_regional;
	}

	/**
	 * @return the puntos_vacunacion
	 */
	@Override
	public List<PuntoVacunacion> getPuntos_vacunacion() {
		return puntos_vacunacion;
	}

	/**
	 * @param puntos_vacunacion the puntos_vacunacion to set
	 */
	@Override
	public void setPuntos_vacunacion(List<PuntoVacunacion> puntos_vacunacion) {
		this.puntos_vacunacion = puntos_vacunacion;
	}
	
	
}
