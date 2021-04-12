package uniandes.isis2304.parranderos.negocio;

import java.util.ArrayList;
import java.util.List;

public class LoteVacuna implements VOLoteVacuna {
	
	private long id;
	
	private String laboratorio;
	
	private String condiciones_preservacion;
	
	private int cantidad_vacunas;
	
	private List<Vacuna> vacunas;
	
	public LoteVacuna() {
		super();
		this.id = 0;
		this.laboratorio = "";
		this.condiciones_preservacion = "";
		this.cantidad_vacunas = 0;
		this.vacunas = new ArrayList<Vacuna>();
	}

	public LoteVacuna(long id, String laboratorio, String condiciones_preservacion, int cantidad_vacunas,
			List<Vacuna> vacunas) {
		super();
		this.id = id;
		this.laboratorio = laboratorio;
		this.condiciones_preservacion = condiciones_preservacion;
		this.cantidad_vacunas = cantidad_vacunas;
		this.vacunas = vacunas;
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
	 * @return the cantidad_vacunas
	 */
	@Override
	public int getCantidad_vacunas() {
		return cantidad_vacunas;
	}

	/**
	 * @param cantidad_vacunas the cantidad_vacunas to set
	 */
	@Override
	public void setCantidad_vacunas(int cantidad_vacunas) {
		this.cantidad_vacunas = cantidad_vacunas;
	}

	/**
	 * @return the vacunas
	 */
	@Override
	public List<Vacuna> getVacunas() {
		return vacunas;
	}

	/**
	 * @param vacunas the vacunas to set
	 */
	@Override
	public void setVacunas(List<Vacuna> vacunas) {
		this.vacunas = vacunas;
	}
	
	

}
