package test2;
import java.util.*;
public class Main {
    private static Scanner sc;

	public static void main(String[] args){
        String msgValue01 = "aa";
        String msgValue02 = "bb";
        Date d = new Date();
        System.out.println(msgValue01  + msgValue02+d);
		sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
		int c = sc.nextInt();
		// 文字列の入力
		String s = sc.next();
		// 出力
		System.out.println((a+b+c) + " " + s);
     }
}
