import java.util.*;
import java.util.Scanner;

class TableWhile{
	public static void main(String[] args){
		Scanner myobj= new Scanner(System.in);
		
		System.out.print("Enter the number:");
		int num= myobj.nextInt();
		
		int i=1;
		while(i<=10){
			System.out.println(num+"x"+i+"="+num*i);
			i++;
		}
	}
}