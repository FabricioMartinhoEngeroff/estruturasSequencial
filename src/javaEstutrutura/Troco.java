package javaEstutrutura;

import java.util.Locale;
import java.util.Scanner;

public class Troco {

	public static void main(String[] args) {
		Locale.setDefault ( Locale.US );
		Scanner  sc = new  Scanner ( System . in );

		double produto;
		int compra;
		double dinheiroRecebido;
		double troco;
		
		System.out.print("preço unitario do produto: ");
		produto = sc.nextDouble();
		
		System.out.print("Quantidade comprada: ");
		compra = sc.nextInt();
		
		System.out.print("Dinheiro recebido: ");
		dinheiroRecebido = sc.nextDouble();
		
		troco = dinheiroRecebido - (produto * compra);
		
	    System.out.printf("TROCO = %.2f\n" , troco);
		
		sc.close();
	}

}
