import java.util.*;
import java.util.Scanner;

class ArrayOpt{
	public static void main(String[] args){
		Scanner myobj= new Scanner(System.in);
		
		System.out.println("What should be the length of the array?");
		int n=myobj.nextInt();
		
		int[] numbers= new int[n];
		for(int i=0; i<n;i++){
			System.out.print("Enter the number:");
			numbers[i]= myobj.nextInt();
		}
		
		int sum=0;
		for(int i=0; i<n;i++){
			sum=sum+numbers[i];
		}
		
		float average= sum/n;
		
		System.out.println("The sum is:"+sum);
		System.out.println("The average is:"+average);
	}
}