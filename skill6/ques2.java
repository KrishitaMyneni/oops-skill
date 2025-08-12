package skill6;
import java.util.*;

class Shape{
	void findArea(int n){
		int area = n*n;
		System.out.println("Area of square: "+area);
	}
	
	void findArea(double n) {
		double area = 3.14*n*n;
		System.out.println("Area of circle: "+area);
		
	}
}

public class ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Shape s = new Shape();
		s.findArea(4);;
		s.findArea(2.5);
			

	}

}
