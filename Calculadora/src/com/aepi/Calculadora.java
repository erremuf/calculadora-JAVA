package com.aepi;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {


		Operacion operacion = new Operacion();
		Scanner scanner = new Scanner(System.in);
		int opcion;
		double num1, num2;

		do {
			
			System.out.println(
					"\nCALCULADORA JAVA \n\nPulsa el número de la operación que quieres realizar \n1. Sumar \n2. Restar \n3. Multiplicar \n4. Dividir \n5. Salir");

			opcion = scanner.nextInt();
			switch (opcion) {

			case 1:
				System.out.println("\nPor favor introduce el primer número: ");
				num1 = scanner.nextDouble();
				System.out.println("\nPor favor introduce el segundo número: ");
				num2 = scanner.nextDouble();

				System.out.println(operacion.calcularSuma(num1, num2));
				break;

			case 2:

				System.out.println("\nPor favor introduce el primer número: ");
				num1 = scanner.nextDouble();
				System.out.println("\nPor favor introduce el segundo número: ");
				num2 = scanner.nextDouble();

				System.out.println(operacion.calcularResta(num1, num2));
				break;

			case 3:

				System.out.println("\nPor favor introduce el primer número: ");
				num1 = scanner.nextDouble();
				System.out.println("\nPor favor introduce el segundo número: ");
				num2 = scanner.nextDouble();

				System.out.println(operacion.calcularMultiplicacion(num1, num2));
				break;

			case 4:

				System.out.println("\nPor favor introduce el primer número: ");
				num1 = scanner.nextDouble();
				System.out.println("\nPor favor introduce el segundo número: ");
				num2 = scanner.nextDouble();

				System.out.println(operacion.calcularDivision(num1, num2));
				break;
				
			case 5:

				System.out.println("\n¡¡NOS VEMOS A LA PRÓXIMA");
				break;

			default:

				System.out.println("Por favor, elige una operacion correcta. Recuerda que es un número del 1 al 5");
				break;

			}

		} while (opcion != 5);

	}

}


//////////////////////////////////////////////////////////////////////////////////// CLASES

class Operacion {

	double num1;
	double num2;

////////////////////////////// Constructores



////////////////////////////// Métodos

	public double calcularSuma(double num1, double num2) {

		double resultadoSuma = num1 + num2;
		return resultadoSuma;

	}

	public double calcularResta(double num1, double num2) {

		double resultadoResta = num1 - num2;
		return resultadoResta;

	}

	public double calcularMultiplicacion(double num1, double num2) {

		double resultadoMultiplicacion = num1 * num2;
		return resultadoMultiplicacion;

	}

	public double calcularDivision(double num1, double num2) {

		double resultadoDivision = num1 / num2;
		return resultadoDivision;

	}

}