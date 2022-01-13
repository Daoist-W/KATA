
public class TestFactorial {

	@Test
	public void shouldFindFactorial() {
		String result = Factorial.findFactorial(120);

		assertEquals("5!", result);
	}

	@Test
	public void shouldFindNone() {
		String result = Factorial.findFactorial(777);

		assertEquals("NONE", result);
	}
}