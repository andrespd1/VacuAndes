package uniandes.isis2304.parranderos.negocio;

import java.util.ArrayList;
import java.util.List;

public class AdministradorPlanVacunacion implements VOAdministradorPlanVacunacion {
	
	private VOPlanVacunacion plan_vacunacion;
	private List<EpsRegional> eps_regionales;
	
	public AdministradorPlanVacunacion() {
		super();
		this.plan_vacunacion = new PlanVacunacion();
		this.eps_regionales = new ArrayList<EpsRegional>();
	}
	
	public AdministradorPlanVacunacion(VOPlanVacunacion plan_vacunacion, List<EpsRegional> eps_regionales) {
		super();
		this.plan_vacunacion = plan_vacunacion;
		this.eps_regionales = eps_regionales;
	}
	/**
	 * @return the plan_vacunacion
	 */
	@Override
	public VOPlanVacunacion getPlan_vacunacion() {
		return plan_vacunacion;
	}
	/**
	 * @param plan_vacunacion the plan_vacunacion to set
	 */
	@Override
	public void setPlan_vacunacion(VOPlanVacunacion plan_vacunacion) {
		this.plan_vacunacion = plan_vacunacion;
	}
	/**
	 * @return the eps_regionales
	 */
	@Override
	public List<EpsRegional> getEps_regionales() {
		return eps_regionales;
	}
	/**
	 * @param eps_regionales the eps_regionales to set
	 */
	@Override
	public void setEps_regionales(List<EpsRegional> eps_regionales) {
		this.eps_regionales = eps_regionales;
	}
	
	
}
