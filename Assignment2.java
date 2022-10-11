package JavaCore;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		
		// 1.Write a Java program to calculate sum values of an array.​
		System.out.println("--------Write a Java program to calculate sum values of an array.............");
		int[] array = { 1, 2, 3, 4, 8, 9, 1 };
		//System.out.println(array); --this stmt is throwing error.
		System.out.println(Arrays.toString(array)); // calling toString method
		int len, sum = 0;
		len = array.length;
		for (int i = 0; i < len; i++) {
			sum = sum + array[i];
		}

		System.out.println("Sum of array values: " + sum);

		// 2.Write a Java program to calculate average of values of an array.
		System.out.println("--------Write a Java program to calculate average of values of an array.​----------");
		sum = 0;
		for (int j = 0; j < len; j++) {
			sum = sum + array[j];

		}
		float avg = sum / len;
		System.out.println("Average of values of array: " + avg);

		// write a program to find odd and even numbers in an array
		System.out.println("-------Write a program to find odd and even numbers in an array----");
		System.out.println("Odd numbers in the array are:");
		for (int i = 0; i < len; i++) {
			if (array[i] % 2 != 0) {
				System.out.println(array[i]);
			}
		}
		System.out.println("Even numbers in the array are:");
		for (int i = 0; i < len; i++) {
			if (array[i] % 2 == 0) {
				System.out.println(array[i]);
			}
		}
		//4.Write a program to find the missing elements in a array
		System.out.println("-------Write a program to find missing elements an an array---------");
		int []array1= {1,2,3,4,8,9,1};
		int []array2= {1,2,3,8,9,1};
		int sum1=0;
		for (int i=0;i<array1.length;i++)
		{
			sum1=sum1+array1[i];
		}
		int sum2=0;
		for (int i=0;i<array2.length;i++)
		{
			sum2=sum2+array2[i];
		}
		System.out.println("Missing element in the array2 : "+ (sum1-sum2));
		
		
		//5.Write a program to find the smallest and greatest element in an array
		System.out.println("--------Write a program to find the smallest and greatest element in an array---------");
		System.out.println("Array:"+ Arrays.toString(array));
		int min, i=0;
		min=array[0];
		for (i=1; i<len;i++)
		{
			if (min>array[i])
			{
				min = array[i];
			}
		}
		System.out.print("Smallest number: "+ min + "\n");
		for (i=1; i<len; i++)
		{
			if(min<array[i])
			{
				min=array[i];
			}
		}
		System.out.println("Greatest number in this array: " + min);
		
		//6.Write a program to find duplicate elements in an array.
		System.out.println("-----------Write a program to find duplicate elements in an array-----------");
		for (i=0; i<len; i++) 
		{
			for (int j=i+1; j<len; j++)
			{
				if (array[i]==array[j])
				{ 
					System.out.println(array[j]);
				}
			}
		}
		//Write a Java program to find the average score of two students in three papers using 2-dimensional array
		System.out.println("---Java program to find the average score of two students in three papers using 2-dimensional array----");
		int s[][] = {{70,80,90},{80,90,95}};
		for ( i=0;i<2;i++)
		{
			for(int j=0;j<3;j++) 
			{
				System.out.print(s[i][j] + " ");
			}
			System.out.println();
			}
		float avg1;
		for (i=0;i<2;i++)
		{
			 sum=0;
			for(int j=0;j<3;j++) 
			{ 
				sum= s[i][j]+sum;
			}
			avg1=sum/3;
			System.out.print(avg1);
			System.out.println();
		}
		// Java program to add two matrices using 2-dimensional array
		System.out.println("----Java program to add two matrices using 2-dimensional array----");
		int a[][]= new int [][]{{2,3},{4,5}};
		int b[][]= {{1,6},{7,8}};
		int c[][]=new int [2][2];
		int j=0;
		System.out.println("length of this 2-d matrix is : " +a.length);
		for (i=0; i<a.length; i++)
		{
			for (j=0;j<a.length; j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+"\t");
			}System.out.println();
		}
		
		//Strings
		//Write a java program to compare two strings, ignoring case differences
		System.out.println("---------Comparing two strings, ignoring case differences--------");
		String s1= ("Welcome");
		String s2 = ("welcome");
		boolean d=s1.equalsIgnoreCase(s2);
		if (d == true)
		{
			System.out.println("Both strings are same.");
		}
		else
			System.out.println("Both strings are not same.");
		
		//Write a java program to concatenate given string to the end of another string
		System.out.println("-------concatenate given string to the end of another string----------");
		String s3= ("Hello");
		String s4= ("Everyone");
		System.out.println(s3.concat(s4));
		
		//Java program to get the length of a given string
		System.out.println("---------Program to get the length of the given string------");
		String s5="Pratheepa";
		int length=s5.length();
		System.out.println("String length is "+length);
		
		//to get a substring of a given string between two specified positions
		System.out.println("-------concatenate given string to the end of another string-----");
		String s6=("Today is Diwali");
		String s7=s6.substring(9);
		System.out.println(s6.substring(0,7));
		System.out.println(s7);
		
		//to convert all the characters in a string to uppercase
		System.out.println("---to convert all the characters in a string to uppercase----");
		String s8=("welCoMe");
		System.out.println(s8.toUpperCase());
		//to convert all the characters in a string to lowercase
		System.out.println("-----to convert all the characters in a string to lowercase");
		System.out.println(s8.toLowerCase());
		
		//Java program to reverse a string
		System.out.println("----------Java program to reverse a string---------");
		String s9 = ("Hello");
		int len1=s9.length();
		//System.out.println(s9.charAt(4));
		for ( i=len1-1; i>=0; i--)
		{
			System.out.println(s9.charAt(i));
		}
		
		
		System.out.println("----------Java program to count number of times a character repeated in a string-------");
		String s10= new String ("Welcome to Canada"); //string array --input
		int len2=s10.length();
		int [] repeat= new int [len2 ];
		char []ca=s10.toCharArray(); //converting input sting into character array or char ca[]=s10.toCharArray();
		int freq=0;
		System.out.println("Input string:"+s10);
		System.out.println("Converted Input string to character array: "+ (Arrays.toString(ca)));// just ca returs hexcode output, so used toString method.
		for (int k=0;k<len2;k++)
		{
			repeat[k]=1;
			{
				for (int m=k+1;m<len2;m++)
				{
					if(ca[k] == ca[m] && ca[k] != ' ' && ca[k] != '0')
					{
						repeat[k]++;
						ca[m] = '0';
					}
					
				}
				System.out.println(ca[k] +" is " +repeat[k] +" times.");
				
			} 
		}
		
		
		//JAva program to count number of words in a sentence
		System.out.println("---Java program to count number of words in a sentence---------");
		String input ="Welcome to United States of America.";
		System.out.println("Input string: " + input);
		int count=0;
		char ch[]= new char[input.length()];  
		//System.out.println("Created character array for the length of input string: "+ (Arrays.toString(ch)));
		for (i=0;i<input.length();i++)
		{
			ch[i]= input.charAt(i);
			if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
			count++;
		}
		System.out.println(count+ " words");
		
		//Write a Java program to convert integer to string
		System.out.println("------Write a Java program to convert integer to string​------");
		int number1=400;
		String h=Integer.toString(number1); //------method 1 using Integer.toString
		System.out.println(h);
		String m= String.valueOf(number1); //----method 2 using String.valueOf
		System.out.println(h + 80000);
		
		
		//Write a program to convert string to integer
		System.out.println("-----Convert string to integer-------");
		String k="200";
		Integer p= Integer.valueOf(k);//-------method 1  Integer.valueOf
		System.out.println(p);
		System.out.println(p + 100);
		Integer f = Integer.parseInt(k); //--------method2 Integer.parseInt
		System.out.println(f );
		System.out.println(f+100);
		
		//Write a program to check whether a string is palindrome or not.(e.g.reverse of "level" is "level"
		System.out.println("---program to check whether a string is palindrome or not---");
		
		 String name, reverse = ""; // Objects of String class  
	      Scanner in = new Scanner(System.in);   
	      System.out.println("Enter a string to check for palindrome: ");  
	      name = in.nextLine();   
	      int len5 = name.length();   
	      for (i = len5 - 1; i >= 0; i-- )  
	         reverse = reverse + name.charAt(i);  
	      if (name.equals(reverse))  
	         System.out.println(name +" string is a palindrome.");  
	      else  
	         System.out.println(name + " string is not a palindrome.");

	}// main
}// class
