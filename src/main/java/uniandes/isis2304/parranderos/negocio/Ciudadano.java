package uniandes.isis2304.parranderos.negocio;

public class Ciudadano implements VOCiudadano {
	
	private String identificacion;
	
	private String nombre;
	
	private int edad;
	
	private int etapa;
	
	private VODepartamento municipio;
	
	private VOEpsRegional eps_regional;
	
	private String estado;
	
	private boolean disposicion;
	
	private VOCitaVacunacion cita_vacunacion;
	
	public Ciudadano() {
		super();
		this.identificacion = "";
		this.nombre = "";
		this.edad = 0;
		this.etapa = 0;
		this.municipio = new Departamento();
		this.eps_regional = new EpsRegional();
		this.estado = "";
		this.disposicion = false;
		this.cita_vacunacion = new CitaVacunacion();
	}

	public Ciudadano(String identificacion, String nombre, int edad, int etapa, VODepartamento municipio,
			VOEpsRegional eps_regional, String estado, boolean disposicion, VOCitaVacunacion cita_vacunacion) {
		super();
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.edad = edad;
		this.etapa = etapa;
		this.municipio = municipio;
		this.eps_regional = eps_regional;
		this.estado = estado;
		this.disposicion = disposicion;
		this.cita_vacunacion = cita_vacunacion;
	}

	/**
	 * @return the identificacion
	 */
	@Override
	public String getIdentificacion() {
		return identificacion;
	}

	/**
	 * @param identificacion the identificacion to set
	 */
	@Override
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
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
	 * @return the edad
	 */
	@Override
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	@Override
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the etapa
	 */
	@Override
	public int getEtapa() {
		return etapa;
	}

	/**
	 * @param etapa the etapa to set
	 */
	@Override
	public void setEtapa(int etapa) {
		this.etapa = etapa;
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
	 * @return the estado
	 */
	@Override
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	@Override
	public void setEstado(String estado) {
		this.estado = estado;
	}

	/**
	 * @return the disposicion
	 */
	@Override
	public boolean isDisposicion() {
		return disposicion;
	}

	/**
	 * @param disposicion the disposicion to set
	 */
	@Override
	public void setDisposicion(boolean disposicion) {
		this.disposicion = disposicion;
	}

	/**
	 * @return the cita_vacunacion
	 */
	@Override
	public VOCitaVacunacion getCita_vacunacion() {
		return cita_vacunacion;
	}

	/**
	 * @param cita_vacunacion the cita_vacunacion to set
	 */
	@Override
	public void setCita_vacunacion(VOCitaVacunacion cita_vacunacion) {
		this.cita_vacunacion = cita_vacunacion;
	}
	
	

}
