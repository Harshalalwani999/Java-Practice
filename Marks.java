import java.util.*;
import java.util.Scanner;

class Marks{
	public static void main(String[] args){
		Scanner myobj= new Scanner(System.in);
			
		int total=0;
		int i=1;
		while(i<=100){
			System.out.print("Enter the marks:");
			int num= myobj.nextInt();
			total= total+num;
			
			if(total>500){
				System.out.print("Total ("+total+")  exceeds 500");
				break;
			}
			
			i++;
		}
	}
}