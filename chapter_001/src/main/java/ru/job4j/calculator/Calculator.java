package ru.job4j.calculator;

/**
* Calc
* @author Ackiy Satana (mailto:ter.on@mail.ru)
* @version 0.0001
* @since 26
*/


public class Calculator {
	
	private double result;

	/** Метод суммирования
	 *
	 * @param first
	 * @param second
	 */
	public void add (double first, double second) {
		this.result = first + second;
	}

	/** Метод вычитания
	 *
	 * @param first
	 * @param second
	 */
	public void substract (double first, double second) {
		this.result = first - second;
	}

	/** Умножение
	 *
	 * @param first
	 * @param second
	 */
	public void multiple (double first, double second) {
		this.result = first * second;
	}

	/** Деление
	 *
	 * @param first
	 * @param second
	 */
	public void div (double first, double second) {
		if (second == 0) return;
		this.result = first / second;
	}

	public double getResult(){
		return this.result;
	}

}