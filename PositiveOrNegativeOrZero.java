import java.util.Scanner;
public class PositiveOrNegativeOrZero {
	public static void main(String[] args){
		Scanner n=new Scanner(System.in);
		int num=n.nextInt();
		System.out.println("Enter your input: ");
		if(num<0){
			System.out.println("Your input number is Negative");
		}
		else if(num>0){
			System.out.println("Your input number is Positive");
		}
		else{
			System.out.println("Your input number is Zero");
		}
		n.close();
	}
}
