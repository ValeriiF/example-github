package edu.ndu.fetisov;
import java.util.Scanner;
import java.util.ArrayList;

/**
 	Клас для завантаження калькулятора. Підтримує користувацьке введення даних
*/

public class InteractRunner{

	public static void main(String[] arg) {
		Scanner reader = new Scanner (System.in);
		try {
			Calculator calc = new Calculator();
			ArrayList<Integer> list = new ArrayList<Integer>();
			String exit = "no", cikl = "yes", answer ="yes", first = "", second = "", user_choice = " ";
			while(!exit.equals("yes"))
				{
					while(cikl.equals("yes")) {
						System.out.println("Введіть елемент масиву:");
						answer = reader.nextLine();
						list.add(Integer.valueOf(answer));
						System.out.println("Продовжити введення: (yes - так, Інше введення - ні)");
						cikl = reader.nextLine();
					}
				System.out.println("Enter choice (1 - '+', 2 - '-', 3 - '*', 4 - ':'):");
				user_choice = reader.next();
				switch(Integer.valueOf(user_choice))
				{
					case 1:
						calc.add(list);
						System.out.println("Result " + calc.getResult());
						break;
					case 2:
						calc.minus(list);
						System.out.println("ResultMinus " +calc.getResult());
						break;
					case 3:
						calc.dobutok(list);
						System.out.println("ResultDob " +calc.getResult());
						break;
					case 4:
						try {		// Оп-ції у цьому блоці можуть бути помилковими і їх потрібно обробити
							calc.div(list);
						} catch (UserException e){		// Обробка помилки
							System.out.println(e.getMessage());
							System.out.println("Please Enter 2 arguments");
						}
						System.out.println("ResultDiv:"+calc.getResultDiv());
						break;
					default: System.out.println("Not correct input!");
				}
				calc.cleanResult();
				System.out.println("Exit? (yes / no)");
				exit = reader.next();
				}
			}
		finally {
			reader.close();
		}
	}
}