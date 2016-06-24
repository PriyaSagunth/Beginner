import java.util.Scanner;
public class PositiveOrNegative {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a number");
		int num = s.nextInt();
		
		if(num>0){
			System.out.println("You have typed a positive number");
		} else if(num<0){
			System.out.println("You have typed a negative number");
		}else{
			System.out.println("You have typed zero");
		}
		s.close();
	}

}
