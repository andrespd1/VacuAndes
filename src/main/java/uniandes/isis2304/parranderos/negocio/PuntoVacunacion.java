package uniandes.isis2304.parranderos.negocio;

import java.util.ArrayList;
import java.util.List;

public class PuntoVacunacion implements VOPuntoVacunacion {
	
	private long id;
	
	private String localizacion;
	
	private int capacidad_atencion_simultanea;
	
	private int capacidad_atencion_diaria;
	
	private String comdiciones_preservacion;
	
	private int capacidad_vacunas;
	
	private int cantidad_vacunados;

	private List<LoteVacuna> lotes_vacunas;
	
	private VODepartamento municipio;
	
	private List<TalentoHumano> talento_humano;
	
	private VOAdministradorPuntoVacunacion administradorPuntoVacunacion;
	
	private VOOperadorPuntoVacunacion operadorPuntoVacunacion;
	
	private List<Ciudadano> ciudadanos;
	
	public PuntoVacunacion() {
		super();
		this.id = 0;
		this.localizacion = "";
		this.capacidad_atencion_simultanea = 0;
		this.capacidad_atencion_diaria = 0;
		this.comdiciones_preservacion = "";
		this.capacidad_vacunas = 0;
		this.cantidad_vacunados = 0;
		this.lotes_vacunas = new ArrayList<LoteVacuna>();
		this.municipio = new Departamento();
		this.talento_humano = new ArrayList<TalentoHumano>();
		this.administradorPuntoVacunacion = new AdministradorPuntoVacunacion();
		this.operadorPuntoVacunacion = new OperadorPuntoVacunacion();
		this.ciudadanos = new ArrayList<Ciudadano>();
	}
	
	public PuntoVacunacion(long id, String localizacion, int capacidad_atencion_simultanea,
			int capacidad_atencion_diaria, String comdiciones_preservacion, int capacidad_vacunas,
			int cantidad_vacunados, List<LoteVacuna> lotes_vacunas, VODepartamento municipio,
			List<TalentoHumano> talento_humano, VOAdministradorPuntoVacunacion administradorPuntoVacunacion,
			VOOperadorPuntoVacunacion operadorPuntoVacunacion, List<Ciudadano> ciudadanos) {
		super();
		this.id = id;
		this.localizacion = localizacion;
		this.capacidad_atencion_simultanea = capacidad_atencion_simultanea;
		this.capacidad_atencion_diaria = capacidad_atencion_diaria;
		this.comdiciones_preservacion = comdiciones_preservacion;
		this.capacidad_vacunas = capacidad_vacunas;
		this.cantidad_vacunados = cantidad_vacunados;
		this.lotes_vacunas = lotes_vacunas;
		this.municipio = municipio;
		this.talento_humano = talento_humano;
		this.administradorPuntoVacunacion = administradorPuntoVacunacion;
		this.operadorPuntoVacunacion = operadorPuntoVacunacion;
		this.ciudadanos = ciudadanos;
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
	 * @return the localizacion
	 */
	@Override
	public String getLocalizacion() {
		return localizacion;
	}

	/**
	 * @param localizacion the localizacion to set
	 */
	@Override
	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

	/**
	 * @return the capacidad_atencion_simultanea
	 */
	@Override
	public int getCapacidad_atencion_simultanea() {
		return capacidad_atencion_simultanea;
	}

	/**
	 * @param capacidad_atencion_simultanea the capacidad_atencion_simultanea to set
	 */
	@Override
	public void setCapacidad_atencion_simultanea(int capacidad_atencion_simultanea) {
		this.capacidad_atencion_simultanea = capacidad_atencion_simultanea;
	}

	/**
	 * @return the capacidad_atencion_diaria
	 */
	@Override
	public int getCapacidad_atencion_diaria() {
		return capacidad_atencion_diaria;
	}

	/**
	 * @param capacidad_atencion_diaria the capacidad_atencion_diaria to set
	 */
	@Override
	public void setCapacidad_atencion_diaria(int capacidad_atencion_diaria) {
		this.capacidad_atencion_diaria = capacidad_atencion_diaria;
	}

	/**
	 * @return the comdiciones_preservacion
	 */
	@Override
	public String getComdiciones_preservacion() {
		return comdiciones_preservacion;
	}

	/**
	 * @param comdiciones_preservacion the comdiciones_preservacion to set
	 */
	@Override
	public void setComdiciones_preservacion(String comdiciones_preservacion) {
		this.comdiciones_preservacion = comdiciones_preservacion;
	}

	/**
	 * @return the capacidad_vacunas
	 */
	@Override
	public int getCapacidad_vacunas() {
		return capacidad_vacunas;
	}

	/**
	 * @param capacidad_vacunas the capacidad_vacunas to set
	 */
	@Override
	public void setCapacidad_vacunas(int capacidad_vacunas) {
		this.capacidad_vacunas = capacidad_vacunas;
	}

	/**
	 * @return the cantidad_vacunados
	 */
	@Override
	public int getCantidad_vacunados() {
		return cantidad_vacunados;
	}

	/**
	 * @param cantidad_vacunados the cantidad_vacunados to set
	 */
	@Override
	public void setCantidad_vacunados(int cantidad_vacunados) {
		this.cantidad_vacunados = cantidad_vacunados;
	}
	
	
	
}
