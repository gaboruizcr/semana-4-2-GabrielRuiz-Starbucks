/**
 * 
 */
package com.ucreativa;

/**
 * @author gruiz
 *
 */
public class Waiter {
	private StarbucksBuilder orden;
	private String numMesa;
	private boolean ordenEntregada;
	/**
	 * @param orden
	 * @param numMesa
	 * @param ordenEntregada
	 */
	public Waiter(StarbucksBuilder orden, String numMesa, boolean ordenEntregada) {
		super();
		this.orden = orden;
		this.numMesa = numMesa;
		this.ordenEntregada = ordenEntregada;
	}
	/**
	 * @return the orden
	 */
	public StarbucksBuilder getOrden() {
		return orden;
	}
	/**
	 * @param orden the orden to set
	 */
	public void setOrden(StarbucksBuilder orden) {
		this.orden = orden;
	}
	/**
	 * @return the numMesa
	 */
	public String getNumMesa() {
		return numMesa;
	}
	/**
	 * @param numMesa the numMesa to set
	 */
	public void setNumMesa(String numMesa) {
		this.numMesa = numMesa;
	}
	/**
	 * @return the ordenEntregada
	 */
	public boolean isOrdenEntregada() {
		return ordenEntregada;
	}
	/**
	 * @param ordenEntregada the ordenEntregada to set
	 */
	public void setOrdenEntregada(boolean ordenEntregada) {
		this.ordenEntregada = ordenEntregada;
	}
	
	public void setStarbucksBuilder(StarbucksBuilder orden) {
		this.orden = orden;
	}
	
	public Starbucks getStarbucksDrink() {
		return orden.getStarbucks();
	}
	
	public void constructStarbucks() {
		System.out.println("Estoy construyendo la bebida de Starbucks");
	}
	@Override
	public String toString() {
		return "Waiter [orden=" + orden + ", numMesa=" + numMesa + ", ordenEntregada=" + ordenEntregada
				+ "]";
	}
	
			

}
