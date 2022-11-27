package javaEstutrutura;

import java.util.Locale;
import java.util.Scanner;

public class Consumo {

	public static void main(String[] args) {
		Locale.setDefault ( Locale.US );
		Scanner sc = new  Scanner ( System . in );
		
		double distanciaTotal;
		double combustivelGasto;
		double consumoMedio;
		
		System.out.print("Distancia percorrida: ");
		distanciaTotal= sc.nextDouble();
		
		System.out.print("Combustivel gasto: ");
		combustivelGasto = sc.nextDouble();
		
		consumoMedio = distanciaTotal / combustivelGasto;
		
		System.out.printf("Consumo medio = %.3f\\n ", consumoMedio);
		
		sc.close();
	}

}
