package ru.job4j.calculate;

/**
* Calc
* @author Ackiy Satana (mailto:ter.on@mail.ru)
* @version 0.0001
* @since 26
*/


public class Calculate {
	
	 /**
     * Main. Eah
     * @param args - args.
     */
	public static void main(String[] args) {

	String s;
		s = echo("Zz Zzz Zzzz");
		System.out.println("Hello World "+s);
	}
	
	
	/**
	* Method echo.
	* @param name My name.
	* @return Echo *3 plus my name.
	*/
	public static String echo(String name) {
		return "Echo, echo, echo : " + name;
	}
		
}