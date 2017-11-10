/**
 * 
 */
package Model;

/**
 * @author Jason Bruna
 *
 */
public class Ejecutivo extends Persona{
	private String ejeFecContrato;

	public Ejecutivo() {
		super();
	}

	public Ejecutivo(String perRut, String perNombre, String perApePaterno, String perApeMaterno,
			String perNacionalidad, String perFechaNacimiento, String ejeFecContrato) {
		super(perRut, perNombre, perApePaterno, perApeMaterno, perNacionalidad, perFechaNacimiento);
		this.ejeFecContrato = ejeFecContrato;
	}

	/**
	 * @return the ejeFecContrato
	 */
	public String getEjeFecContrato() {
		return ejeFecContrato;
	}

	/**
	 * @param ejeFecContrato the ejeFecContrato to set
	 */
	public void setEjeFecContrato(String ejeFecContrato) {
		this.ejeFecContrato = ejeFecContrato;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ejecutivo [ejeFecContrato=" + ejeFecContrato + ", perRut=" + perRut + ", perNombre=" + perNombre
				+ ", perApePaterno=" + perApePaterno + ", perApeMaterno=" + perApeMaterno + ", perNacionalidad="
				+ perNacionalidad + ", perFechaNacimiento=" + perFechaNacimiento + "]";
	}
	
	

}
