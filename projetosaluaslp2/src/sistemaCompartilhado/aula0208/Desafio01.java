/**
 * 
 */
package sistemaCompartilhado.aula0208;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.TimeZone;

/**
 * @author Daniel
 * @author Frank
 *
 */

public class Desafio01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Calcular as difrenssas enyre hooras e segundos ebtre o Brazil e a europa

		/// Pesquisa sendo desenvolvido no siste,a compartilhado.

		/// Comesando o sistema;

		Instant inicio = Instant.now();

		try {
			Thread.sleep(1000); // fazer o processador esperar
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Instant fim = Instant.now();

		LocalDateTime dt1 = LocalDateTime.now();
		LocalDateTime dt2 = LocalDateTime.of(2019, 1, 1, 23, 0, 0);

		LocalTime time1 = LocalTime.now();
		LocalTime time2 = LocalTime.of(23, 0, 0);

		Duration duracao = Duration.between(inicio, fim);

		Duration d1 = Duration.between(Instant.now().plusSeconds(1000), Instant.now().plusSeconds(1000));

		Duration d2 = Duration.between(Instant.now().plusSeconds(1000), Instant.now().plusSeconds(1000));

		Duration d3 = Duration.between(dt1, dt2);

		Duration d4 = Duration.between(time1, time2);

		TimeZone tz = TimeZone.getTimeZone("England / London");

		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(tz);

	}

}
