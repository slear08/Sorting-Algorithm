package main;

public class InsertionSort {
	public void Sort(int array[]) {
		//Clear Screen Code HERE in this line
		int arrayData[] = array.clone();
		
		int size = array.length;
	    
		System.out.println("\t\t----------------------------------");
		System.out.println("\t\t\t INSERTION SORT");
		System.out.println("\t\t----------------------------------");
	    System.out.print("\t\tUNSORTED ");
	    displayArray(array);
	    System.out.println("\n\t\t----------------------------------");
	    for (int i = 1; i < size; ++i){
            int key = array[i];
            int j = i - 1;
  
            int counter = 0;
            while(j >= 0 && array[j] > key){
                array[j + 1] = array[j];
                j = j - 1;
                counter++;
            }
            array[j + 1] = key;
            System.out.print("\t\t"+counter+". ");
 	        for(int k= 0; k< array.length; k++){
 				System.out.print(array[k]+" ");
 			}
 	        System.out.println();
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
