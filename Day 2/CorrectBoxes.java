import java.io.*;
import java.util.*;

public class CorrectBoxes {
	
	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<char[]> arrayOfIds = new ArrayList<char[]>(250);

		Scanner infile = new Scanner(new FileReader("input.txt"));
			

		while(infile.hasNext()) {
			//arrayOfIds = ensureCapacity(arrayOfIds);
			String boxId = infile.nextLine();
			char[] boxArray = boxId.toCharArray();

			arrayOfIds.add(boxArray);
		}

		//Find the two Ids that differ by one character
		char[] firstCorrectId = new char[26];
		char[] secondCorrectId = new char[26];
        
		for (int i = 0; i < arrayOfIds.size(); i++) {
			for (int j = i+1; j < arrayOfIds.size(); j ++) {
				if(differByOne(arrayOfIds.get(i), arrayOfIds.get(j))) {
					firstCorrectId = arrayOfIds.get(i);
					secondCorrectId = arrayOfIds.get(j);
					break;
				}
			}
		}

		//Get common letters between two correct Ids
		ArrayList<Character> commonLetters = new ArrayList<Character>(26);

		for(int i = 0; i < firstCorrectId.length && i < secondCorrectId.length; i++) {
			if(firstCorrectId[i] == secondCorrectId[i]) {
				commonLetters.add(firstCorrectId[i]);
			}
		}

	    System.out.print("commonLetters = ");
		for (int i = 0; i < commonLetters.size(); i++) {
	    	System.out.print(commonLetters.get(i));
	    }
		System.out.println(" ");
	
	}

	static boolean differByOne(char[] firstId, char[] secondId) {
		int numberOfDifferences = 0;
		for (int i = 0; i < firstId.length && i < secondId.length; i++) {
			if (firstId[i] != secondId[i]) {
				numberOfDifferences +=1;
			}
		}

		if(numberOfDifferences == 1) {
			return true;
		}

		return false;
	}

	/* 
	* Not a necessary method because I defined my ArrayList to be the length
	* of the input file (also should be for an ArrayList of char[], not a char[][]):
	*
	*	static char[][] ensureCapacity(char[][] array) {
	*		char[][] biggerArray = new char[array.length + 1][26];
    *
	*		for (int i = 0; i < array.length; i ++) {
	*			for (int j = 0; j < array[i].length; j ++) {
	*				biggerArray[i][j] = array[i][j];
	*			}
	*		}
	*		
	*		for (int i = biggerArray.length; i == array.length; i--) {
	*			for (int j = 0; j < biggerArray[i].length; j++) {
	*				biggerArray[i][j] = 0;
	*			}
	*		}
    *
	*		return biggerArray;
	*	}
    *
	*/
}