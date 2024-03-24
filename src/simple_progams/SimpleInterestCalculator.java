package simple_progams;

import java.util.Scanner;

public class SimpleInterestCalculator {

	public static void main(String[] args) {
		
		System.out.println("Simple Interest Calculator");
		Scanner input=new Scanner(System.in);
		System.out.println("Enter principal amount: ");
		 int principalamount=input.nextInt();
		 System.out.println("principal amount: "+principalamount);
		 System.out.println("Enter rate of interest: ");
		 int rateofinterest=input.nextInt();
		 System.out.println("rate of interest : " +rateofinterest);
		 System.out.println("Enter time period : ");
		 int timeperiod=input.nextInt();
		 System.out.println("time period: "+timeperiod);
		 int simple_interest=((principalamount*rateofinterest*timeperiod)/100);
		 System.out.println("The result Simple Interest of the above mentioned data is :"+simple_interest);
		 input.close();
		 
	}

}
