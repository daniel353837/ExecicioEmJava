package classe;

public class Data {
	
	public static void main(String[] args) {
		
		DataTeste d1 = new DataTeste(); 
		d1.dia = "Nove";
		d1.mes = 11;
		d1.ano = 1985;
		
		//String Aniverssario = d1.dia+" do "+ d1.mes+" de "+ d1.ano;
		
		 
		
	    // System.out.printf("%d/%d/%d\n",d1.dia,d1.mes,d1.ano); 
	     System.out.println(d1.Aniverssario());
	}

}
