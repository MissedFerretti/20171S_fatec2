package br.sceweb.modelo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.apache.log4j.Logger;

public class Convenio {
	Logger logger = Logger.getLogger(Convenio.class);

	private String cnpj;

	public void setCnpj(String cnpj) {
		if (cnpj.length() == 14)
			this.cnpj = cnpj;
		else 
			throw new IllegalArgumentException("CNPJ inválido");
	}

	public boolean validaData(String data) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		df.setLenient(false); // exige que o formato seja exatamente igual ao
								// fornecido
		try {
			df.parse(data);
			return true;
		} catch (ParseException e) {
			logger.error("Erro na validacao de data - " + e.getMessage());
			return false;
		}
	}

}
