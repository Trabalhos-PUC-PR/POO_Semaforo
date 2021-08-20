package entities;

public class Semafaro {
	
	private int cor = 2;

	public Semafaro() {
	}

	public void mudaProximaCor() {
		if(cor == 2) {
			cor = 0;
		}else {
			cor += 1;
		}
	}
	
	public int getCor() {
		return cor;
	}

	public void setCor(int cor) {
		this.cor = cor;
	}
}
/*
Escreva um c�digo Java composto pelas seguintes classes: 
 
1. Classe Semaforo 
    a. Atributo: cor, representada com um valor inteiro ==>  
        � 0 (verde),  
        � 1 (amarelo) ou  
        � 2 (vermelho), sendo o valor inicial igual a 2. 
    b. M�todos: 
        i. MudaProximaCor:  
            � sem par�metros e sem retorno ==> muda a cor atual 
            do sem�foro para a pr�xima cor (se estiver verde, fica 
            amarelo; se estiver amarelo, fica vermelho; se estiver 
            vermelho, fica verde). 
        ii. MudaCorFixa:  
            � com par�metro inteiro, sem retorno ==> muda a cor 
            atual do sem�foro para a cor fornecida como par�metro. 
        iii. MostraCor:  
            � sem par�metro, com retorno inteiro ==> retorna a cor 
            atual do sem�foro. 
            
2. Classe Controle 
    a. Cont�m o m�todo main com os seguintes passos: 
        i. Imprime a cor do sem�foro 
        ii. Repete 10 vezes as seguintes opera��es: 
            � Muda a cor atual do sem�foro para a pr�xima cor 
            � Imprime a cor do sem�foro 
        iii. Fixa a cor do sem�foro em amarelo 
        iv. Imprime a cor do sem�foro 
*/