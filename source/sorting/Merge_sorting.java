package sorting;

public class Merge_sorting {
	int[] input_array;

	public Merge_sorting(int[] input_array) {
		this.input_array = input_array;
		merge_sort(0, input_array.length - 1);
	}
	// a simple return method
	public int[] get() {
		return input_array;
	}
	// divide arrays by recursive method
	private void merge_sort(int p, int r) {
		int q = (int) Math.floor((p + r) / 2);
		if (p < r) {
			merge_sort(p, q);
			merge_sort(q + 1, r);
			merge(p, q, r);
		}
	}
	// main core of sorting:
	private void merge(int p, int q, int r) {
		int n1 = q - p + 1;
		int n2 = r - q;
		// make left and tight array of divided index:
		int[] array1 = new int[n1];
		int[] array2 = new int[n2];
		// put unordered elements in right and left arrays:
		array1 = insert(n1, p);
		array2 = insert(n2, q + 1);
		int i = 0, j = 0;
		int k = p;
		// check left and right to understand which one is bigger:
		while (i < n1 && j < n2) {
			if (array1[i] <= array2[j]) {
				input_array[k] = array1[i];
				i++;
			} else {
				input_array[k] = array2[j];
				j++;
			}
			k++;
		}
		// put missed elements in array:
		while (i < n1) {
			input_array[k] = array1[i];
			i++;
			k++;
		}
		// put missed elements in array:
		while (j < n2) {
			input_array[k] = array2[j];
			j++;
			k++;
		}
	}
	// a simple insert method:
	private int[] insert(int n, int k) {
		int[] output = new int[n];
		for (int i = 0; i < n; ++i) {
			output[i] = input_array[k + i];
		}
		return output;
	}
}
