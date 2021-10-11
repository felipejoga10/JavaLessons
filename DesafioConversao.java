package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		String idade = entrada.nextLine();
		
		System.out.println("Digite seu salário do mês retrasado: R$ ");
		String salario1 = entrada.nextLine();
		
		System.out.println("Digite seu salário do mês passado: R$ ");
		String salario2 = entrada.nextLine();
		
		System.out.println("Digite seu salário do mês atual: R$ ");
		String salario3 = entrada.nextLine();
		

		double numero1 = Double.parseDouble(salario1);
		double numero2 = Double.parseDouble(salario2);
		double numero3 = Double.parseDouble(salario3);
		double soma = numero1 + numero2 + numero3;
		
		
		System.out.println("O funcionário " + nome + " " + sobrenome + " tem "
				+ idade + " anos de idade.");
		System.out.println("Recebeu os seguintes salários R$:" + salario1 + ", R$:" +
				salario2 + " e R$:" + salario3 + ".");
		System.out.println("A soma dos salários é de R$:" + soma + ".");
		System.out.println("A média dos valores é de R$:" + soma / 3 + ".");
		
		entrada.close();
	}

}
