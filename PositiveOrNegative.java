import java.util.Scanner;
2	public class PositiveOrNegative {
3		public static void main(String[] args) {
4			Scanner s =new Scanner(System.in);
5			System.out.println("Enter a number");
6			int num = s.nextInt();
7			
8			if(num>0){
9				System.out.println("You have typed a positive number");
10			} else if(num<0){
11				System.out.println("You have typed a negative number");
12			}else{
13				System.out.println("You have typed zero");
14			}
15			s.close();
16		}
17	
18	}
