package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import business.Cliente;

public class TestCliente {

	@BeforeEach

	public void setUp() {

		Cliente C1 = new Cliente("Fulano", "123456789", 30, 'M');
		Cliente C2 = new Cliente("Beltrano", "987654321", 60, 'F', "1");

	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
