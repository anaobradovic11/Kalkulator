package Kalkulator;

import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner;
		scanner = new Scanner(System.in);
		String s;
		do {
		 s= scanner.nextLine();
		 if(s.equals("")) {
			 continue;
		 }
			}while(!s.equals("kraj"));

}
}