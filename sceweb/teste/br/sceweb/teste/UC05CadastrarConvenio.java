package br.sceweb.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Convenio;
import br.sceweb.modelo.ConvenioDAO;

public class UC05CadastrarConvenio {

	static ConvenioDAO convenioDAO;
	static Convenio convenio;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		convenio = new Convenio();
		convenioDAO = new ConvenioDAO();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void CT01UC05CadastrarConvenio_com_sucesso() {
		assertEquals(1, convenioDAO.adiciona(convenio));
	}

	@Test
	public void CT01UC05CadastrarConvenio_dti_invalida() {
		assertFalse(convenio.validaData("42/05/2017"));
	}
	
	@Test
	public void CT01UC05CadastrarConvenio_dti_valida() {
		assertTrue(convenio.validaData("02/05/2017"));
	}
	
	@Test
	public void CT01UC0XInserirCNPJ_invalido() {
		//assertEquals("CNPJ inválido", convenio.setCnpj(""));
	}
}
