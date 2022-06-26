package mergesort;

public class MergeSort {


    public static void main(String[] args) {

        int[] arr = {4, 9, 2, 3, 0, 7, 5, 6, 1, 8};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        MergeSort sort = new MergeSort();

        sort.sort(arr, 1, 9);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void merge(int[] arr, int left, int mid, int right) {

        if (left == right) return;
        int[] tempArray = new int[right - left + 1];

        int currentPosition = 0;

        int i = left;
        int j = mid + 1;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                tempArray[currentPosition++] = arr[i++];
            } else {
                tempArray[currentPosition++] = arr[j++];
            }
        }

        while (i <= mid) {
            tempArray[currentPosition++] = arr[i++];
        }
        while (j <= right) {
            tempArray[currentPosition++] = arr[j++];
        }

        for (int k = 0; k < tempArray.length; k++) {
            arr[left++] = tempArray[k];
        }
        return;
    }

    public void sort(int[] arr, int start, int end) {

        if (start == end) {
            return;
        }

        int mid = ((start + end) / 2);
        sort(arr, start, mid);
        sort(arr, mid + 1, end);

        merge(arr, start, mid, end);
        return;

    }
}
