import java.io.*;
import java.util.*;

public class Frequency {

	public static void main(String[] args) throws FileNotFoundException {

		int frequency = 0;

		Scanner infile = new Scanner(new FileReader("input.txt"));
		while (infile.hasNext()) {
			frequency = frequency + infile.nextInt();
		}

		System.out.println("Final frequency = " + frequency);
	}
}