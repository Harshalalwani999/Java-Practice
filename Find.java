import java.util.*;
import java.util.Scanner;

class Find{
	public static void main(String[] args){
		Scanner myobj= new Scanner(System.in);
		
		System.out.println("What should be the length of the array?");
		int n=myobj.nextInt();
		
		int[] numbers= new int[n];
		for(int i=0; i<n;i++){
			System.out.print("Enter the number:");
			numbers[i]= myobj.nextInt();
		}
		
		System.out.println("What number do you need to find?");
		int num= myobj.nextInt();
		for(int i=0; i<n;i++){
			if(numbers[i]==num){
				System.out.println(num+" is at index "+i);
				break;
			}else{
				System.out.println("Not found");
			}
		}
	}
}