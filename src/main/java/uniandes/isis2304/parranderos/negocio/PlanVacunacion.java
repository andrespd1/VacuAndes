package uniandes.isis2304.parranderos.negocio;

public class PlanVacunacion implements VOPlanVacunacion {
	
	private VOAdministradorPlanVacunacion administradorPlanVacunacion;

	public PlanVacunacion() {
		super();
		this.administradorPlanVacunacion = new AdministradorPlanVacunacion();
	}
	
	public PlanVacunacion(VOAdministradorPlanVacunacion administradorPlanVacunacion) {
		super();
		this.administradorPlanVacunacion = administradorPlanVacunacion;
	}

	/**
	 * @return the administradorPlanVacunacion
	 */
	@Override
	public VOAdministradorPlanVacunacion getAdministradorPlanVacunacion() {
		return administradorPlanVacunacion;
	}

	/**
	 * @param administradorPlanVacunacion the administradorPlanVacunacion to set
	 */
	@Override
	public void setAdministradorPlanVacunacion(VOAdministradorPlanVacunacion administradorPlanVacunacion) {
		this.administradorPlanVacunacion = administradorPlanVacunacion;
	}
	
	

}
