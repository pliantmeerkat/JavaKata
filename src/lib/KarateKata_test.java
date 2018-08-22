package lib;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class KarateKata_test {
	
	public ArrayList<Integer> sortArray = new ArrayList<Integer>();
	public int expected;
	public int inputInt;
	@BeforeEach
	void initialize() {
		Random rand = new Random();
		for(int i = 0; i < 10000000; i++) {
			int n = rand.nextInt(100000000 + 1);
			sortArray.add(n);
		}
		Collections.sort(sortArray);
		int randindex = rand.nextInt(10000000 - 1);
		inputInt = sortArray.get(randindex);
		expected = randindex;
	}
	
	void searchMethodTest(int resultInput) {
		assertEquals(resultInput, expected);
	}

	@Test
	void chop1Test() {
		searchMethodTest(KarateKata.chop1(inputInt, sortArray));
		// time for test 8 - 10s
	}

	@Test
	void chop2Test() {
		searchMethodTest(KarateKata.chop2(inputInt, sortArray)); // avrg fastest excluding 4
		// time for test 5.2 - 8s 
	}
	
	@Test
	void chop3Test() {
		searchMethodTest(KarateKata.chop3(inputInt, sortArray));
		// time fore test 5.0s - 7.5s
	}
	
	@Test
	void chop4Test() {
		searchMethodTest(KarateKata.chop4(inputInt, sortArray)); // can be buggy
		// time fore test 4.8 - 5.6s
	}

}
