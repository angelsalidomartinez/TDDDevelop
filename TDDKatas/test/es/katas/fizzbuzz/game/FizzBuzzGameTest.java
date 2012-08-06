package es.katas.fizzbuzz.game;

import org.junit.Before;
import org.junit.Test;
import junit.framework.Assert;

public class FizzBuzzGameTest{

	public static final String ONE ="1";
	public static final String FIZZ="FIZZ";
	public static final String BUZZ ="BUZZ";
	
	private FizzBuzzGame fizzBuzzGame;
	private String fizzBuzzGameResult;
	
	@Before
	public void setUp(){
		fizzBuzzGame = new FizzBuzzGame();
		fizzBuzzGameResult = "";
	}
	
	@Test
	public void test_numberIsNotDivisibleByThreeAndFive(){
		String fizzBuzzGameResult = fizzBuzzGame.retrieveFizzOrBuzzOrNumber(1);
		Assert.assertEquals(ONE,fizzBuzzGameResult);
	}
	@Test
	public void test_numberIsThreeTheReturnFizz(){
		String fizzBuzzGameResult = fizzBuzzGame.retrieveFizzOrBuzzOrNumber(3);
		Assert.assertEquals(FIZZ,fizzBuzzGameResult);		
	}
	
	@Test
	public void test_numberIsFiveThenReturnBuzz(){
		fizzBuzzGameResult = fizzBuzzGame.retrieveFizzOrBuzzOrNumber(5);
		Assert.assertEquals(BUZZ,fizzBuzzGameResult);
	}
	
	@Test
	public void test_numberIsDivisibleByThreeAndFive(){
		fizzBuzzGameResult = fizzBuzzGame.retrieveFizzOrBuzzOrNumber(15);
		Assert.assertEquals(FIZZ+BUZZ,fizzBuzzGameResult);
	}
	
}
