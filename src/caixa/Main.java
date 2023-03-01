package caixa;

public class Main {

	public static void main(String[] args) {
		printTOpOrBottom(4);
		System.out.println("*    *");
		System.out.println("*    *");
		System.out.println("*    *");
		printTOpOrBottom(4);

	}
	public static void printTOpOrBottom(int size) {
		for (int i = 0; i <size ; i++) {
		System.out.println("*");	
		}
		System.out.println();
	}
}
