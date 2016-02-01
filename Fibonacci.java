import java.util.Scanner;

public class MyFibonacci {

	public static void main(String a[]){

		int febCount = 30;
		long[] feb = new long[febCount];
		feb[0] = 0;
		feb[1] = 1;
		int flag=0;
		int number=0;
		for(int i=2; i < febCount; i++){
			feb[i] = feb[i-1] + feb[i-2];
		}

		do
		{
			System.out.print("Enter which Fibonacci number to print: ");
			number = new Scanner(System.in).nextInt();
			if(number<1 || number>30)
			{
				System.out.println("Please enter a number between 1 and 30");
				flag=0;
			}
			else
				flag=1;
		}
		while(flag==0);
		for(int i=0; i< febCount; i++){

			if(i==number)
			{
				System.out.print("The "+number+"th fibonacci is "+feb[i] + " ");	 
			}
		}
	}
}
