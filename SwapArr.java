import java.util.*;
import java.util.Scanner;

class SwapArr{
	public static void main(String[] args){
		Scanner myobj= new Scanner(System.in);
		
		System.out.println("What should be the length of the array?");
		int n=myobj.nextInt();
		
		int[] num= new int[n];
		for(int i=0; i<n;i++){
			System.out.print("Enter the number:");
			num[i]= myobj.nextInt();
		}
		
		int temp= num[0];
		num[0]= num[n-1];
		num[n-1]=temp;
		
		for(int i=0; i<n;i++){
			System.out.println("at index"+i+"="+num[i]);
		}
		
	}
}