package oo.composicao;

public class Carro {
	 
	Motor motor = new Motor();
      
	void acelerar() {
		motor.fatorTnjecao += 0.4;
	}
	void frear() {
		motor.fatorTnjecao -= 0.4;
		}
	void ligar() {
		motor.ligado = true;
		}
	void desligado() {
		motor.ligado = false;
		}
    boolean estaligado() {
    	return motor.ligado;
    }



}
