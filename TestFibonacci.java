package fibonacci;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TestFibonacci {                                       
	
	/*
	@Test
	public void IsANumber() {
		
	}
	*/
	
	//PARTICION EQUIVALENTE
	// |-9999 a 0| 1-20 |21 a 9999|
	// |invalido |valido| invalido 
	
	@Test
	public void invalidPartition1() {
		Fibonacci fib = new Fibonacci(-10);
		
		assertEquals(fib.getListaFibonacci()[0],-3);
	}
	
	@Test
	public void invalidPartition2() {
		Fibonacci fib = new Fibonacci(99);
		
		assertEquals(fib.getListaFibonacci()[0],-1);
	}
	
	@Test
	public void validPartition() {
		Fibonacci fib = new Fibonacci(5);
		int test[] =new int[5];
		
		test[0] = 0;
		test[1] = 1;
		test[2] = 1;
		test[3] = 2;
		test[4] = 3;
		assertArrayEquals(fib.getListaFibonacci(),test);
	}
	
	//Analisis de Valor Limite
	//0,20
	@Test
	public void LimitTest1() {
		Fibonacci fib = new Fibonacci(1);
		int test[] = {0};
		
		assertArrayEquals(fib.getListaFibonacci(),test);
		
	}
	@Test
	public void ZeroTest() {
		Fibonacci fib = new Fibonacci(0);
		int test[] =new int[1];
		
		test[0] = -2;
		assertArrayEquals(fib.getListaFibonacci(),test);
		
	}
	@Test
	public void LimitTest2() {
		Fibonacci fib = new Fibonacci(20);
		int test[] = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181};
		assertArrayEquals(fib.getListaFibonacci(),test);
		
	}
	
	//-----------------------------
	@Test
	public void lengthTest() {
		Fibonacci fib = new Fibonacci(5);
		
		assertEquals(fib.getListaFibonacci().length,5);
	}
	@Test
	public void NullTest() {
		Fibonacci fib = new Fibonacci(0);
		assertNotNull(fib);
	}
}

