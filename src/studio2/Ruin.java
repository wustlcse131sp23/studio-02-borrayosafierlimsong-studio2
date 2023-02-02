package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner in = new Scanner (System.in);
		System.out.println("startAmount: ");
		double startAmount = in.nextDouble();
		double originalAmount=startAmount;
		
		System.out.println("winChance: ");
		double winChance = in.nextDouble();

		System.out.println("winLimit: ");
		double winLimit = in.nextDouble();

			
		for (int day=0;day<5; day++) {
			startAmount=originalAmount;

			while (startAmount < winLimit&& startAmount>0) {

				if (Math.random () < winChance ) {
					startAmount++;
				}
				else {
					startAmount--;
				}

				System.out.println("Amount you have now: "+startAmount);
				
			}
			System.out.println();
		}











	}

}
