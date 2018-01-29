package test4;

import java.util.*;
public class Main {
    private static Scanner sc;

	public static void main(String[] args){
		sc = new Scanner(System.in);
		// ®”‚Ì“ü—Í
		int a = sc.nextInt();
		// o—Í
		String s = "";
		int b;
		b = a / 11;
		int e = a % 11;
		if(e == 10) {
			s = "a" + s;
		}else {
			s = Integer.toString(e) + s;
		}
		while(b > 0) {
			int c = b % 11;
			if(c == 10) {
				s = "a" + s;				
			}else {
				s = Integer.toString(c) + s;
			}
			b = b/11;
		}
		System.out.println(s);
     }
}
