import java.util.*;
import java.util.Scanner;

class vowels{
	public static void main(String[] args){
		Scanner obj= new Scanner(System.in);
		
		char alpha= obj.next().charAt(0);
		System.out.println("Enter ther character:"+alpha);
		
		switch(alpha){
			case 'a':
				System.out.println("It is a vowel");
				break;
			case 'e':
				System.out.println("It is a vowel");
				break;
			case 'i':
				System.out.println("It is a vowel");
				break;
			case 'o':
				System.out.println("It is a vowel");
				break;
			case 'u':
				System.out.println("It is a vowel");
				break;
			default:
				System.out.println("It is a consonant");
				break;
		}
		
		if(alpha=='a' || alpha=='A'|| alpha=='e' || alpha=='E' || alpha=='i' || alpha=='I' || alpha=='o' || alpha=='O'|| alpha=='u' || alpha=='U'){
			System.out.println("It is a vowel");
		}
		else{
			System.out.println("It is a consonant");
		}
	}

}