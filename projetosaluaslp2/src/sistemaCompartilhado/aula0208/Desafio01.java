/**
 * 
 */
package sistemaCompartilhado.aula0208;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
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

		/// Atualização do desafio; 
		
		/// Atualizando o sistema Github; 
		
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

		/// LocalTime time3 = LocalTime.now(GMT+1);

		/// Duration d5 = Duration.between(GMT+1, GMT -3);

		// Duration.TimeZone=GMT+1;
		TimeZone tz = TimeZone.getTimeZone("Europe / Peris");

		ZoneId.of("Europe/Paris").getRules().getOffset(Instant.ofEpochMilli(1_484_063_246L)).getTotalSeconds();

		Instant instant = Instant.ofEpochMilli(14_484_063_246L);
		ZoneId zoneId = ZoneId.of("Europe/Paris");
		ZonedDateTime zdt = instant.atZone(zoneId);

		long now = System.currentTimeMillis();
		long offset = now - 30484063246L * 1000L;
		Date date = new Date(offset);
		DateFormat df = new SimpleDateFormat("HH:mm:ss");

		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d4);
		System.out.println(zdt);
		System.out.println(df.format(date));

		Duration d5 = Duration.between(time1, zdt);
		System.out.println(d5);

		Set<String> allZones = ZoneId.getAvailableZoneIds();
		LocalDateTime dt = LocalDateTime.now();

		// Create a List using the set of zones and sort it.
		List<String> zoneList = new ArrayList<String>(allZones);
		Collections.sort(zoneList);

		for (String s : zoneList) {
			ZoneId zone = ZoneId.of(s);
			ZonedDateTime zonedDateTimedt = dt.atZone(zone);
			ZoneOffset offsetet = zonedDateTimedt.getOffset();
			int secondsOfHour = offsetet.getTotalSeconds() % (60 * 60);
			String out = String.format("%35s %10s%n", zone, offsetet);

			// Write only time zones that do not have a whole hour offset
			// to standard out.
			if (secondsOfHour != 0) {
				System.out.printf(out);
			}

		}

	}

}
