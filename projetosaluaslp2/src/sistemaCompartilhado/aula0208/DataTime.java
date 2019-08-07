/**
 * 
 */
package sistemaCompartilhado.aula0208;

import java.time.Duration;
import java.time.Instant;

/**
 * @author Daniel
 * @author Frank
 *
 */
public class DataTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Instant inicio = Instant.now();

		try {
			Thread.sleep(1000); // fazer o processador esperar
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Instant fim = Instant.now();

		Duration duracao = Duration.between(inicio, fim);

		System.out.println("duração em nanos segundos" + duracao.toNanos());
		System.out.println("duração em minutos" + duracao.toMinutes());
		System.out.println("duração em horas" + duracao.toHours());
		System.out.println("duração em dias" + duracao.toDays());
		System.out.println("duração em milisegundos" + duracao.toMillis());

	}

}
