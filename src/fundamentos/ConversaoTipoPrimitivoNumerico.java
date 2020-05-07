package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a =1;               // implicida
		System.out.println(a);
		
		float b = (float) 1.12345; // explicita (cast)
		System.out.println(b);
		
		float j = 1.234F;
		System.out.println(j);
	    
	    int c = 4;
	    byte d =(byte) c; // convetendo int para bayte
	    System.out.println(d);
	    
	    
	    double e =1;
	    int f =(int) e;
	    System.out.println(f);
	
	
	}
	

}
