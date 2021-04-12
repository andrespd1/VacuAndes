package uniandes.isis2304.parranderos.negocio;

public class MinisterioSalud implements VOMinisterioSalud {

	private int etapa;
	private int fase;
	private VOPlanVacunacion plan_vacunacion;
	
	public MinisterioSalud() {
		super();
		this.etapa = 0;
		this.fase = 0;
		this.plan_vacunacion = new PlanVacunacion();
	}
	
	public MinisterioSalud(int etapa, int fase, VOPlanVacunacion plan_vacunacion) {
		super();
		this.etapa = etapa;
		this.fase = fase;
		this.plan_vacunacion = plan_vacunacion;
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
	 * @return the fase
	 */
	@Override
	public int getFase() {
		return fase;
	}
	/**
	 * @param fase the fase to set
	 */
	@Override
	public void setFase(int fase) {
		this.fase = fase;
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
	
	
	
}
