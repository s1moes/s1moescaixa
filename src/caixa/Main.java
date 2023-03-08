package caixa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) { //throws Exception{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Width: ");
		int width = in.nextInt();
		
		System.out.print("Height: ");
		int height = in.nextInt();
		
		
		
		Caixa caixa = new Caixa(3, 3, '+');
		
		try {
		caixa.print();
		}catch (Exception e) {
			System.out.println("Ocorreu um erro ao desenho da caixa!");
		}
	}
	
}