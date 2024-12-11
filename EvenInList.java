import java.util.Scanner;
public class EvenInList {

	public static void main(String[] args) {
		
		Scanner key  = new Scanner(System.in);
		
		System.out.println("Enter the lower bound of a range of numbers: ");

		int lower = key.nextInt();
		
		System.out.println("Enter the upper bound of a range of numbers: ");
		
		int upper = key.nextInt();
		
		for (int i = lower; i <= upper; i++)
		{
			if(i%2 == 0)	
			{
				System.out.print(i+ " ");
			}
		}

		
	}

}