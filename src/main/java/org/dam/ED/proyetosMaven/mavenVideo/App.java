package org.dam.ED.proyetosMaven.mavenVideo;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("CALCULADORA");
		System.out.print("Inserta la operacion que deseas hacer ( + - * / ): ");
		String operacion = leer.next();
		System.out.println();
		System.out.print("Inserta el primer valor: ");
		int VL1 = leer.nextInt();
		System.out.println();
		System.out.print("Inserta el segundo valor: "); // se inserta el 2º numero
		int VL2 = leer.nextInt();
		System.out.println();
		System.out.print("RESULTADO: ");
		int resultado = 0;
		switch (operacion) {
		case "+":
			resultado = VL1 + VL2;
			break;
		case "-":
			resultado = VL1 - VL2;
			break;
		case "*":
			resultado = VL1 * VL2;
			break;
		case "/":
			if (VL2 == 0) {
				resultado = 0;
				break;
			}
			resultado = VL1 / VL2;
			break;
		}

		System.out.println("(" + operacion + ") = " + resultado);

	}
}
