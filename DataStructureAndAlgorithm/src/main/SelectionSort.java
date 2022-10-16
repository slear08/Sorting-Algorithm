package main;

public class SelectionSort {
	public void Sort(int array[]) {
		//Clear Screen Code HERE in this line
		int arrayData[] = array.clone();
		
		int size = array.length;
	    
		System.out.println("\t\t----------------------------------");
		System.out.println("\t\t\t SELECTION SORT");
		System.out.println("\t\t----------------------------------");
	    System.out.print("\t\tUNSORTED ");
	    displayArray(array);
	    System.out.println("\n\t\t----------------------------------");
	   
	    int counter = 0;
        
        for (int i = 0; i < size-1; i++){
            int min= i;
            for (int j = i+1; j < size; j++){
            	if (array[j] < array[min])
                min = j;
            	
            }
            counter++;
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
            
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
