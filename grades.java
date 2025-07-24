import java.util.*;
import java.util.Scanner;

class table{
	public static void main(String[] args){
		Scanner obj= new Scanner(System.in);
		
		int num= obj.nextInt();
		System.out.println("Enter the marks:"+num);
		
		if(num>=30){
			System.out.println("Pass");
			if(num>=30 && num<=40){
				System.out.println("Grade C-");
			} else if(num>=41 && num<=50){
				System.out.println("Grade C");
			} else if(num>=51 && num<=60){
				System.out.println("Grade B-");
			} else if(num>=61 && num<=70){
				System.out.println("Grade B");
			} else if(num>=71 && num<=80){
				System.out.println("Grade B+");
			} else if(num>=81 && num<=90){
				System.out.println("Grade A");
			}else{
				System.out.println("Grade A+");
			}
		}
		else{
			System.out.println("Fail");
		}
	}

}