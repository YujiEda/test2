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
		// �����̓���
		int a = sc.nextInt();
		// �X�y�[�X��؂�̐����̓���
		int b = sc.nextInt();
		int c = sc.nextInt();
		// ������̓���
		String s = sc.next();
		// �o��
		System.out.println((a+b+c) + " " + s);
     }
}
