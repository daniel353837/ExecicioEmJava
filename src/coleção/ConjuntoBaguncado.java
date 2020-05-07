

package coleção;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
        
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
	    
		 HashSet conjunto = new HashSet();
		 conjunto.add(1.2);      //double -> Double
		 conjunto.add(true);     // boolean -> Boolean
		 conjunto.add("Teste");  // String
		 conjunto.add(1);        // int -> Integer
		 conjunto.add('x');      // char -> caracter
		 
		 System.out.println("O tamanho é "+conjunto.size()+" Elementos");  // size e usado para saber o tamanho do conjunto
		 // conjunto não aceita dados repetidos
		 
		 System.out.println(conjunto.remove("teste")); // se o obj não fizer parte do conjumto retorna false
		 System.out.println(conjunto.remove("Teste")); // retorna true
		 
		 System.out.println("O tamanho é "+conjunto.size()+" Elementos");
		 
		 System.out.println(conjunto.contains('x')); // true  verificar se o objeto faz parte do conjunto
		 System.out.println(conjunto.contains(12));  // false
		
	     Set nums = new HashSet();
	     nums.add(1); 
	     nums.add(2);
	     nums.add(3);
	     
	     System.out.println(nums);
	     System.out.println(conjunto);
	     
	     // fanzendo o uniao de conjunto/nums 
	    
	     //conjunto.addAll(nums);
	     System.out.println(conjunto); 
	     
	     // faz traz apenas o objeto que esta em ambus conjuntos
	     conjunto.retainAll(nums);
	     System.out.println(conjunto);
	     
	     conjunto.clear(); // limpar o conteudo 
	     System.out.println(conjunto);
	}
}
