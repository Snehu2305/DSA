import java.util.*;

class QuickSort {
    public static void main(String[] ar) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = scan.nextInt();

        System.out.println("Enter the elements of an array: ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }

        QuickSort(array, 0, size - 1);

        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

    static int partition(int[] a, int lb, int ub) {
        int pivot = a[lb];
        int start = lb;
        int end = ub;

        while (start < end) {
            while (start <= ub && a[start] <= pivot) {
                start++;
            }
            while (a[end] > pivot) {
                end--;
            }
            if (start < end) {
                swap(a, start, end);
            }
        }
        swap(a, lb, end);
        return end;
    }

    static void QuickSort(int[] a, int lb, int ub) {
        if (lb < ub) {
            int loc = partition(a, lb, ub);
            QuickSort(a, lb, loc - 1);
            QuickSort(a, loc + 1, ub);
        }
    }

    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

