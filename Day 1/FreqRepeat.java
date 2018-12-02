import java.io.*;
import java.util.*;

public class FreqRepeat {

	public static void main(String[] args) throws FileNotFoundException {

		int frequency = 0;
		ArrayList<Integer> freqList = new ArrayList<Integer>();

		while (true) {
			Scanner infile = new Scanner(new FileReader("input.txt"));
			while (infile.hasNext()) {
				frequency = frequency + infile.nextInt();

				if (freqList.contains(frequency) {
					System.out.println("First repeated frequency = " + frequency);
					break;
				}

				freqList.add(frequency);
			}
		}
	}
}
