package oo.composicao;

public class Motor {

	boolean ligado = false;
	double fatorTnjecao = 1 ;
	
	int giros() {
		if(ligado) {
			return 0;
		}else {
			return (int)Math.round(fatorTnjecao * 3000); 
		} 
	}
}
