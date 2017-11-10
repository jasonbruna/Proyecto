/**
 * 
 */
package Model;

/**
 * @author Jason Bruna
 * Version 1.0
 *Cliente Toma herencia de Persona y encapsula categoria
 */
public abstract class Cliente extends Persona{
	protected String cliCategoria;

	public Cliente() { super();
	}

	/**
	 * @param perRut
	 * @param perNombre
	 * @param perApePaterno
	 * @param perApeMaterno
	 * @param perNacionalidad
	 * @param perFechaNacimiento
	 * @param cliCategoria
	 */
	public Cliente(String perRut,
			String perNombre,
			String perApePaterno, 
			String perApeMaterno,
			String perNacionalidad,
			String perFechaNacimiento,
			String cliCategoria) {
		super(perRut, perNombre, perApePaterno, perApeMaterno, perNacionalidad, perFechaNacimiento);
		this.cliCategoria = cliCategoria;
	}

	/**
	 * @return the cliCategoria
	 */
	public String getCliCategoria() {
		return cliCategoria;
	}

	/**
	 * @param cliCategoria the cliCategoria to set
	 */
	public void setCliCategoria(String cliCategoria) {
		this.cliCategoria = cliCategoria;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cliente \nCategoria=" + cliCategoria + "\nRut=" + perRut + "\nNombre=" + perNombre
				+ "\nApellido Paterno=" + perApePaterno + "\n Apellido Materno=" + perApeMaterno + "\nNacionalidad="
				+ perNacionalidad + "\nFecha Nacimiento=" + perFechaNacimiento;
	}
	
	

}
