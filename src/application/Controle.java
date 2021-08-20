package application;

import entities.Semafaro;

public class Controle {

	public static void main(String[] args) {
		Semafaro semafaro = new Semafaro();
		
		for(int i=1; i<=10; i++) {
			semafaro.mudaProximaCor();
			System.out.printf("#%d: Cor atual: %d\n", i, semafaro.getCor());
		}
		
		semafaro.setCor(1);

		System.out.println("Cor amarela com setCor: " + semafaro.getCor());
	}

}

/*
2. Classe Controle 
    a. Cont�m o m�todo main com os seguintes passos: 
        i. Imprime a cor do sem�foro 
        ii. Repete 10 vezes as seguintes opera��es: 
            � Muda a cor atual do sem�foro para a pr�xima cor 
            � Imprime a cor do sem�foro 
        iii. Fixa a cor do sem�foro em amarelo 
        iv. Imprime a cor do sem�foro 
*/