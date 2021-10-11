package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		//double a = 2.3;
		String s = "Bom dia X!";
		System.out.println(s);
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		System.out.println(s);
		
		s = s.concat("!!!!!");
		
		System.out.println(s);
		
		String y = "Bom dia Y".toUpperCase().replace("Y", "Antonio").toUpperCase().concat("!!!!!!!!!!");
		System.out.println(y);
		
		System.out.println();
		//Tipos primitivos não tetm o operador "."
	}

}
