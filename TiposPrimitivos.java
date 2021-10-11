package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		//Informações do funcionário
		
		//Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 500;
		int id = 56456;
		long pontosAcumulados = 3_234_845_233L;
		
		//Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipos booleanos
		boolean estaDeFerias = false; //true
		
		//Tipo caractere
		char status = 'A'; //ativo
		
		//Dias de empresa 
		System.out.println(anosDeEmpresa * 365);
		
		//Número de Viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? : " + estaDeFerias);
		System.out.println("Status: " + status);
		
		
	}	

}
