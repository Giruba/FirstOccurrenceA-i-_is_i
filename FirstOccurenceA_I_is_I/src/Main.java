import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("First occurrence of condition A[i] = i");
		System.out.println("--------------------------------------");
		
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the number of elements in the array");
			int arrayLength = scanner.nextInt();
			int[] array = new int[arrayLength];
			for(int index = 0; index < arrayLength; index++) {
				System.out.println("Enter the element");
				array[index] = scanner.nextInt();
			}
			PrintFirstOccurrenceA_I_is_i(array);
		}catch(Exception exception) {
			System.out.println("Thrown exception is "+exception.getMessage());
		}		
	}
	
	public static void PrintFirstOccurrenceA_I_is_i(int[] array) {
		boolean flag = false;
		for(int index = 0; index < array.length; index++) {
			if(array[index] == index) {
				System.out.println("The index at which this condition is met is "+
			index);
				flag = true;
				PrintArray(array);
				break;
			}
		}
		if(!flag) {
			System.out.println("The condition was never met");
		}
	}
	
	public static void PrintArray(int[] array) {
		System.out.println();
		System.out.println("----- Printing the array --------");
		for(int index = 0; index < array.length; index++) {
			System.out.print(array[index]+ " ");
		}
		System.out.println();
	}
}
