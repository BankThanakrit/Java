import java.util.Scanner;

public class Lab1_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("x = ");
		int x = sc.nextInt();
		System.out.print("y = ");
		int y = sc.nextInt();
		String coordinates = null;
		if (x > 0) {
			if (y == 0) {
				coordinates = "x-intercept";
			} else if (y > 0) {
				coordinates = "Q1";
			} else if (y < 0) {
				coordinates = "Q4";
			}
		} else if (x == 0) {
			if (y == 0) {
				coordinates = "origin";
			} else if ((y > 0) && (y < 0)) {
				coordinates = "y-intercept";
			}
		} else if (x < 0) {
			if (y == 0) {
				coordinates = "x-intercept";
			} else if (y > 0) {
				coordinates = "Q2";
			} else if (y < 0) {
				coordinates = "Q3";
			}
		}
		System.out.print("coordinates(" + x + "," + y + ")= " + coordinates);

	}

}
