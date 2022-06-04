package br.com.glandata;

public class SwitchCase {

	public static void main(String[] args) {
		int diasemana = 7;
		
		switch (diasemana) {
		case 2:
			System.out.println("Segunda-Feira");
			break;
		case 3:
			System.out.println("Terça-Feira");
			break; 
		case 4:
			System.out.println("Quarta-Feira");
			break;
		case 5:
			System.out.println("Quinta-Feira");
			break;
		case 6:
			System.out.println("Sexta-Feira");
			break;

		default:
			System.out.println("Final de semana");
			break;
		}

	}

}
