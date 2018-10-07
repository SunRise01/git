package lab01;

import java.util.Scanner;
import java.lang.Math;

public class main {

	public static void main(String[] args) {
		System.out.println("Введіть назву операції:");
		
		Scanner in = new Scanner(System.in);
		String operation=in.nextLine();
		
		System.out.println("Введіть числа:");
		double x=in.nextInt();
		double y=in.nextInt();
		
//		System.out.println(operation+" "+x+" "+y);
		double result=0;
		switch (operation) {
		case "додавання":
			System.out.println("x+y="+(x+y));
			break;
		case "віднімання":
			System.out.println("x-y="+(x-y));
			break;
		case "множення":
			System.out.println("x*y="+(x*y));
			break;
		case "ділення":
			System.out.println("x/y="+(x/y));
			break;
		case "корінь":
			System.out.println("sqrt(x)="+(Math.sqrt(x)));
			System.out.println("sqrt(y)="+(Math.sqrt(y)));
			break;
		case "модуль":
			System.out.println("|x|="+(Math.abs(x)));
			System.out.println("|y|="+(Math.abs(y)));
			break;
		default:
			System.out.println("назва функції неправильна. Доступні функції: додавання, віднімання, множення, ділення, корінь, модуль");
			break;
		}
	}
}
