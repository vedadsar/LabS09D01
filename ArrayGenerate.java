public class ArrayGenerate {

	public static void main(String[] args) {

		int[] ourArray = new int[10];

		for (int i = 0; i < ourArray.length; i++) {
			ourArray[i] = (int) (Math.random() * 100);
			System.out.print(ourArray[i] + " ");
		}
		
		System.out.println();
		System.out.println("Uneste broj koji trazite");
		int ourGuess = TextIO.getInt();
		boolean gotNumber = false;

		for (int i = 0; i < ourArray.length; i++) {

			if (ourGuess == ourArray[i]) {
				System.out.println("Broj koji trazite je na indexu " + i);
				gotNumber = true;
			}
		}

		if (gotNumber == false)
			System.out.println("Broj se ne nalazi u nizu");

	}
	
	
	public static int binarySearch(int[] array, int number){
		
		int startIndex = 0; // Index pocetka niza
		int endIndex = array.length-1;  // Index kraja niza
		
		while(startIndex <= endIndex){
			int m = (endIndex + startIndex) /2;
			
			if(array[m]==number)
				return m;
			
			else if(number < array[m]){
				endIndex = m-1;
			}
			else{
				startIndex = m+1;
			}
			
		}
		
		return -1;
		
	}
}
