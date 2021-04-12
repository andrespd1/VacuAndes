package uniandes.isis2304.parranderos.negocio;

public class Vacuna implements VOVacuna {

	private long id;
	
	private String laboratorio;
	
	private String condiciones_preservacion;
	
	private VOLoteVacuna lote_vacuna;
	
	public Vacuna() {
		super();
		this.id = 0;
		this.laboratorio = "";
		this.condiciones_preservacion = "";
		this.lote_vacuna = new LoteVacuna();
	}

	public Vacuna(long id, String laboratorio, String condiciones_preservacion, VOLoteVacuna lote_vacuna) {
		super();
		this.id = id;
		this.laboratorio = laboratorio;
		this.condiciones_preservacion = condiciones_preservacion;
		this.lote_vacuna = lote_vacuna;
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
	 * @return the laboratorio
	 */
	@Override
	public String getLaboratorio() {
		return laboratorio;
	}

	/**
	 * @param laboratorio the laboratorio to set
	 */
	@Override
	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	/**
	 * @return the condiciones_preservacion
	 */
	@Override
	public String getCondiciones_preservacion() {
		return condiciones_preservacion;
	}

	/**
	 * @param condiciones_preservacion the condiciones_preservacion to set
	 */
	@Override
	public void setCondiciones_preservacion(String condiciones_preservacion) {
		this.condiciones_preservacion = condiciones_preservacion;
	}

	/**
	 * @return the lote_vacuna
	 */
	@Override
	public VOLoteVacuna getLote_vacuna() {
		return lote_vacuna;
	}

	/**
	 * @param lote_vacuna the lote_vacuna to set
	 */
	@Override
	public void setLote_vacuna(VOLoteVacuna lote_vacuna) {
		this.lote_vacuna = lote_vacuna;
	}
	
	
	
}
