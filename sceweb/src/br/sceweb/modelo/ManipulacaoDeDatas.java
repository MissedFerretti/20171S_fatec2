package br.sceweb.modelo;

import java.util.Locale;

import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.Months;
import org.joda.time.Years;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

public class ManipulacaoDeDatas {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(ManipulacaoDeDatas.class);
		
		DateTime dateTime = new DateTime();
		System.out.println("dateTime.toString()" + dateTime.toString("YYYY-MM-dd"));
		System.out.println("dateTime.toString()" + dateTime.toString("YYYY-MM-dd HH:mm:ss"));
		System.out.println("dateTime.toString()" + dateTime.monthOfYear().getAsText());
		System.out.println("dateTime.toString()" + dateTime.monthOfYear().getAsShortText());
		logger.info("dateTime.toString()" + dateTime.monthOfYear().getAsText(Locale.ENGLISH));
		
		//formatacao da data

		DateTimeFormatter fmt = DateTimeFormat.forPattern("dd-MM-YYYY");

		// Alternativa 1

		System.out.println(fmt.print(dateTime));

		// Alternativa 2

		System.out.println(dateTime.toString(fmt));

		// Efetuando parse da string no formato "dd-MM-YYYY"

		dateTime = fmt.parseDateTime("21-12-2012");

		System.out.println(dateTime.toString(fmt));

		// Imprimindo no formato ISO8601

		fmt = ISODateTimeFormat.dateTime();

		System.out.println(fmt.print(dateTime));
		
		DateTime dataFinal = new DateTime();

		System.out.println("data final - hoje = " + dataFinal.toString("dd-MM-YYYY"));

		DateTime dataInicio = new DateTime(2015, 1, 1, 0, 0);

		System.out.println("data inicio - inicio do ano = " + dataInicio.toString("dd-MM-YYYY"));

		Days d = Days.daysBetween(dataInicio, dataFinal);

		System.out.println("Diferenša dias:" + d.getDays());

		Years y = Years.yearsBetween(dataInicio, dataFinal);

		System.out.println("Diferenša anos:" + y.getYears());

		Hours h = Hours.hoursBetween(dataInicio, dataFinal);

		System.out.println("Diferenša horas:" +h.getHours());

		Months m = Months.monthsBetween(dataInicio, dataFinal);

		System.out.println("Diferenša meses:" + m.getMonths());
	}

}
