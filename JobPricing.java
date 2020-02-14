import java.util.Scanner;

public class JobPricing
{
	public static void main(String[] args) 
	{
		//Variables and contants
		String jobName;
		double matPrice;
		int hoursWorked;
		int travTime;
		double estimate;

		//Objects
		Scanner keyboard = new Scanner(System.in);

		//input phase
		System.out.print("Please enter the name for the job >> ");
		jobName = keyboard.nextLine();

		System.out.print("Please enter the cost of the materials >> ");
		matPrice = keyboard.nextDouble();

		System.out.print("Please enter the approx number of hours worked >> ");
		hoursWorked = keyboard.nextInt();

		System.out.print("Please enter the approx time traveled in hours >> ");
		travTime = keyboard.nextInt();

		//output phase
		
		estimate = computeEstimate(matPrice, hoursWorked, travTime);

		displayEstimate(jobName, matPrice, hoursWorked, travTime, estimate);

	}

	public static double computeEstimate(double price, int hours, int time )
	{
		double estimate;
		estimate = price + (35 * hours) + (12 * time);
		return estimate;
	}

	public static void displayEstimate(String n, double m, int h, int t, double e)
	{
		System.out.println("The estimate for " + n + " is $" + String.format("%.2f", e));
	}
}