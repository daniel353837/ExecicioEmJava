package fundamentos;

import java.util.Scanner;

public class Wrapper {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Byte b = 100;
		Short s = 1000;
		Integer i = Integer.parseInt("10000") ; //int
		Long l = 1000000L;
				
		System.out.println(b.byteValue());
		System.out.println(s.shortValue());
		System.out.println(i);
		System.out.println(l);		
		
		entrada.close();
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c= '#';
		System.out.println(c + "");
		
		
	}
}
