package skill6;
import java.util.*;

class Isprime {
		public boolean checkPrime (int n) {
			int ct=0;
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					ct++;
				}
			}
			if(ct>2)
				return false;
			else
				return true;
		}
	
}

public class ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Isprime p = new Isprime();
		Scanner s = new Scanner(System.in);
		int n;
		n = s.nextInt();
		System.out.println(p.checkPrime(n));
		
		

	}

}
