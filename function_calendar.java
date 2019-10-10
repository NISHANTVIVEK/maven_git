import java.util.Scanner;

public class function_calendar {
	public static void main(String[] args) {
		int year, month, x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year");
		year = sc.nextInt();
		System.out.println("Enter month");
		month = sc.nextInt();
		x = daysinmonth(month, year);
		System.out.println("Year:" + year + "Month " + "has" + x + "days");
	}



	static boolean isLeapYear(int year) {
		if ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0))) {

			return true;
		}

		else
			return false;

	}

	static int daysinmonth(int month,int year)
	{
		int y;
		if (isLeapYear(year) == true) {
           y=29;			
		}

		else
			y=28;
		switch(month)
		{
		case 1:
		{}
		case 3:
		{}
		case 5:{}
		case 7:{}
		case 8:{}
		case 10:{}
		case 12:
		{
			return 31;
			
		}
		
		case 2:
		{
			return y;
			
		}
		case 4:{}
		case 6:{}
		case 9:{
			return 30;
		
		}
	}
		
	
	return y;
	}
	}
