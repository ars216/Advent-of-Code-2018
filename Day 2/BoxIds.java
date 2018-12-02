import java.io.*;
import java.util.*;

public class BoxIds {
	
	public static void main(String[] args) throws FileNotFoundException{

		int countTwos = 0;
		int countThrees = 0;

		int[] letterCounts = new int[26];
		char[] alphabet = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		Scanner infile = new Scanner(new FileReader("input.txt"));
		
		while (infile.hasNext()) {
			String boxId = infile.nextLine();
			char[] boxArray = boxId.toCharArray();

			for (int i = 0; i < boxArray.length; i++) {
				for (int j = 0; j < alphabet.length; j++) {
					if(boxArray[i] == alphabet[j]) {
						letterCounts[j] += 1;
					}
				}
			}

			for (int i = 0; i < letterCounts.length; i ++) {
				if (letterCounts[i] == 2) {
					countTwos +=1;
					break;
				}
			}

			for (int i = 0; i < letterCounts.length; i++) {
				if (letterCounts[i] == 3) {
					countThrees += 1;
					break;
				}
			}

			//clear letterCounts
			for (int i = 0; i < letterCounts.length; i++) {
				letterCounts[i] = 0;
			}
		}

		int checkSum = countTwos*countThrees;
		System.out.println("checkSum = " + checkSum);
	}
}