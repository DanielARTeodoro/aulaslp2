/**
 * 
 */
package aula0108;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Daniel Com Auxílio de:
 * @author Java Progressivo.net
 * @author ViniGodoy
 *
 */

//http://www.javaprogressivo.net/2012/09/array-multidimensional-ou-matriz-array_6673.html
// https://www.guj.com.br/t/resolvido-como-gerar-numeros-aleatorios-sem-repeticao/74652/6

public class Desafio01 {

	// @Java Progressivo.net
	// @ViniGodoy

	public static void main(String[] args) {

		// l -> linhas, c -> colunas, n -> números e m Matriz;

		int[][] m = new int[5][5];

		Set n = new TreeSet();
		Random r = new Random();
		while (n.size() < 25) {
			n.add(r.nextInt(26));
		}

		for (int l = 0; l < 5; l++) {
			for (int c = 0; c < 5; c++) {
				m[l][c] = ((Random) n).nextInt();
			}
		}

		System.out.println("\n A Matriz está: \n");
		for (int l = 0; l < 5; l++) {
			for (int c = 0; c < 5; c++) {
				System.out.printf("\t %d \t", m[l][c]);
			}
			System.out.println();
		}

	}

}
