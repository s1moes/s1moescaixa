package caixa;

public class Caixa {

	private int width;
	private int height;
	
	public Caixa(int widthParam, int heightParam) {
		width = widthParam;
		height = heightParam;
	}

	public void print() {
		if (width < 4) {
			width = 4;
		}
		if (height < 4) {
			height = 4;
		}
		printTOpOrBottom();
		printLeftandRight();
		printTOpOrBottom();
	}
	public void printTOpOrBottom() {
		for (int i = 0; i < width ; i++) {
		System.out.print("*");	
		}
		System.out.println();
	}
	public void printLeftandRight() {
		for (int i = 0; i < height - 2; i++) {
			System.out.print("*");
			for (int j = 0; j < width - 2; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
	}
}
