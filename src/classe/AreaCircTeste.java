package classe;

public class AreaCircTeste{
	
	public static void main(String[] args) {
		AreaCirc a = new AreaCirc(5.6);
		System.out.println(a.area());
		
		AreaCirc a1 = new AreaCirc(5.6);
		//a1.pi= 810;
		
		AreaCirc.pi = 3.1415;
		System.out.println(a1.area());
	}

}
