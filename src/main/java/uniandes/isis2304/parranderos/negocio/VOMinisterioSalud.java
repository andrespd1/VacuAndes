package uniandes.isis2304.parranderos.negocio;

public interface VOMinisterioSalud {

	/**
	 * @return the etapa
	 */
	int getEtapa();

	/**
	 * @param etapa the etapa to set
	 */
	void setEtapa(int etapa);

	/**
	 * @return the fase
	 */
	int getFase();

	/**
	 * @param fase the fase to set
	 */
	void setFase(int fase);

	/**
	 * @return the plan_vacunacion
	 */
	VOPlanVacunacion getPlan_vacunacion();

	/**
	 * @param plan_vacunacion the plan_vacunacion to set
	 */
	void setPlan_vacunacion(VOPlanVacunacion plan_vacunacion);

}