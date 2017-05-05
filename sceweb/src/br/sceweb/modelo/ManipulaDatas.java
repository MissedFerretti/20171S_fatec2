package br.sceweb.modelo;

import java.util.Locale;

import org.joda.time.DateTime;

public class ManipulaDatas {
	public static void main(String[] args) {
		DateTime dateTime = new DateTime();
		System.out.println("dateTime.toString()" + dateTime.toString("YYYY-MM-dd"));
		System.out.println("dateTime.toString()" + dateTime.toString("YYYY-MM-dd HH:mm:ss"));
		System.out.println("dateTime.toString()" + dateTime.monthOfYear().getAsText());
		System.out.println("dateTime.toString()" + dateTime.monthOfYear().getAsShortText());
		System.out.println("dateTime.toString()" + dateTime.monthOfYear().getAsText(Locale.ENGLISH));
	}
}
