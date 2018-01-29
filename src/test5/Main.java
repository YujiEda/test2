package test5;

import java.util.*;
public class Main {
    private static Scanner sc;

	public static void main(String[] args){
		sc = new Scanner(System.in);
		// •¶Žš—ñ‚Ì“ü—Í
		String s = sc.nextLine();
		s = s.substring(0, s.length()-1);
		String[] a = s.split(" ");
		double j = 0;
		double k;
		for(String b: a) {
			int i =0;
			if(b.substring(0, 1).equals("{") && b.substring(b.length()-1,b.length()).equals("}")) {
				String[] c = b.substring(1,b.length()-1).split(",");
				for(String d:c) {
					if(i < d.length()) {
						i=d.length();
					}
				}
			}else {
				i=b.length();
			}
			j += i;
		}
		k = (double)j / (double)a.length;
		// o—Í
		System.out.println(k);
     }
}
