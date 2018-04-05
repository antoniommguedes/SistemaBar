package testes;

import sistema.Bar;
import sistema.Cliente;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
	public void removeCliente(){
		B1.addCliente(C1);
		B1.removeCliente(C1.getCpf());
		assertEquals(false, B1.BuscaCpf(C1.getCpf()));
	}
	
	

}