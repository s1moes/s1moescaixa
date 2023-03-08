package caixa;

import java.util.Scanner;
import caixa.errors.NotEnoughtHeightException;
import caixa.errors.NotEnoughtWidthException;

public class Main {

	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Width: ");
		int width = in.nextInt();
		
		System.out.print("Height: ");
		int height = in.nextInt();
		
		Caixa caixa = new Caixa(width, height, '+');
		try {
		caixa.print();
		}catch (NotEnoughtWidthException e) {
			System.out.println("Ocorreu um erro ao desenhar a caixa! Largura tem que ser maior que 3");
		}catch (NotEnoughtHeightException e) {
			System.out.println("Ocorreu um erro ao desenhar a  caixa! Altura tem que ser maior que 3");
		}
	}
	
}