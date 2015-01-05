public class GuessRandomNumber {

	public static void main(String[] args) {

		int randomNumber = (int) (Math.random() * 101);
		int ourGuess = 0;
		boolean isCorrect = false;

		while (isCorrect == false) {

			System.out.println("Unesite broj");
			ourGuess = TextIO.getInt();

			if (ourGuess == randomNumber) {
				System.out.println("Pogodili ste broj");
				isCorrect = true;
			}

			else {
				if (ourGuess > randomNumber)
					System.out
							.println("Zamisljeni broj je manji od vaseg pokusaja");
				if (ourGuess < randomNumber)
					System.out
							.println("Zamisljeni broj je veci od vaseg pokusaja");

			}
		}

	}
}
