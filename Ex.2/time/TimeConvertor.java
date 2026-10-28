package time;
import java.util.*;
import java.text.DecimalFormat;
public class TimeConvertor
{
	double minute,second,hour;
	Scanner sc= new Scanner (System.in);
	DecimalFormat f = new DecimalFormat("##.###");
	public void convertHourToMinute()
	{
		System.out.println("Enter the Hour:");
		hour=sc.nextDouble();
		minute = hour*60;
		System.out.println("Minutes : "+f.format(minute));
	}
	public void convertMinuteToHour()
	{
		System.out.println("Enter the Minutes:");
		minute=sc.nextFloat();
		hour = minute/60;
		System.out.println("Hours : "+f.format(hour));
	}
	public void convertHourToSecond()
	{
		System.out.println("Enter the Hour:");
		hour=sc.nextFloat();
		second = hour*3600;
		System.out.println("Seconds : "+f.format(second));
	}
	public void convertSecondToHour()
	{
		System.out.println("Enter the Seconds:");
		second=sc.nextFloat();
		hour = second/3600;
		System.out.println("Hour : "+f.format(hour));
	}
}
