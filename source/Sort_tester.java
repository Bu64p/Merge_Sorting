import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import sorting.Merge_sorting;

public class Sort_tester {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size of array:");
		int size = Integer.valueOf((String) br.readLine());
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.print((i + 1) + ". ");
			array[i] = Integer.valueOf((String) br.readLine());
		}
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.print("\n");
		for (int i : new Merge_sorting(array).get()) {
			System.out.print(i + " ");
		}
	}
}
