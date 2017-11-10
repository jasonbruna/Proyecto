/**
 * 
 */
package Model;

/**
 * @author 1
 *
 */
public class Natural extends Cliente{
	private String natPatrimonio;

	/**
	 * 
	 */
	public Natural() {
		super();
	}

	/**
	 * @param perRut
	 * @param perNombre
	 * @param perApePaterno
	 * @param perApeMaterno
	 * @param perNacionalidad
	 * @param perFechaNacimiento
	 * @param cliCategoria
	 * @param natPatrimonio
	 */
	public Natural(String perRut, String perNombre, String perApePaterno, String perApeMaterno, String perNacionalidad,
			String perFechaNacimiento, String cliCategoria, String natPatrimonio) {
		super(perRut, perNombre, perApePaterno, perApeMaterno, perNacionalidad, perFechaNacimiento, cliCategoria);
		this.natPatrimonio = natPatrimonio;
	}

	/**
	 * @return the natPatrimonio
	 */
	public String getNatPatrimonio() {
		return natPatrimonio;
	}

	/**
	 * @param natPatrimonio the natPatrimonio to set
	 */
	public void setNatPatrimonio(String natPatrimonio) {
		this.natPatrimonio = natPatrimonio;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Natutal\nPatrimonio=" + natPatrimonio + "\nCategoria=" + cliCategoria + "\nRut=" + perRut
				+ "\nNombre=" + perNombre + "\nApellido Paterno=" + perApePaterno + "\nApellido Materno=" + perApeMaterno
				+ "\nNacionalidad=" + perNacionalidad + "\nFecha Nacimiento=" + perFechaNacimiento;
	}
	
	
}
