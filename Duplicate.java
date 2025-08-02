import java.util.*;
import java.util.Scanner;

class Duplicate{
	public static void main(String[] args){
		Scanner myobj= new Scanner(System.in);
		
		System.out.println("What should be the length of the array?");
		int n=myobj.nextInt();
		
		int[] num= new int[n];
		for(int i=0; i<n;i++){
			System.out.print("Enter the number:");
			num[i]= myobj.nextInt();
		}
		
		int count=0;
		for(int i=0; i<n;i++){
			for(int j=0; j<n;j++){
				if(i==j){
					continue;
				}else if (num[i]==num[j]){
					count++;
				}
			}
			
		}
		System.out.println(count+" appear more than once");
		
	}
}