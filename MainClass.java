import java.util.Random;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner dec = new Scanner(System.in);
		int freq[]=new int [7];
		int howmany;
		System.out.println("How many rolls");
		howmany = dec.nextInt();
		
		for(int roll=1;roll<howmany;roll++) {
			++freq[1+rand.nextInt(6)];
		}
		
		System.out.println("Face\tFrequency");
		
		for(int counter =1; counter<freq.length;counter++) {
			System.out.println(counter+"\t"+freq[counter]);
		}
	}
}

