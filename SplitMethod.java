package CharAcceptingSim;

public class SplitMethod {

	public static void main(String[] args) {
String character = "Congradulations_on_understanding_the_split method.not bad_;";
		
		String arrCharacter[] = character.split("_|\\.|\\;|\\ ");
		
		System.out.println(arrCharacter.toString());
		
		for(int counter = 0; counter<arrCharacter.length ; counter++){
			
			System.out.println(arrCharacter[counter]);

	}
	}
	
}
