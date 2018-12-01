import java.io.*;
import java.util.*;

public class FreqRepeat {

	public static void main(String[] args) throws FileNotFoundException {

		int frequency = 0;
		ArrayList<Integer> freqList = new ArrayList<Integer>();
		int firstRepeat = -2147483648;

		while (firstRepeat == -2147483648) {

			Scanner infile = new Scanner(new FileReader("input.txt"));
			
			while (infile.hasNext()) {
				frequency = frequency + infile.nextInt();

				if (freqList.contains(frequency)) {
					firstRepeat = frequency;
					System.out.println("First repeated frequency = " + firstRepeat);
					break;
				}

				freqList.add(frequency);
			}
		}
	}
}