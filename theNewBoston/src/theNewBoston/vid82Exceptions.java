package theNewBoston;
import java.util.*;

public class vid82Exceptions {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		int x=1;
		do {
			try {
			System.out.println("Enter first number: ");
			int n1= input.nextInt();
			System.out.println("Enter second number: ");
			int n2= input.nextInt();
			int div=n1/n2;
			System.out.println(div);
			x=2;
			}
			catch(Exception e) {
				System.out.println("You can't do that");
			}
		}while (x==1);
	
	
	}
}
