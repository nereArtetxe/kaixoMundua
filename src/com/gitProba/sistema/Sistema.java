package com.gitProba.sistema;

import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduce un número");
		int num1=entrada.nextInt();
		System.out.println("Introduce otro número");
		int num2=entrada.nextInt();
		if (num1<num2) {
			System.out.println("El "+num2+" es mayor que el "+ num1+".");
		}
		else {
			System.out.println("El "+num1+" es mayor que el "+ num2+".");
		}
		

	}

}
