import java.util.*;
import java.util.Scanner;

class MaxMin{
	public static void main(String[] args){
		Scanner myobj= new Scanner(System.in);
		
		System.out.println("What should be the length of the array?");
		int n=myobj.nextInt();
		
		int[] number= new int[n];
		for(int i=0; i<n;i++){
			System.out.print("Enter the number:");
			number[i]= myobj.nextInt();
		}
		int maxcount=0;
		for(int i=0; i<n;i++){
			for(int j=0; j<n;j++){
				if(i==j){
					continue;
				}else if(number[i]>number[j]){
					maxcount++;
				}
			}
			if(maxcount==n-1){
				System.out.println(number[i]+" is the maximum number");
				break;
			}
		}
		
		
	}
}