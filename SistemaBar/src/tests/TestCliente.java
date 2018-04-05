package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import business.Cliente;

public class TestCliente {

	
	private Cliente C1, C2;
	@BeforeEach

	public void setUp() {

		C1 = new Cliente("Fulano", "123456789", 30, 'M');
		C2 = new Cliente("Beltrano", "987654321", 60, 'F', "1");

	}

	@Test
	public void testCriaSocio() {
		assertEquals("Beltrano", C2.getNome());
		assertEquals("987654321", C2.getCpf());
		assertEquals(60, C2.getIdade());
		assertEquals('F', C2.getGenero());
		assertEquals("1", C2.getSocio());
	}

}
