package Model;

public class Juridico extends Cliente{
	private String jurRazSocial;

	/**
	 * 
	 */
	public Juridico() {
		super();
	}

	/** constructor lleno
	 * @param perRut
	 * @param perNombre
	 * @param perApePaterno
	 * @param perApeMaterno
	 * @param perNacionalidad
	 * @param perFechaNacimiento
	 * @param cliCategoria
	 * @param jurRazSocial
	 */
	public Juridico(String perRut, String perNombre, String perApePaterno, String perApeMaterno, String perNacionalidad,
			String perFechaNacimiento, String cliCategoria, String jurRazSocial) {
		super(perRut, perNombre, perApePaterno, perApeMaterno, perNacionalidad, perFechaNacimiento, cliCategoria);
		this.jurRazSocial = jurRazSocial;
	}

	/**
	 * @return the jurRazSocial
	 */
	public String getJurRazSocial() {
		return jurRazSocial;
	}

	/**
	 * @param jurRazSocial the jurRazSocial to set
	 */
	public void setJurRazSocial(String jurRazSocial) {
		this.jurRazSocial = jurRazSocial;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Juridico [jurRazSocial=" + jurRazSocial + ", cliCategoria=" + cliCategoria + ", perRut=" + perRut
				+ ", perNombre=" + perNombre + ", perApePaterno=" + perApePaterno + ", perApeMaterno=" + perApeMaterno
				+ ", perNacionalidad=" + perNacionalidad + ", perFechaNacimiento=" + perFechaNacimiento + "]";
	}
	
	
}
