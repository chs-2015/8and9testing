/**
 * Author: Brandon B.
 * Date: 9-11-15
 * Description: Testing things for lesson 8 and 9.
 */

import java.util.Scanner;
public class lesson8and9testing {
    public static void main(String[] args) {
    	System.out.println("--- LESSON 8 ---");
    	lesson8();
    	System.out.println("\n--- LESSON 9 ---");
    	lesson9();
    }
    static void lesson8() {
    	int z = 23, x = -109;
		double c = 2345.19, v = 157.03;
		boolean a = false, s = true;

		boolean gus = (x > 0) && (c == v);
		System.out.println(!gus);
		
		System.out.println(a || s);

		System.out.println( ( (-1 * x) > 0) && !a );
		
		boolean r = z == x;
		System.out.println( r || false );
		
		System.out.println(z != x);

		boolean p = true, q = true;
		boolean b = p && q;
		System.out.println(b);
		
		int int1 = 5, int2 = 6;
		boolean g = true;
		boolean lean = g || int1 == int2;
		System.out.println(lean);
		
		boolean kDog = int1 != int2;
		boolean zDog = !(int1 == int2);
		System.out.println(kDog);
		System.out.println(zDog);
		
		System.out.println("=====");
		System.out.println((true && false) || ((true && true) || false));
		System.out.println(true && true || false);
		System.out.println(true || true && false);
		System.out.println(false || true && false);
		System.out.println(false && true || false);
    }
    static void lesson9() {
    	int i = 10, j = 3;
    	boolean true_false;

		true_false = (j > i);
		System.out.println(true_false);

		true_false = (i > j);
		System.out.println(true_false);
		
		true_false = (i == j);
		System.out.println(true_false);

		true_false = ((j <= i) || (j >= i));
		System.out.println(true_false);
		
		true_false = ((i > j) && (j == 0));
		System.out.println(true_false);

		true_false = ((j < 50) || (j != 33));
		System.out.println(true_false);
		
		true_false = (!(j >= 0) || (i <= 50));
		System.out.println(true_false);

		true_false = (!(!(!true)));
		System.out.println(true_false);
		
		true_false = (5 <= 5);
		System.out.println(true_false);

		true_false = (j != i);
		System.out.println(true_false);
		
		System.out.println(!((2 > 3) || (5 == 5) && (7 > 1) && (4 < 15) || (35 <= 36) && (89 != 34)));

		System.out.println("=====");
		String s1 = "school BUS";
		if (s1.equals("school bus"))
		System.out.println("Equal");
		else
		System.out.println("Not equal");
		
		String s2 = "school BUS";
		if (s2.equalsIgnoreCase("school bus"))
		System.out.println("Equal");
		else
		System.out.println("Not equal");

		int jermone = 19, m = 200;
		if (jermone == 18)
		m++;
		jermone++;
		System.out.println(m);
		System.out.println(jermone);
		
		int gg = 64;
		boolean z = gg == 34;
		System.out.println(z);
		
		if (gg % 2 == 0)
			System.out.println("Even :-)");
		else
			System.out.println("Odd :-(");

		Scanner kbReader = new Scanner(System.in);
		System.out.print("Enter your password: ");
		String password = kbReader.nextLine();
		if (password.equals("XRay")) // That's a pretty insecure password!!
			System.out.println("Password entered successfully.");
		else
			System.out.println("Incorrect password.");
    }
}
