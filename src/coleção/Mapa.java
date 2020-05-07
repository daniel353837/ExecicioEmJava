package coleção;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		
		Map<Integer, String>usuarios = new HashMap<>();
		usuarios.put(1,"Roberto"); // adicionou Roberto
		usuarios.put(1,"Ricardo"); // alterou para Ricardo
		usuarios.put(2,"Roberto");
		usuarios.put(3,"Rafaela");
		usuarios.put(4,"Rebeca");
		
	
	System.out.println(usuarios.size()); // tamanho
	System.out.println(usuarios.isEmpty()); // se tem algum objeto' 
	System.out.println(usuarios.keySet()); // retorna a posição da chave
	System.out.println(usuarios.values()); // mostra os valores
	System.out.println(usuarios.entrySet());// mostra a chave e os valores
	
	System.out.println(usuarios.containsKey(4));// retorna se falso ou verdadeiro  do indice
	System.out.println(usuarios.containsValue("Rebeca"));//retorna falso ou true
	//System.out.println(usuarios.remove(2));// para remover pelo indice
	
	
	System.out.println(usuarios.get(3));// traz apartir do valor
	
	for (int chave: usuarios.keySet()) {
		System.out.println(chave);
	}
	for (String valor: usuarios.values()) {
		System.out.println(valor);
	} 
	 for (Entry<Integer,String> registro: usuarios.entrySet()) {
		System.out.println(registro.getKey());
		System.out.println(registro.getValue());
	}
	}

}
