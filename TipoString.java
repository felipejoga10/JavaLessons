package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		System.out.println("Olá galerinha".charAt(0));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!!!!!"));
		System.out.println(s + "!!!!!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("boa"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.length());
		
		var nome = "Pedro";
		var sobrenome = "Charuts";
		var idade = "47";
		var salario = "900,00";
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalário: " + salario);
		System.out.printf("O senhor %s %s tem %s anos e ganha R$%s.",
				nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO senhor %s %s tem %s anos e ganha R$%s.",
				nome, sobrenome, idade, salario);
		System.out.println(frase);
	}
}
