/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package clinica;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of expediente.
 * 
 * @author Pedro tc
 */
public class expediente {
	public expediente(String nombre, float rfc, float fechadenacimiento, float fechadecita, float sintomas) {
		super();
		this.nombre = nombre;
		this.rfc = rfc;
		this.fechadenacimiento = fechadenacimiento;
		this.fechadecita = fechadecita;
		this.sintomas = sintomas;
	}

	/**
	 * Description of the property nombre.
	 */
	public String nombre = "";

	/**
	 * Description of the property rfc.
	 */
	public float rfc = 0F;

	/**
	 * Description of the property fechadenacimiento.
	 */
	public float fechadenacimiento = 0F;

	/**
	 * Description of the property fechadecita.
	 */
	public float fechadecita = 0F;

	/**
	 * Description of the property sintomas.
	 */
	public float sintomas = 0F;

	// Start of user code (user defined attributes for expediente)

	// End of user code

	/**
	 * The constructor.
	 */
	public expediente() {
		// Start of user code constructor for expediente)
		super();
		// End of user code
	}

	/**
	 * Description of the method padecimiento.
	 * @param i 
	 */
	public void padecimiento(String i) {
		// Start of user code for method padecimiento
		// End of user code
	}

	// Start of user code (user defined methods for expediente)

	// End of user code
	/**
	 * Returns nombre.
	 * @return nombre 
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Sets a value to attribute nombre. 
	 * @param newNombre 
	 */
	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}

	/**
	 * Returns rfc.
	 * @return rfc 
	 */
	public float getRfc() {
		return this.rfc;
	}

	/**
	 * Sets a value to attribute rfc. 
	 * @param newRfc 
	 */
	public void setRfc(float newRfc) {
		this.rfc = newRfc;
	}

	/**
	 * Returns fechadenacimiento.
	 * @return fechadenacimiento 
	 */
	public float getFechadenacimiento() {
		return this.fechadenacimiento;
	}

	/**
	 * Sets a value to attribute fechadenacimiento. 
	 * @param newFechadenacimiento 
	 */
	public void setFechadenacimiento(float newFechadenacimiento) {
		this.fechadenacimiento = newFechadenacimiento;
	}

	/**
	 * Returns fechadecita.
	 * @return fechadecita 
	 */
	public float getFechadecita() {
		return this.fechadecita;
	}

	/**
	 * Sets a value to attribute fechadecita. 
	 * @param newFechadecita 
	 */
	public void setFechadecita(float newFechadecita) {
		this.fechadecita = newFechadecita;
	}

	/**
	 * Returns sintomas.
	 * @return sintomas 
	 */
	public float getSintomas() {
		return this.sintomas;
	}

	/**
	 * Sets a value to attribute sintomas. 
	 * @param newSintomas 
	 */
	public void setSintomas(float newSintomas) {
		this.sintomas = newSintomas;
	}

	@Override
	public String toString() {
		return "expediente [nombre=" + nombre + ", rfc=" + rfc + ", fechadenacimiento=" + fechadenacimiento
				+ ", fechadecita=" + fechadecita + ", sintomas=" + sintomas + "]";
	}

}
