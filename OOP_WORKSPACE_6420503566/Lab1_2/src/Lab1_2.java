import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab1_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter triangle side:");
		double side = sc.nextDouble();
		System.out.print("Enter prism length:");
		double length = sc.nextDouble();
		double area = (((Math.sqrt(3))/4)*(side*side)*2)+(side*length*3);
		DecimalFormat dc = new DecimalFormat("##.##");
		System.out.println("Surface area of prism is " + dc.format(area));
	}
}
