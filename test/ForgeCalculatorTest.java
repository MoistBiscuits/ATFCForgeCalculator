package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import anvil.*;

class ForgeCalculatorTest {

	ForgeCalculator calculator;
	SmithActionListFactory smithActionListFactory;
	@BeforeEach                                         
    void setUp() {
		calculator = new ForgeCalculator();
		smithActionListFactory = new SmithActionListFactory();
    }
	
	@Test
	void testAxe() {
		List<Integer> expected = Arrays.asList(12,9,6);
		try {
			assertEquals(expected,ForgeCalculator.CalcSmithCost(smithActionListFactory.GetSmithActionList("upset hit punch")));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
