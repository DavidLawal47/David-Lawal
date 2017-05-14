/*
 * The main function of this program is; 
 * As a user, I need a feature where if I give a name, and if the name is longer or equal to 30
 * characters, make the name less than 30 in length. Then, I need the original name printed along with 
 * the modified name. If the name is not modified, give original name with "length is okay" status
 * This will ensure all names are within the boundaries of no more than 30 characters.  
 */

package CharAcceptingSim;

import java.util.*;

public class CharSim {

	public static void main(String[] args) {
		
		
		String character = "first_PlaceHolde_MIDDLE_Placeholder_lastPlaceholder";
		
		System.out.println(characterRemover(character));
		
		String nameHlder = characterRemover(character);
		
		System.out.println(nameHlder + "\n " + nameHlder.length());
		
			
}

	public static String characterRemover(String character) {

		while (character.length() > 30) {
			
			character = character.substring(0, character.length() - 1);
			//System.out.println(character + "\n " + character.length());
			
		}
		
		return character;

	}
}
