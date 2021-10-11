package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia!\n \n");
		
		System.out.println("Bom");
		System.out.println(" dia!!");
		
		System.out.printf("MegaSena: %d %d %d %d %d %d %n", 17, 21, 22, 43, 46, 50, 56);
		System.out.printf("Salário: %.1f %n", 10000.6513); 
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		String idade = entrada.nextLine();
		
		System.out.println("\n\nNome: " + nome + " " + sobrenome + ", tem " + idade + " anos de idade.");
		
		entrada.close();
	}

}
