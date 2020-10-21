import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// right click the regular class
// new / other / junit test class / click entire class and toString

class SuperStackTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testSuperStack() {
		fail("Not yet implemented");
	}

	@Test
	void testIsEmpty() {
		SuperStack<Integer> stack = new SuperStack<Integer>(0);
		boolean result = stack.isEmpty();
		assertTrue(result);
		
		stack.push(new Double(9.9));
	}

	@Test
	void testIsFull() {
		fail("Not yet implemented");
	}

	@Test
	void testPush() {
		fail("Not yet implemented");
	}

	@Test
	void testPop() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
