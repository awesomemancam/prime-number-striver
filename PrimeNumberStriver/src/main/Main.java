package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		System.out.print("Welcome\n");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a floor: ");
		long floor = scanner.nextLong();
		System.out.print("Please enter a ceiling: ");
		long ceil = scanner.nextLong();
		long x = floor;
		while (true) {
			if (x >= ceil)
				break;
			long y = 2;
			while (y <= x/2) {
				if (mod(x,y)) {
					break;
				}
				if (y == x/2)
					System.out.println(x);
				y++;
			}
			x++;
		}
		System.out.println("Done.");
	}
	
	public static boolean mod(long x, long y) {
		
		if (x%y == 0)
			return true;
		return false;
		
	}

}
