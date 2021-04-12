package uniandes.isis2304.parranderos.negocio;

import java.util.List;

public interface VOAdministradorPlanVacunacion {

	/**
	 * @return the plan_vacunacion
	 */
	VOPlanVacunacion getPlan_vacunacion();

	/**
	 * @param plan_vacunacion the plan_vacunacion to set
	 */
	void setPlan_vacunacion(VOPlanVacunacion plan_vacunacion);

	/**
	 * @return the eps_regionales
	 */
	List<EpsRegional> getEps_regionales();

	/**
	 * @param eps_regionales the eps_regionales to set
	 */
	void setEps_regionales(List<EpsRegional> eps_regionales);

}