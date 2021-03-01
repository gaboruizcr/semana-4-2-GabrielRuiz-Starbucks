/**
 * 
 */
package com.ucreativa;

/**
 * @author gruiz
 *
 */
public abstract class StarbucksBuilder {
	public Starbucks atributo1;
	public int cobrar;
	public String tamaño;

	/**
	 * @param atributo1
	 * @param cobrar
	 * @param tamaño
	 */
	public StarbucksBuilder(Starbucks atributo1, int cobrar, String tamaño) {
		super();
		this.atributo1 = atributo1;
		this.cobrar = cobrar;
		this.tamaño = tamaño;
	}
		
	/**
	 * @return the atributo1
	 */
	public Starbucks getAtributo1() {
		return atributo1;
	}

	/**
	 * @param atributo1 the atributo1 to set
	 */
	public void setAtributo1(Starbucks atributo1) {
		this.atributo1 = atributo1;
	}

	/**
	 * @return the cobrar
	 */
	public int getCobrar() {
		return cobrar;
	}
	/**
	 * @param cobrar the cobrar to set
	 */
	public void setCobrar(int cobrar) {
		this.cobrar = cobrar;
	}
	/**
	 * @return the tamaño
	 */
	public String getTamaño() {
		return tamaño;
	}
	/**
	 * @param tamaño the tamaño to set
	 */
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public Starbucks getStarbucks() {
		return atributo1;
	}
	public void createStarbucks() {
		System.out.println("Estoy creando un Starbucks");
	}
	public void buildSize() {
		System.out.println("Estoy creando el tamaño de la bebida");
	}
	public void buildDrink() {
		System.out.println("Estoy creando la bebida");
	}
	
	

}
