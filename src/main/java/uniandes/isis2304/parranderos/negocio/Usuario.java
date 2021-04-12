package uniandes.isis2304.parranderos.negocio;

public class Usuario extends Ciudadano implements VOUsuario{
	
	private VOCargo cargo;
	
	public Usuario() {
		super();
		this.cargo = new Cargo();
	}
	
	public Usuario(VOCargo cargo) {
		super();
		this.cargo = cargo;
	}

	/**
	 * @return the cargo
	 */
	@Override
	public VOCargo getCargo() {
		return cargo;
	}

	/**
	 * @param cargo the cargo to set
	 */
	@Override
	public void setCargo(VOCargo cargo) {
		this.cargo = cargo;
	}
	
	

}
