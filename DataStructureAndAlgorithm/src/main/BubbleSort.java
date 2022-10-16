package main;

public class BubbleSort {
	public void Sort(int array[]) {
		//Clear Screen Code HERE in this line
		int arrayData[] = array.clone();
		
	    int size = array.length;
	    
		System.out.println("\t\t----------------------------------");
		System.out.println("\t\t\t BUBBLE SORT");
		System.out.println("\t\t----------------------------------");
	    System.out.print("\t\tUNSORTED ");
	    displayArray(array);
	    System.out.println("\n\t\t----------------------------------");
	    
	    int counter = 0;
	    for (int i = 0; i < size - 1; i++){
	    	 for (int j = 0; j < size - i - 1; j++){
	    		 if (array[j] > array[j + 1]) {
		 	          int temp = array[j];
		 	          array[j] = array[j + 1];
		 	          array[j + 1] = temp;
		 	          counter++;
//		 	          System.out.println(Arrays.toString(array)); for debugging
		 	          	System.out.print("\t\t"+counter+". ");
			 	        for(int k= 0; k< array.length; k++){
			 				System.out.print(array[k]+" ");
			 			}
			 	        System.out.println();
		 	        }
	    	 }
	    }
	    System.out.println("\t\t----------------------------------");
	    System.out.print("\t\tSORTED ");
	    displayArray(array);
	    System.out.println("\n\t\t----------------------------------");
	    System.out.println("\n\t\tPress Enter key to continue...");
	    try{
	    	System.in.read();
	    }catch(Exception e){}  
	    Options options = new Options();
	    options.Menu(arrayData);
	  }
	void displayArray(int arr[]) {
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
