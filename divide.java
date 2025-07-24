import java.util.*;
import java.util.Scanner;

class divide{
	public static void main(String[] args){
		Scanner obj= new Scanner(System.in);
		
		int num= 0;
		System.out.println("Enter the number:");
		num= obj.nextInt();
		
		if(num%3==0){
			System.out.println("divisible by 3");
		} else if (num%5==0){
			System.out.println("divisible by 5");
		}else{
			System.out.println("not divisible by 3 & 5");			
		}
		
	}

}