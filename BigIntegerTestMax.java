import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigInteger;

class BigIntegerTestMax {

	@Test
	public void testMaxPositiveNumbers() {
		BigInteger num1 = new BigInteger("123456789");
		BigInteger num2 = new BigInteger("987654321");
		
		BigInteger max = num2.max(num1);
		assertEquals(num2, max);

		max = num1.max(num2);
		assertEquals(num2, max);
	}

	@Test
	public void testMaxNegativeNumbers() {
		BigInteger num1 = new BigInteger("-123456789");
		BigInteger num2 = new BigInteger("-987654321");
		BigInteger max = num1.max(num2);
		assertEquals(num1, max);

		max = num2.max(num1);
		assertEquals(num1, max);
	}

	@Test
	public void testMaxPositiveAndNegativeNumbers() {
		BigInteger num1 = new BigInteger("123456789");
		BigInteger num2 = new BigInteger("-987654321");
		BigInteger max = num1.max(num2);
		assertEquals(num1, max);

		max = num2.max(num1);
		assertEquals(num1, max);
	}

	@Test
	public void testMaxEqualNumbers() {
		BigInteger num1 = new BigInteger("123456789");
		BigInteger num2 = new BigInteger("123456789");
		BigInteger max = num2.max(num1);
		assertEquals(num1, max);
		assertEquals(num2, max);

		num1 = new BigInteger("-123456789");
		num2 = new BigInteger("-123456789");
		max = num2.max(num1);
		assertEquals(num1, max);
		assertEquals(num2, max);
	}

	@Test
	public void testMaxWithNullValue() {
		BigInteger num1 = new BigInteger("123456789");
		BigInteger num2 = null;

		BigInteger max = num1.max(num2);
        assertEquals(num1, max);

	}

}

