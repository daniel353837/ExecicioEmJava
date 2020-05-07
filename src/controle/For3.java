package controle;

public class For3 {
	
	public static void main(String[] args) {
		
		int i =0;
		int j =10;
		
		
		for( i = 0;i<10;i++) {
			System.out.println(i);   // For Normal
		}
	
		for( i = 0;i<10;i++) {
			for(j = 0;j<10;j++) {
			System.out.printf("[%d %d]",i,j++); // For dentro do For
		}
			System.out.println();
	}
	
}

}
