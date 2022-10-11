package JavaCore;
import java.util.Scanner;
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.Write a Java program to print Hello; n screen and then print your name on a separate line
		System.out.println("Hello\nPrathi");
		
		//2.Write a Java program to print the sum of two numbers
		System.out.println("-----Write a Java program to print the sum of two numbers--------");
		int x=4, y=36;
		System.out.println("Sum of x and y values : "+(x+y));
		
		//3.Swap two numbers
		System.out.println("--------Write a Java program to swap two numbers---------");
		int a=10, b=20;
		System.out.println("Before swapping \na="+ a + "\n" + "b=" + b);
		int c=a;
		a=b;
		b=c;
		System.out.println("After swapping \na="+ a + "\n" + "b=" + b);
		
		//1.Write a Java program to get a number from the user and print whether it is positive or negative​
		System.out.println("------Java program to get a number from the user and print whether it is positive or negative-----");
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num = sc.nextInt();//reading a number from the user 
		if(num>0)
		{
			System.out.println("The number is positive.");  
		}
		else if(num<0)
		{
			System.out.println("The number is negative.");  
		}
		else
		{
			System.out.println("The number is zero.");
		}
				
				
		//2.Write a Java program to find the greatest of 3 numbers.
		System.out.println("-------Java program to find the greatest of 3 numbers--------");
		int m,n,p;
		Scanner a1 =new Scanner(System.in);
		System.out.print("Enter the value of m:");
		m=a1.nextInt();
		System.out.print("Enter the value of n:");
		n=a1.nextInt();
		System.out.print("Enter the value of p:");
		p=a1.nextInt();
		if((m>=n)&&(m>=p))
		{
			System.out.println(m + " is the greatest number");
		}
		else if((n>=m) && (n>=p))
		{
			System.out.println(n + " is the greatest number");
		}
		else
		{
			System.out.println(p + " is the greatest number");
		}
				
				//3.Write a Java program to find the number of days in a month using switch case statement.​
				System.out.println("------Java program to find the number of days in a month using switch case statement--------");
				int month;
				Scanner n1 = new Scanner(System.in);
				System.out.print("Enter month in number: ");
				month = n1.nextInt();
				switch (month)
				{
					case 1:
						System.out.println("January has 31 days");
						break;
					
					case 2:
						System.out.println("February has 28 days");
						break;
					
					case 3:
						System.out.println("March has 31 days");
						break;
						
					case 4:
						System.out.println("April has 30 days");
						break;
						
					case 5:
						System.out.println("May has 31 days");
						break;
						
					case 6:
						System.out.println("June has 30 days");
						break;
						
					case 7:
						System.out.println("Jully has 31 days");
						break;
						
					case 8:
						System.out.println("August has 31 days");
						break;
						
					case 9:
						System.out.println("September has 30 days");
						
						break;
						
					case 10:
						System.out.println("October has 31 days");
						break;
					
					case 11:
						System.out.println("November has 30 days");
						break;
					
					case 12:
						System.out.println("December has 31 days");
						break;
					
					default:
						System.out.println("Incorrect month value");
						break;
				}
				//4.Write a Java program that takes a year from user and print whether that year is a leap year or not.​
				//Check if the year is divisible by 4 but not 100, DISPLAY "leap year"
				//Check if the year is divisible by 400, DISPLAY "leap year"
				System.out.println("--------program that takes a year from user and print whether that year is a leap year or not-------​");
				int year;
				System.out.print("Enter year : ");
				Scanner yr=new Scanner(System.in);
				year=yr.nextInt();
				if ((year%4==0) && (year%100!=0) || (year%400==0))
				{
					System.out.println("It is leap year.");	
				}
				else
				{
					System.out.println("It is not leap year.");
				}
				
				 // 5.Write a Java to display the multiplication table of a given integer using for loop
				System.out.println("---------Write a Java to display the multiplication table of a given integer using for loop--------");
				int num1,m1;
				Scanner s = new Scanner(System.in);  
				System.out.print("Enter multiplication table number: ");
				num1=s.nextInt();
				for(m1=1; m1 <= 10; m1++)
				{
					System.out.println(m1 +" * " + num1 + " = " + num1*m1 );
				}
				
				
				//6.Write a Java program count the number of digits of the number using while loop.
				System.out.println("------Write a Java program count the number of digits of the number using while loop------");
				int number, digit, sum = 0;
				Scanner sc1 = new Scanner(System.in);
				System.out.print("Enter the number: "); 
				number = sc1.nextInt();
				while(number > 0) 
				{
					digit = number % 10; 
					sum = sum + 1;
					number = number / 10;
				}
				System.out.println("Sum of Digits: "+sum);
				
				//7.Write a Java program to reverse a number using while loop
				System.out.println("-------------Write a Java program to reverse a number using while loop----------");
				int number1; int digit1=0; int reverse = 0;
				Scanner sc3 = new Scanner(System.in);
				System.out.print("Enter number: ");
				number1 = sc3.nextInt();
				while(number1 > 0) 
				{
				digit1 = number1 % 10;
				reverse=(reverse*10)+digit1;
				number1 = number1/ 10;
				}
				System.out.println("Reverse:" + reverse);
		
		//8. Write a Java program to check Number is Palindrome or not using while loop.​ (Reverse of 121 is 121,
		//so it is palindrome)
		System.out.println("-------Java program to check Number is Palindrome or not using while loop-----------");
		  int r,d,sum1=0,temp;
		  Scanner inp = new Scanner(System.in);
		  System.out.println("Enter the number variable to be checked for palindrome: ");
		  d = inp.nextInt();
		  temp=d;
		  while(d>0)
		  {
			  r=d%10;  //getting remainder
		   sum1=(sum1*10)+r;
		   d=d/10;
		  }
		  if(temp==sum1)
			  System.out.println("palindrome number ");
		  else
		   System.out.println("not palindrome");
		  
		//9.Write a Java Program to print factorial of a given number using any loop
	     int j,fact=1;  
	      int num2=5;    
	      for(j=1;j<=num2;j++)
	      {    
	          fact=fact*j;    
	      }    
	      System.out.println("Factorial of "+num2+" is: "+fact);    
	    
		
		//10. Fibonacci series- Write a program to print Fibonacci Series in the range of 1 to 50. Series: (1, 1, 2, 3, 5, 8, 13...)
		System.out.println("-------------program to print Fibonacci Series in the range of 1 to 50------------");
		int s1=1,s2=1,s3,i,count=50;       
		 System.out.print(s1);   
		 for(i=1;i<count;i++)
		 {    
		  s3=s1+s2;    
		  System.out.print(" "+s3);    
		  s1=s2;    
		  s2=s3; 
		 }    
		
		
	}//main

}//class
