package trabajos_programacion_def;

import java.util.Scanner;

public class Cambio_divisas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("*CONVERSOR DE MONEDAS*" + "\n----------------------");

		System.out.println("1. Dolar\n2. Euro\n3. Libra\n4. Rupia\n5. Yen\n6. Franco suizo");

		conversor(teclado);
	}

	public static void conversor(Scanner teclado) {
		System.out.print("\nIntroduce la Moneda de Origen:(número)"); //COIN
		int coin = teclado.nextInt();
		double euro = 0;
		System.out.print("Introduce la cantidad de dinero a convertir:");//MONEY
		double money = teclado.nextDouble();

		switch (coin) { //switch para si pulsa 1 --> euros = la cantidad de dinero dividida entre money(divisas en euro) 
		case 1://coin 1
			euro = (money / 1.17);
			break;
		case 2://coin 2
			euro = (money * 1);
			break;
		case 3://coin 3...
			euro = (money / 0.88);
			break;
		case 4:
			euro = (money / 76.32);
			break;
		case 5:
			euro = (money / 131.69);
			break;
		case 6:
			euro = (money / 1.16);
			break;
		}

		System.out.print("Introduce la Moneda de destino:");
		int coinToConvert = teclado.nextInt();
		double finalMoney = 0;

		switch (coinToConvert) { //switch para MONEDA DESTINO
		case 1://
			finalMoney = (euro * 1.17); // multiplica los euros por la moneda
			break;
		case 2:
			finalMoney = (euro * 1);
			break;
		case 3:
			finalMoney = (euro * 0.88);
			break;
		case 4:
			finalMoney = (euro * 76.32);
			break;
		case 5:
			finalMoney = (euro * 131.69);
			break;
		case 6:
			finalMoney = (euro * 1.16);
			break;
		}
		finalMoney = Math.round((finalMoney) * 100.00) / 100.00;

		System.out.print("\n");

		if (coinToConvert == 1)
			System.out.println(finalMoney + " Dolares");
		else if (coinToConvert == 2)
			System.out.println(finalMoney + " Euros");
		else if (coinToConvert == 3)
			System.out.println(finalMoney + " Libras");
		else if (coinToConvert == 4)
			System.out.println(finalMoney + " Rupias");
		else if (coinToConvert == 5)
			System.out.println(finalMoney + " Yenes");
		else if (coinToConvert == 6)
			System.out.println(finalMoney + " Francos Suizos");

	}
}