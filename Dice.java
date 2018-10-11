package lab6;

import java.util.Scanner;
import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cont = "yes";

		System.out.println("Welcome to Grand Circus Casino!");

		while (cont.equalsIgnoreCase("yes")) {
			System.out.println("How many sides should each dice have?");
			scan.hasNext();
			int side = scan.nextInt();
			System.out.println("Roll 1:");
			System.out.println(roll(side));
			System.out.println(roll(side));

			System.out.println("Do you want to continue? (yes/no)");
			cont = scan.next();
		}
		System.out.println("Bye!");
		scan.close();
	}
	
	public static int roll(int num) {
		Random rand = new Random();
		int low = 1;
		num = rand.nextInt(num-low);
		
		return num;
	}

}
