package com.ucreativa;
/**
 * @author gruiz
 *
 */
public class Starbucks {
	private String size;
	private String drink;
	private String tipoComida;
	/**
	 * constructor
	 * @param size
	 * @param drink
	 * @param tipoComida
	 */
	public Starbucks(String size, String drink, String tipoComida) {
		this.size = size;
		this.drink = drink;
		this.tipoComida = tipoComida;
	}
	
	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}
	/**
	 * @param size the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}
	/**
	 * @return the drink
	 */
	public String getDrink() {
		return drink;
	}
	/**
	 * @param drink the drink to set
	 */
	public void setDrink(String drink) {
		this.drink = drink;
	}
	/**
	 * @return the tipoComida
	 */
	public String getTipoComida() {
		return tipoComida;
	}
	/**
	 * @param tipoComida the tipoComida to set
	 */
	public void setTipoComida(String tipoComida) {
		this.tipoComida = tipoComida;
	}
	
	public void servir() {
		System.out.println("Estoy sirviendo una bebida");
	}
	public void recibir() {
		System.out.println("Estoy recibiendo un cliente");
	}
	public void atendiendo() {
		System.out.println("Estoy atendiendo un cliente");
	}
	
	@Override
	public String toString() {
		return "Starbucks [size=" + size + ", drink=" + drink + ", tipoComida=" + tipoComida + "]";
	}
	
	

}
