package es.katas.fizzbuzz.game;

public class FizzBuzzGame {

	public static final String FIZZ ="FIZZ";
	public static final String BUZZ ="BUZZ";
	public static final Integer NUMBER_FIZZ = 3;
	public static final Integer NUMBER_BUZZ = 5;
	public static final String BLANK="";
	
	public String retrieveFizzOrBuzzOrNumber(Integer i) {
		
		String fizzBuzzGameResult = BLANK;

		if( i % NUMBER_FIZZ == 0){
			fizzBuzzGameResult += FIZZ;
		}
		
		if(i % NUMBER_BUZZ == 0){
		   fizzBuzzGameResult += BUZZ;
		}
		
		if(BLANK.equalsIgnoreCase(fizzBuzzGameResult)){
			fizzBuzzGameResult = i.toString();
		}
		
		return fizzBuzzGameResult;
	}
	
	public static void main(String[] args) {
		FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
		
		for (int i = 0; i < Integer.parseInt(args[0]); i++) {			
			StringBuilder sbPupilFizzBuzzGame = new StringBuilder("Pupil "+i+" says --> "); 			
			System.out.println(sbPupilFizzBuzzGame.toString()+ fizzBuzzGame.retrieveFizzOrBuzzOrNumber(i));
		}
	}
}
