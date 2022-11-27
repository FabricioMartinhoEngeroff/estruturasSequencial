package javaEstutrutura;

import java.util.Locale;
import java.util.Scanner;

public class idades {

	public static void main(String[] args) {
		Locale.setDefault ( Locale.US );
		Scanner  sc = new  Scanner ( System . in );

	
		String nome1;
		String nome2;
		int idade1;
		int idade2;
		double media;
		
		System.out.println("Dados da primeira pessoa: ");
		System.out.print("Nome: ");
		nome1 = sc.nextLine();
		System.out.print("Idade:");
		idade1 = sc.nextInt();
		
		System.out.print("Dados da segunda pessoa: ");
		System.out.print("Nome: ");
		sc.next();
		nome2 = sc.nextLine();
		System.out.print("Idade: ");
		idade2 = sc.nextInt();
		
		media = (idade1 + idade2) / 2.0;
		
		System.out.printf("A idade de %se %s em de %.1f anos", nome1, nome2, media);
		
		
		sc.close();
	}

}
