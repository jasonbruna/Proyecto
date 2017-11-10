package Model;

public class Cuenta{
	private int cueId;
	private int cueSaldo;
	private String cueFecApertura;
	private String cueEstado;
	private int cueSobregiro;
	private Cliente cliente;
	/**
	 * Constructor "Vacio" para poder crear una cuenta asociando un cliente primeramente
	 */
	public Cuenta(Cliente clinuevo) {
		cliente = clinuevo;
	}
	/** Constructor con todos los datos reunidos a rellenar.
	 * @param cueId
	 * @param cueSaldo
	 * @param cueFecApertura
	 * @param cueEstado
	 * @param cueSobregiro
	 * @param cliente
	 */
	public Cuenta(int cueId, int cueSaldo, String cueFecApertura, String cueEstado, int cueSobregiro, Cliente cliente) {
		this.cueId = cueId;
		this.cueSaldo = cueSaldo;
		this.cueFecApertura = cueFecApertura;
		this.cueEstado = cueEstado;
		this.cueSobregiro = cueSobregiro;
		this.cliente = cliente;
	}
	/**
	 * @return the cueId
	 */
	public int getCueId() {
		return cueId;
	}
	/**
	 * @param cueId the cueId to set
	 */
	public void setCueId(int cueId) {
		this.cueId = cueId;
	}
	/**
	 * @return the cueSaldo
	 */
	public int getCueSaldo() {
		return cueSaldo;
	}
	/**
	 * @param cueSaldo the cueSaldo to set
	 */
	public void setCueSaldo(int cueSaldo) {
		this.cueSaldo = cueSaldo;
	}
	/**
	 * @return the cueFecApertura
	 */
	public String getCueFecApertura() {
		return cueFecApertura;
	}
	/**
	 * @param cueFecApertura the cueFecApertura to set
	 */
	public void setCueFecApertura(String cueFecApertura) {
		this.cueFecApertura = cueFecApertura;
	}
	/**
	 * @return the cueEstado
	 */
	public String getCueEstado() {
		return cueEstado;
	}
	/**
	 * @param cueEstado the cueEstado to set
	 */
	public void setCueEstado(String cueEstado) {
		this.cueEstado = cueEstado;
	}
	/**
	 * @return the cueSobregiro
	 */
	public int getCueSobregiro() {
		return cueSobregiro;
	}
	/**
	 * @param cueSobregiro the cueSobregiro to set
	 */
	public void setCueSobregiro(int cueSobregiro) {
		this.cueSobregiro = cueSobregiro;
	}
	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}
	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cuenta\nId=" + cueId + "\nSaldo=" + cueSaldo + "\nFecApertura=" + cueFecApertura
				+ "\nEstado=" + cueEstado + "\nSobregiro=" + cueSobregiro + "\ncliente=" + cliente + "]";
	}
	
	
	
}
