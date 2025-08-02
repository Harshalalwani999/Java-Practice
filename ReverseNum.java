import java.util.*;
import java.util.Scanner;

class ReverseNum{
	public static void main(String[] args){
		Scanner myobj= new Scanner(System.in);
		
		System.out.print("Enter the number:");
		int number = myobj.nextInt();
		
			if(mystring.length() == 3){
				char first= mystring.charAt(0);
				char second= mystring.charAt(1);
				char third= mystring.charAt(2);
				
				char temp=first;
				first=third;
				third=temp;
				
				System.out.print(mystring);
			}else{
				System.out.println("Enter a 3 digit number:");
				String mystring = myobj.nextLine();
			}
			
		
	}
}