import java.util.*;
import java.util.Scanner;

class largest{
	public static void main(String[] args){
		Scanner obj= new Scanner(System.in);
		
		System.out.println("Enter the number1:");
		int num1= obj.nextInt();
		
		System.out.println("Enter the number2:");
		int num2= obj.nextInt();
		
		System.out.println("Enter the number3");
		int num3= obj.nextInt();
		
		if(num1>num2 && num1>num3){
			System.out.println(num1+"is the largest number");
		} else if (num2>num1 && num2>num3){
			System.out.println(num2+"is the largest number");
		}else{
			System.out.println(num3+"is the largest number");			
		}
		
	}

}