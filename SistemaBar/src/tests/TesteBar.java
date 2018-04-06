package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import business.Bar;
import business.Cliente;

public class TesteBar {
	private Bar B1;
	private Cliente C1, C2;

	@BeforeEach

	public void setUp() {

		B1 = new Bar();
		C1 = new Cliente("Fulano", "123456789", 30, 'M');
		C2 = new Cliente("Beltrano", "987654321", 60, 'F', "1");

	}

	@Test
	public void testInsereCliente() {
		B1.addCliente(C1);
		assertEquals(true, B1.BuscaCpf(C1.getCpf()));
	}

	@Test
	public void removeCliente() {
		B1.addCliente(C1);
		B1.removeCliente(C1.getCpf());
		assertEquals(false, B1.BuscaCpf(C1.getCpf()));
	}

	@Test
	public void testListaClientes() {
		B1.addCliente(C1);
		assertEquals("Fulano", B1.ListaClientes());

	}

	@Test
	public void testBuscaCpf() {
		B1.addCliente(C2);
		assertEquals(true, B1.BuscaCpf("987654321"));

	}

	@Test
	public void testTotalPessoas() {

		B1.addCliente(C1);
		B1.addCliente(C2);
		assertEquals(2, B1.TotalPessoas());

	}

	@Test
	public void testPercentHomem() {
		B1.addCliente(C1);
		B1.addCliente(C2);
		assertEquals(50, B1.porcentHomem());

	}

	@Test
	public void testPercentMulher() {
		B1.addCliente(C2);
		B1.addCliente(C2);
		assertEquals(100, B1.porcentMulher());

	}

	@Test

	public void testSocios() {

		B1.addCliente(C2);
		B1.addCliente(C2);
		assertEquals(2, B1.socios());

	}
@Test 
	public void testNaoSocios() {

		B1.addCliente(C2);
		B1.addCliente(C2);
		assertEquals(0, B1.naoSocios());

	}
	
	
}
