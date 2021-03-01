/**
 * 
 */
package com.ucreativa;

/**
 * @author gruiz
 *
 */
public class TeaBuilder extends StarbucksBuilder {
	private String temperatura;
	private String tasa;
	private String azucar;
	
	@Override
	public void createStarbucks() {
		// TODO Auto-generated method stub
		super.createStarbucks();
	}
	@Override
	public void buildSize() {
		// TODO Auto-generated method stub
		super.buildSize();
	}
	@Override
	public void buildDrink() {
		// TODO Auto-generated method stub
		super.buildDrink();
	}
	
	/**
	 * @param atributo1
	 * @param cobrar
	 * @param tamaño
	 * @param temperatura
	 * @param tasa
	 * @param azucar
	 */
	public TeaBuilder(Starbucks atributo1, int cobrar, String tamaño, String temperatura, String tasa, String azucar) {
		super(atributo1, cobrar, tamaño);
		this.temperatura = temperatura;
		this.tasa = tasa;
		this.azucar = azucar;
	}
	/**
	 * @return the temperatura
	 */
	public String getTemperatura() {
		return temperatura;
	}
	/**
	 * @param temperatura the temperatura to set
	 */
	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}
	/**
	 * @return the tasa
	 */
	public String getTasa() {
		return tasa;
	}
	/**
	 * @param tasa the tasa to set
	 */
	public void setTasa(String tasa) {
		this.tasa = tasa;
	}
	/**
	 * @return the azucar
	 */
	public String getAzucar() {
		return azucar;
	}
	/**
	 * @param azucar the azucar to set
	 */
	public void setAzucar(String azucar) {
		this.azucar = azucar;
	}
	@Override
	public String toString() {
		return "TeaBuilder [temperatura=" + temperatura + ", tasa=" + tasa + ", azucar=" + azucar + ", atributo1="
				+ atributo1 + ", cobrar=" + cobrar + ", tamaño=" + tamaño + "]";
	}
	
	

}
