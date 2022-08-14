package view;

import controller.Controller;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Controller vetController = new Controller();
		
    	int[] vetor1000posicoes = vetController.gerarVet(1000);
    	int[] vetor10000posicoes  = vetController.gerarVet(10000);
    	int[] vetor100000posicoes  = vetController.gerarVet(100000);
    	
    	vetController.percoVet(vetor1000posicoes);
    	vetController.percoVet(vetor10000posicoes);
    	vetController.percoVet(vetor100000posicoes);
    	

	}
}
