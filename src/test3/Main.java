package test3;
import java.util.*;
public class Main {
    private static Scanner sc;

	public static void main(String[] args){
		System.out.println("test");
		sc = new Scanner(System.in);
		// ®”‚Ì“ü—Í
		int a = sc.nextInt();
		// o—Í
		String s = null;
		int b;
		System.out.println("test");
		b = a / 11;
		while(b > 0) {
			int c = b % 11;
			s = Integer.toString(c) + s;
			b = b/11;
		}
		System.out.println(s);
		System.out.println("test");
		
     }
}
