package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class CuentaTest {

	static Cuenta aux;
	static Cuenta cuenta1;
	static Cuenta cuenta2;
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		aux= new Cuenta("89745", "Manuel", 0);
		
		cuenta1 = new Cuenta("12345", "Juan", 50);
		cuenta2 = new Cuenta("67890", "Ana", 0);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		aux.setSaldo(0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {
		
		aux.Ingresar(1000);
		assertEquals(aux.getSaldo(), 1000);// ingresa 1000 --> saldo = 1000
	}
	@Test
	void testRetirar() {
		
		aux.Retirar(100);
		assertEquals(aux.getSaldo(), -100);
	}

	@Test
	void Test0014() {
		assertEquals(cuenta1.getSaldo(), 50);
		assertEquals(cuenta2.getSaldo(), 0);
		
		cuenta1.Retirar(200);
		cuenta2.Retirar(350);
		cuenta1.Ingresar(100);
		cuenta2.Retirar(200);
		cuenta2.Retirar(150);
		cuenta1.Retirar(200);
		cuenta2.Ingresar(50);
		cuenta2.Retirar(100);
		
		assertEquals(cuenta1.getSaldo(), -250);
		assertEquals(cuenta2.getSaldo(), -450);

	
		
	}
}
