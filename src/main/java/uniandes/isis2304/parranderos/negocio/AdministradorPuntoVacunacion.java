package uniandes.isis2304.parranderos.negocio;

import java.util.ArrayList;
import java.util.List;

public class AdministradorPuntoVacunacion extends Cargo implements VOAdministradorPuntoVacunacion {
	
	private long id;
	
	private List<CitaVacunacion> agenda;
	
	private VOPuntoVacunacion punto_vacunacion;
	
	public AdministradorPuntoVacunacion() {
		super();
		this.id = 0;
		this.agenda = new ArrayList<CitaVacunacion>();
		this.punto_vacunacion = new PuntoVacunacion();
	}

	public AdministradorPuntoVacunacion(long id, List<CitaVacunacion> agenda, VOPuntoVacunacion punto_vacunacion) {
		super();
		this.id = id;
		this.agenda = agenda;
		this.punto_vacunacion = punto_vacunacion;
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
	 * @return the agenda
	 */
	@Override
	public List<CitaVacunacion> getAgenda() {
		return agenda;
	}

	/**
	 * @param agenda the agenda to set
	 */
	@Override
	public void setAgenda(List<CitaVacunacion> agenda) {
		this.agenda = agenda;
	}

	/**
	 * @return the punto_vacunacion
	 */
	@Override
	public VOPuntoVacunacion getPunto_vacunacion() {
		return punto_vacunacion;
	}

	/**
	 * @param punto_vacunacion the punto_vacunacion to set
	 */
	@Override
	public void setPunto_vacunacion(VOPuntoVacunacion punto_vacunacion) {
		this.punto_vacunacion = punto_vacunacion;
	}
	
	

}
