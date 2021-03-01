/**
 * 
 */
package com.ucreativa;

/**
 * @author gruiz
 *
 */
public class Customer {

	private static final boolean False = false;

	/**
	 * 
	 */
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("---------------------------Starbucks-----------------------------------");	
		Starbucks star1 = new Starbucks("Grande", "Cafe", "Dulce");
		System.out.println(star1.toString());
		star1.atendiendo();
		System.out.println("------------------------Cambiando tamaño-------------------------------");
		star1.setSize("Pequeño");
		System.out.println(star1.toString());
		System.out.println("-------------------------End Starbucks---------------------------------");
		
		
		
		
		System.out.println("---------------------------CoffeeBuilder-----------------------------------");	
		CoffeeBuilder coffee1 = new CoffeeBuilder(star1, 2500, "Grande", "Caliente", "verde", "2 cucharadas");
	
		coffee1.createStarbucks();
		System.out.println(coffee1.toString());
		System.out.println("-------------------------End CoffeeBuilder---------------------------------");

		
		
		
		System.out.println("---------------------------TeaBuilder-----------------------------------");	
		Starbucks star2 = new Starbucks("Grande", "Te", "Dulce");
		TeaBuilder tea1 = new TeaBuilder(star2, 2500, "Grande", "Caliente", "azul",	"3 cucharadas");
	
		tea1.buildDrink();
		System.out.println(tea1.toString());
		System.out.println("-------------------------End TeaBuilder---------------------------------");
		
		
		
		
		System.out.println("---------------------------Waiter-----------------------------------");
		StarbucksBuilder orden = null;
		Waiter waiter1 = new Waiter(orden, "3", False);
	
		waiter1.constructStarbucks();
		System.out.println(waiter1.toString());
		System.out.println("-------------------------End Waiter---------------------------------");
		
		
		
		System.out.println("---------------------------Polimorfismo-----------------------------------");
		StarbucksBuilder coffee2 = new CoffeeBuilder(star1, 2500, "Pequeño", "Caliente", "verde", "2 cucharadas");
	
		coffee2.buildDrink();
		System.out.println(coffee2.toString());
		
		StarbucksBuilder tea2 = new TeaBuilder(star2, 2500, "Pequeño", "Caliente", "verde", "2 cucharadas");
		
		tea2.buildSize();
		System.out.println(tea2.toString());
		System.out.println("-------------------------End Polimorfismo---------------------------------");
	}

}
