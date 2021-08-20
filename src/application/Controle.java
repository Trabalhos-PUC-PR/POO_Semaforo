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
    a. Contém o método main com os seguintes passos: 
        i. Imprime a cor do semáforo 
        ii. Repete 10 vezes as seguintes operações: 
            • Muda a cor atual do semáforo para a próxima cor 
            • Imprime a cor do semáforo 
        iii. Fixa a cor do semáforo em amarelo 
        iv. Imprime a cor do semáforo 
*/