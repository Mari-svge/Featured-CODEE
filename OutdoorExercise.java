import java.util.Scanner;
public class OutdoorExercise {

	public static void main(String[] args) {

Scanner key = new Scanner(System.in);

System.out.println("Enter the temperature(in Fahrenheit): ");

int temperature = key.nextInt();


//use || if I want it to be outside of that range and the && to be inside the range
if(temperature < -144 || temperature > 134)
{
	System.out.println("Invalid temperature entered for planet Earth!");
	
	System.exit(0);
}

//use the && sign to show you want values within that range

else if(temperature >= 40 && temperature < 71)
{
	System.out.println("Temperature is too cold!");
}

else if(temperature >= 71 && temperature < 77)
{
	System.out.println("Temperature is ideal for outfoor exercise!");
}
else if(temperature >= 98 && temperature < 111)
{
	System.out.println("Temperature is too hot!");
}
else
{
	System.out.println("Temperature unsuitable for outdoor exercise!");
}
		
		
	}

}
