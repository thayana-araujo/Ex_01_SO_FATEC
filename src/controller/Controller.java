package controller;

public class Controller {
	
	public Controller () {
		super();
	}
	
	public int[] gerarVet(int nrPosicoes) {
		int[] vet = new int[nrPosicoes];
		for (int i = 0 ; i < nrPosicoes ; i++) {
			vet[i] = 0;
		}
		return vet;
	}
	
	public void percoVet(int[] numVet) {
		int tamanho = numVet.length;
		
		double tempoInicial = System.nanoTime();
		for (int i : numVet) {
			
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		
		System.out.println("Buffer ==>> " + tempoTotal +"s.");
	}

}
