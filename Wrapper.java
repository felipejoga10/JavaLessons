package fundamentos;

public class Wrapper {

	public static void main(String[] args) {
		
		//byte
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000; //int
		Long l = 1000000000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 4);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
	}
}
