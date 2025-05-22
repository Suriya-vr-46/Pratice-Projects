package Time;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = 0;
		while(true) {
			int h,m;
			System.out.println("Time Convertion!");
			System.out.print("Enter Hours : ");
			h = sc.nextInt();
			System.out.print("Enter Minutes : ");
			m = sc.nextInt();

			new Time(h,m);
			
			System.out.println("Enter Another Time (1/2) : ");
			c = sc.nextInt();
			if(c==2) {
				System.out.println("Thak you!");
				break;
			}
		}
		sc.close();
	}
}
