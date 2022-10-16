package main;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int arraySize = 0;
		
		while (true){
			System.out.print("Enter the size of the array (5-15): ");
			arraySize = input.nextInt();
			
			if(arraySize>=5 && arraySize<=15){
				break;
			}else {
				System.out.println("Invalid size! Only sizes 5 to 15 are accepted");
			}
			
		}

		int counter;
		int intArray[]  = new int[arraySize];

		System.out.println("Enter "+arraySize+" array elements");
		System.out.print("-> ");
		for(counter = 0; counter<arraySize; counter++) {
			
			int pushToArray = input.nextInt();
			intArray[counter] = pushToArray;
		}
		Options option = new Options();
		option.Menu(intArray);
		input.close();
	}

}
