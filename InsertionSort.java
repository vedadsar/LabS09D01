
public class InsertionSort {
	
	public static void main(String[] args) {
	
		int [] numbers = new int [] {871, 12, 8 ,98, 12, 19, 18, 77, 82,65, 26, 33, 45, 632, 62, 664};
		bubbleSort(numbers);
		
		
		
		for(int n: numbers){
			System.out.print(n +" ");
		}
	
	}


	public static void insertionSort(int [] array){
			
		for(int i=0; i<array.length;i++){
			int newPos = i;
	
			while(newPos > 0 && array[newPos-1] > array[newPos]  ){
				int temp = array[newPos];
				array[newPos] = array[newPos-1];
				array[newPos-1]=temp;				
				newPos--;
				
			}
		}
		
	}
	
	public static void bubbleSort(int [] array){
		
		int arrayEnd = array.length-1;
		
		for(int i=arrayEnd; i>=0; i--){
			int maxIndex =0;
			
			for(int j=1; j<=i;j++){
				
				if(array[j]>array[maxIndex])
					maxIndex = j;
			
			}
			int temp = array[i];
			array[i] = array[maxIndex];
			array[maxIndex] = temp;
			
		}
		
	}
	
	
	
}
