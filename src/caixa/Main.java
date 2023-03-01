package caixa;

public class Main {

	public static void main(String[] args) {
		printTOpOrBottom(6);
		printLeftandRight(6, 2);
		printTOpOrBottom(6);

	}
	public static void printTOpOrBottom(int size) {
		for (int i = 0; i <size ; i++) {
		System.out.print("*");	
		}
		System.out.println();
	}
	public static void printLeftandRight(int width, int height) {
		for (int i = 0; i < height; i++) {
			System.out.print("*");
			for (int j = 0; j < width - 2; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
	}
}
