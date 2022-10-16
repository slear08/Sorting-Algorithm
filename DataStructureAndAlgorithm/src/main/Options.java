package main;

import java.util.Scanner;


public class Options {
	@SuppressWarnings("resource")
	public void Menu(int intArray[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\t\t----------------------------------");
		System.out.println("\t\t\tSorting Algorithm\n\t\t\tMenu");
		System.out.println("\t\t----------------------------------");
		System.out.println("\t\t\t [1] Bubble Sort");
		System.out.println("\t\t\t [2] Selection Sort");
		System.out.println("\t\t\t [3] Insertion Sort");
		System.out.println("\t\t\t [4] Exit");
		System.out.print("\n\n\t\tEnter your option: ");
		int optionInput = input.nextInt();
		
		BubbleSort bubbleSort = new BubbleSort();
		SelectionSort selectionSort = new SelectionSort();
		InsertionSort insertionSort = new InsertionSort();
		
		switch (optionInput) {
			case 1: {
				bubbleSort.Sort(intArray);
				break;
			}
			case 2: {
				selectionSort.Sort(intArray);
				break;
			}
			case 3: {
				insertionSort.Sort(intArray);
				break;
			}
			case 4: {
				System.out.print("Do you want to try again?(Y/N): ");
				char exit = input.next().charAt(0);
				
				if(exit=='y'||exit=='Y'){
					//Clear Screen Code HERE in this line
					Menu(intArray);
				
				}
				else {
					//Clear Screen Code HERE in this line
					System.out.println("\t\t----------------------------------");
					System.out.println("\t\t\tPROGRAM TERMINATED");
					System.out.println("\t\t----------------------------------");
					System.exit(1);
				
				}
					
				break;
			}
			default:
			
		}
	
		input.close();
	}
	
	
}
