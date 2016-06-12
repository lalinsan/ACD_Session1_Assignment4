/*
 * Student: Eduardo Aguirre
 * Session 1
 * Assignment 4
 * Assume that the integer variable x is 5 and the integer variable y is 10. Give the values of the following
expressions:
 * a. x + y * 2
 * b. x - y + 2
 * c. (x+y) * 2
 * d. y % x
 */


public class CalculateValues {

	public static void main(String[] args) {
		int x =5;
		int y =10;
		
		int a = x+y*2;
		int b = x-y+2;
		int c = (x+y)*2;
		int d = y%x;
		
		System.out.println("======================");
		System.out.println("X=" +x);
		System.out.println("Y=" +y);
		System.out.println("======================");
		System.out.println("Calculate a (x+y*2) :" +a);
		System.out.println("Calculate b (x-y+2) :" +b);
		System.out.println("Calculate c ((x+y)*2) :" +c);
		System.out.println("Calculate d (y%x) :" +d);
		System.out.println("======================");
	}

}
