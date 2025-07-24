import java.util.*;
import java.util.Scanner;

class table{
	public static void main(String[] args){
		Scanner obj= new Scanner(System.in);
		
		int num= obj.nextInt();
		System.out.println("Enter the number:"+num);
		
		for(int i=1; i<=10; i++){
			System.out.println(num+"*"+i+"="+ num*i);
		}
		
	}

}