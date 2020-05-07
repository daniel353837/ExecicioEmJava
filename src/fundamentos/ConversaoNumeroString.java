package fundamentos;

public class ConversaoNumeroString {
	
	public static void main(String[] args) {
		Integer num =10000;
		System.out.println(num); // converter de integer para string 
		System.out.println("este numero possui: "+ num.toString().length()+ " caracterios");
	
	    int num2 =10000;
	    System.out.println(Integer.toString(num2));
	    System.out.println("este numero possui "+Integer.toString(num2).length()+" caracterios");
	    
	    System.out.println((""+num).length()); //convertendo de int para string usando uma string vazia
	    System.out.println((""+num2).length()); //convertendo de int para string usando uma string vazia
	    
	    
	}

}
