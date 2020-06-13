package metodosOrdenação;

public class MergeSort {

	void merge(long[] vetorMerge, int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;

		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; ++i)
			L[i] = (int) vetorMerge[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = (int) vetorMerge[m + 1 + j];

		int i = 0, j = 0;

		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				vetorMerge[k] = L[i];
				i++;
			} else {
				vetorMerge[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			vetorMerge[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			vetorMerge[k] = R[j];
			j++;
			k++;
		}
	}

	public void sortMergeSort(long[] vetorMerge, int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;

			sortMergeSort(vetorMerge, l, m);
			sortMergeSort(vetorMerge, m + 1, r);
			merge(vetorMerge, l, m, r);
			
		}
	}

}
