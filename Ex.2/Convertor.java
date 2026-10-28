/*    
To run this

javac currency/*.java distance/*.java time/*.java Convertor.java


*/
import currency.*;
import distance.*;
import time.*;
import java.util.Scanner;
public class Convertor
{
	public static void main (String[] args)
	{
		int code,currency_code,distance_code,time_code;
		Scanner sc = new Scanner(System.in);
		CurrencyConvertor currency= new CurrencyConvertor();
		DistanceConvertor distance = new DistanceConvertor();
		TimeConvertor time = new TimeConvertor();
		System.out.println("Enter the code 1: Currency\n2:Distance\n3:Time");
		code = sc.nextInt();
		if(code == 1)
		{
			System.out.println("Enter the Currency code 1:Euro\n2:Dollar\n3:Yen");
			currency_code = sc.nextInt();
			if(currency_code==1)
			{
				currency.convertInrToEuro();
				currency.convertEuroToInr();
			}
			else if(currency_code==2)
			{
				currency.convertInrToDollar();
				currency.convertDollarToInr();
			}
			else if(currency_code==3)
			{
				currency.convertInrToYen();
				currency.convertYenToInr();
			}
			else
			{
				System.out.println("Invalid Code");
			}
		}
		else if(code == 2)
		{
			System.out.println("Enter the Distance code 1:Mter\n2:Miles");
			currency_code = sc.nextInt();
			if(currency_code==1)
			{
				distance.convertMeterToKm();
				distance.convertKmToMeter();
			}
			else if(currency_code==2)
			{
				distance.convertMilesToKm();
				distance.convertKmToMiles();
			}
			else
			{
				System.out.println("Invalid Code");
			}
		}
		else if(code == 3)
		{
			System.out.println("Enter the Time code 1:Minutes\n2:Seconds");
			currency_code = sc.nextInt();
			if(currency_code==2)
			{
				time.convertHourToSecond();
				time.convertSecondToHour();
			}
			else if(currency_code==1)
			{
				time.convertHourToMinute();
				time.convertMinuteToHour();
			}
			else
			{
				System.out.println("Invalid Code");
			}
		}
		else
		{
			System.out.println("Invalid Code");

		}
	}
}