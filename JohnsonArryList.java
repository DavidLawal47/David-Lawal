
package johnsonArrylist;

import java.util.ArrayList;
import java.util.Iterator;


public class JohnsonArryList {

		public static void main(String[] arg) {
			
			// List of Air Force Ranks
			ArrayList<String> rankList = new ArrayList<>();
			rankList.add("Airman Basic");
			rankList.add("Airman");
			rankList.add("Airman First Class");
			rankList.add("Senior Airman");
			rankList.add("Staff Sergent");
			rankList.add("Technical Sergent");
			rankList.add("Master Sergent");
			rankList.add("Senior Master Sergent");
			rankList.add("Chief Master Sergent");
			
			/**Java 1st Generation Looping**/
			System.out.println("*******Java 1st(Java 1.1+) Generation Looping*******");
			System.out.println("----List Printed w/While-Loop----");
			int ctrOfWhileLoop = 0;
			while(ctrOfWhileLoop < rankList.size())
			{
				System.out.println(rankList.get(ctrOfWhileLoop)); //<---
				ctrOfWhileLoop++;
			}
			
			//Reseted variable to use effectively in Do-While Loop
			ctrOfWhileLoop = 0;
			System.out.println("----List Printed w/Do-While-Loop----");
			do
			{
				System.out.println(rankList.get(ctrOfWhileLoop)); //<---
				ctrOfWhileLoop++;
			}while(ctrOfWhileLoop < rankList.size());
			
			System.out.println("----List Printed w/For-Loop----");
			for(int ctr = 0; ctr < rankList.size(); ctr++)
			{
				System.out.println(rankList.get(ctr)); //<---
			}
			System.out.println("*******************************************");
			
			/**Java 2nd Generation Looping**/
			System.out.println("*******Java 2nd(Java 1.4 or 1.5+) Generation Looping (Iterator type object in For-Loop compare 1st Gen ForLooping)*******" 
					+ " able to apply same method in other loops.");
			for (Iterator iterator = rankList.iterator(); iterator.hasNext();) {
				String rankListValue = (String) iterator.next();
				System.out.println(rankListValue); //<---
			}
			System.out.println("*******************************************");
			System.out.println("********Java 3rd(Java 1.6 or 1.7+) Generation Looping (Enhance For-Loop; compare 1st & 2nd Gen ForLooping)********");
			for(String rnkListVal: rankList)
			{
				System.out.println(rnkListVal); //<---
			}
			System.out.println("*******************************************");
			
			System.out.println("********Java 4th(Java 1.8+) Generation Looping (Lambda Expression For-Loop; compare 1st & 2nd & 3rd Gen ForLooping)********");
			
			rankList.forEach(itr -> System.out.println(itr)); //<---
			
			System.out.println("*******************************************");
			
			
			
		}

	}


