package skill3;
import java.util.*;
public class electricbill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int units,rate=0;
		units = sc.nextInt();
		if(units <=100)
			rate = units*3;
		else if(units>= 101 && units <= 300)
			rate = (units * 5)+100;
		else if (units >=301 && units <=450)
			rate = (units * 6)+200;
		else if (units >450)
			rate = (units*8)*250;
		System.out.println("Number of units consumed: "+units);
		System.out.println("Amount to be paid: "+rate);
		

	}

}
