import java.util.*;
import java.util.Scanner;

class ReverseArray{
	public static void main(String[] args){
		Scanner myobj= new Scanner(System.in);
		
		System.out.println("What should be the length of the array?");
		int n=myobj.nextInt();
		
		int[] number= new int[n];
		for(int i=0; i<n;i++){
			System.out.print("Enter the number:");
			number[i]= myobj.nextInt();
		}
		
		for(int i=n-1; i>=0;--i){
			System.out.println("At index"+i+"="+number[i]);
		}
		
	}
}