package uniandes.isis2304.parranderos.negocio;

public class OperadorPuntoVacunacion extends Cargo implements VOOperadorPuntoVacunacion {
	
	private long id;
	
	private VOPuntoVacunacion punto_vacunacion;

	public OperadorPuntoVacunacion() {
		super();
		this.id = 0;
		this.punto_vacunacion = new PuntoVacunacion();
	}
	
	public OperadorPuntoVacunacion(long id, VOPuntoVacunacion punto_vacunacion) {
		super();
		this.id = id;
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
