package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		double RAIO = 3.7;
		final double PI = 3.14159;
		
		double AREA = PI * RAIO * RAIO;
		
		System.out.println(AREA);
		
		RAIO = 10;
		AREA = PI * RAIO * RAIO;

		System.out.println("Área é = " + AREA + "m².");
	}
}
