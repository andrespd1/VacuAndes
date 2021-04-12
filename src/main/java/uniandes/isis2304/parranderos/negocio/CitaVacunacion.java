package uniandes.isis2304.parranderos.negocio;

import java.util.Date;

public class CitaVacunacion implements VOCitaVacunacion {
	
	private long id;
	
	private Date fecha;
	
	private VOPuntoVacunacion punto_vacunacion;
	
	private VOCiudadano ciudadano;

	public CitaVacunacion() {
		super();
		this.id = 0;
		this.fecha = new Date();
		this.punto_vacunacion = new PuntoVacunacion();
		this.ciudadano = new Ciudadano();
	}
	
	public CitaVacunacion(long id, Date fecha, VOPuntoVacunacion punto_vacunacion, VOCiudadano ciudadano) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.punto_vacunacion = punto_vacunacion;
		this.ciudadano = ciudadano;
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
	 * @return the fecha
	 */
	@Override
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	@Override
	public void setFecha(Date fecha) {
		this.fecha = fecha;
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

	/**
	 * @return the ciudadano
	 */
	@Override
	public VOCiudadano getCiudadano() {
		return ciudadano;
	}

	/**
	 * @param ciudadano the ciudadano to set
	 */
	@Override
	public void setCiudadano(VOCiudadano ciudadano) {
		this.ciudadano = ciudadano;
	}
	
	
}
