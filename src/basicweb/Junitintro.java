package basicweb;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junitintro {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Executed BeforeClass...");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Executed AfterClass...");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Executed Before...");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Executed After...");
	}

	@Test
	public void test1() {
		System.out.println("Executed Test1...");
	}

	@Test
	public void test2() {
		System.out.println("Executed Test2...");
	}

}
