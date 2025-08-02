import java.util.*;
import java.util.Scanner;

class EvenOddArr{
	public static void main(String[] args){
		Scanner myobj= new Scanner(System.in);
		
		System.out.println("What should be the length of the array?");
		int n=myobj.nextInt();
		
		int[] number= new int[n];
		for(int i=0; i<n;i++){
			System.out.print("Enter the number:");
			number[i]= myobj.nextInt();
		}
		int evencount=0;
		int oddcount=0;
		for(int i=0; i<n;i++){
			if(number[i]%2==0){
				evencount++;
			}
			else{
				oddcount++;
			}
		}
		System.out.println("Even Number Count:"+ evencount);
		System.out.println("Odd Number Count:"+ oddcount);
	}
}