/**
 * 
 */
package Model;

/**
 * @author Jason Bruna
 * version 1.0 
 * Clase Abstracta Persona encapsula los antecedentes de un cliente
 *
 */
public abstract class Persona {
	protected String perRut;
	protected String perNombre;
	protected String perApePaterno;
	protected String perApeMaterno;
	protected String perNacionalidad;
	protected String perFechaNacimiento;
	/**
	 * Constructor Vacio
	 */
	public Persona() {
	}
	/**
	 * @param perRut rut
	 * @param perNombre	nombre
	 * @param perApePaterno	Apellido Paterno
	 * @param perApeMaterno	Apellido Materno
	 * @param perNacionalidad	Nacionalidad Persona
	 * @param perFechaNacimiento	Fecha Nacimiento
	 */
	public Persona(String perRut, String perNombre, String perApePaterno, String perApeMaterno, String perNacionalidad,
			String perFechaNacimiento) {
		this.perRut = perRut;
		this.perNombre = perNombre;
		this.perApePaterno = perApePaterno;
		this.perApeMaterno = perApeMaterno;
		this.perNacionalidad = perNacionalidad;
		this.perFechaNacimiento = perFechaNacimiento;
	}
	/**
	 * @return the perRut
	 */
	public String getPerRut() {
		return perRut;
	}
	/**
	 * @param perRut the perRut to set
	 */
	public void setPerRut(String perRut) {
		this.perRut = perRut;
	}
	/**
	 * @return the perNombre
	 */
	public String getPerNombre() {
		return perNombre;
	}
	/**
	 * @param perNombre the perNombre to set
	 */
	public void setPerNombre(String perNombre) {
		this.perNombre = perNombre;
	}
	/**
	 * @return the perApePaterno
	 */
	public String getPerApePaterno() {
		return perApePaterno;
	}
	/**
	 * @param perApePaterno the perApePaterno to set
	 */
	public void setPerApePaterno(String perApePaterno) {
		this.perApePaterno = perApePaterno;
	}
	/**
	 * @return the perApeMaterno
	 */
	public String getPerApeMaterno() {
		return perApeMaterno;
	}
	/**
	 * @param perApeMaterno the perApeMaterno to set
	 */
	public void setPerApeMaterno(String perApeMaterno) {
		this.perApeMaterno = perApeMaterno;
	}
	/**
	 * @return the perNacionalidad
	 */
	public String getPerNacionalidad() {
		return perNacionalidad;
	}
	/**
	 * @param perNacionalidad the perNacionalidad to set
	 */
	public void setPerNacionalidad(String perNacionalidad) {
		this.perNacionalidad = perNacionalidad;
	}
	/**
	 * @return the perFechaNacimiento
	 */
	public String getPerFechaNacimiento() {
		return perFechaNacimiento;
	}
	/**
	 * @param perFechaNacimiento the perFechaNacimiento to set
	 */
	public void setPerFechaNacimiento(String perFechaNacimiento) {
		this.perFechaNacimiento = perFechaNacimiento;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Persona [perRut=" + perRut + ", perNombre=" + perNombre + ", perApePaterno=" + perApePaterno
				+ ", perApeMaterno=" + perApeMaterno + ", perNacionalidad=" + perNacionalidad + ", perFechaNacimiento="
				+ perFechaNacimiento + "]";
	}
	
	
	
	
	
	

}
