/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package poo.ito;

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Vehiculo.
 * 
 * @author Pedro tc
 */
public class Vehiculo {
	public Vehiculo(String marca, float modelo, float cargaMaxima, float fechadeAdqui, String listadeViajes) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		CargaMaxima = cargaMaxima;
		this.fechadeAdqui = fechadeAdqui;
		ListadeViajes = listadeViajes;
	}

	/**
	 * Description of the property marca.
	 */
	public String marca = "";

	/**
	 * Description of the property modelo.
	 */
	public float modelo = 0F;

	/**
	 * Description of the property CargaMaxima.
	 */
	public float CargaMaxima = 0F;

	/**
	 * Description of the property fechadeAdqui.
	 */
	public float fechadeAdqui = 0F;

	/**
	 * Description of the property ListadeViajes.
	 */
	public String ListadeViajes = "";

	// Start of user code (user defined attributes for Vehiculo)

	// End of user code

	/**
	 * The constructor.
	 */
	public Vehiculo() {
		// Start of user code constructor for Vehiculo)
		super();
		// End of user code
	}

	/**
	 * Description of the method Viaje.
	 * @param destino 
	 * @param direccion 
	 * @param fechadeViaje 
	 * @param fechaRegreso 
	 * @param carga 
	 */
	public void Viaje(String destino, float direccion, float fechadeViaje, float fechaRegreso, String carga) {
		// Start of user code for method Viaje
		// End of user code
	}

	// Start of user code (user defined methods for Vehiculo)

	// End of user code
	/**
	 * Returns marca.
	 * @return marca 
	 */
	public String getMarca() {
		return this.marca;
	}

	/**
	 * Sets a value to attribute marca. 
	 * @param newMarca 
	 */
	public void setMarca(String newMarca) {
		this.marca = newMarca;
	}

	/**
	 * Returns modelo.
	 * @return modelo 
	 */
	public float getModelo() {
		return this.modelo;
	}

	/**
	 * Sets a value to attribute modelo. 
	 * @param newModelo 
	 */
	public void setModelo(float newModelo) {
		this.modelo = newModelo;
	}

	/**
	 * Returns CargaMaxima.
	 * @return CargaMaxima 
	 */
	public float getCargaMaxima() {
		return this.CargaMaxima;
	}

	/**
	 * Sets a value to attribute CargaMaxima. 
	 * @param newCargaMaxima 
	 */
	public void setCargaMaxima(float newCargaMaxima) {
		this.CargaMaxima = newCargaMaxima;
	}

	/**
	 * Returns fechadeAdqui.
	 * @return fechadeAdqui 
	 */
	public float getFechadeAdqui() {
		return this.fechadeAdqui;
	}

	/**
	 * Sets a value to attribute fechadeAdqui. 
	 * @param newFechadeAdqui 
	 */
	public void setFechadeAdqui(float newFechadeAdqui) {
		this.fechadeAdqui = newFechadeAdqui;
	}

	/**
	 * Returns ListadeViajes.
	 * @return ListadeViajes 
	 */
	public String getListadeViajes() {
		return this.ListadeViajes;
	}

	/**
	 * Sets a value to attribute ListadeViajes. 
	 * @param newListadeViajes 
	 */
	public void setListadeViajes(String newListadeViajes) {
		this.ListadeViajes = newListadeViajes;
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", CargaMaxima=" + CargaMaxima + ", fechadeAdqui="
				+ fechadeAdqui + ", ListadeViajes=" + ListadeViajes + "]";
	}

}
