import java.util.Scanner;

public class Find15Multiple{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = input.nextInt();
		
		int i = 1;
		while(i <= 15){
		    System.out.println(num * i);
			i++;
		}
	}
}