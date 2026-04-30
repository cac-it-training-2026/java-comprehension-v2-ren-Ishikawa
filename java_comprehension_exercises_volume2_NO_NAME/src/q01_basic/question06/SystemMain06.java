package q01_basic.question06;

import java.io.IOException;

public class SystemMain06 {

	public static void main(String[] args) throws IOException, NumberFormatException {

		ConsoleReader cr = new ConsoleReader();
		int inputId = 0;
		String inputPassword = null;
		String name = "Miura Manabu";
		int age = 28;
		int rank = 2;

		System.out.println("---CREATE MEMBER DATA---");
		ConsoleReader consoleReader = new ConsoleReader();

		try {
			System.out.println("input id>>>");
			inputId = consoleReader.inputNumber();
			System.out.println("input password>>");
			consoleReader.inputString();

		} catch (IOException e) {
			System.out.println("error");
			// TODO: handle exception
		} catch (NumberFormatException e) {
			System.out.println("error");
			e.printStackTrace();
			// TODO: handle exception
			return;
		}
		Member member = new Member(inputId, inputPassword, name, age, rank);
		member.showMember();
	}

}
