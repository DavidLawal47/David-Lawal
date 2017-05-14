package CharAcceptingSim;

public class ArrayvsArraylist {

	public static void main(String[] args) {
		// array is a fixed length of collection of variables that can not change in size while and array list is dynamic
		// and will change in size; both are objects and then must build and array object
		
		
		
		String character = "United_States_Air_Force_Reserves_Of America";
		
		// Type[] arrayName = new Type[length]; how to declare an Array (a single dimension array)
		// this method allows us to split thye value and return an array
		
		String arrCharacter[] = character.split("_|\\ ");   
		/*  The correct way to have multiple delimiters in a split method("_|\\.");
			note if the white space is to close it generates an error message("_|\\") error
			if white space is too far the compiler would only recognize the the underscore being 
			passed through the delimiter
		*/
		
		//String arrCharacter2[] = character.split(" ");
		 
		 System.out.println(arrCharacter.toString());
		 
		// System.out.println(arrCharacter2.);
		
		
		for( int counter = 0; counter<arrCharacter.length; counter++)
		
		{
			System.out.println(arrCharacter[counter]);
			//System.out.println(arrCharacter2[counter]);

		}
		
		// rule of thumb when working with an array you'll be using some type of loop
		// 

}
}
