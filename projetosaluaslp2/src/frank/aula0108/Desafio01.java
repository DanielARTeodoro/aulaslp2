package frank.aula0108;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

// @Java Progressivo.net
// @ViniGodoy

// http://www.javaprogressivo.net/2012/09/array-multidimensional-ou-matriz-array_6673.html
// https://www.guj.com.br/t/resolvido-como-gerar-numeros-aleatorios-sem-repeticao/74652/6

/**
 * @author Frank
 *
 */
public class Desafio01 {

	public static void main(String[] args) {

// Criando a geração dos números aleatorios e enpedindo que tenha repetição entre eles

		Set numeros = new TreeSet();
		Random rand = new Random();

// Vamos sortear 25 números de 0 até 26 sem repetição

		while (numeros.size() < 25) {
			numeros.add(rand.nextInt(26));
		}

// Crinado a Matriz

		int[][] matriz = new int[5][5];

// Carregando a Matriz com os nÃºmeros e gerando a mesma.

		for (int linha = 0; linha < 5; linha++) {
			for (int coluna = 0; coluna < 5; coluna++) {
				matriz[linha][coluna] = ((Random) numeros).nextInt();
			}
		}

// Mostrando o resultado final da Matriz na tela

		System.out.println("\nA Matriz ficou: \n");
		for (int linha = 0; linha < 5; linha++) {
			for (int coluna = 0; coluna < 5; coluna++) {
				System.out.printf("\t %d \t", matriz[linha][coluna]);
			}
			System.out.println();
		}

	}
}