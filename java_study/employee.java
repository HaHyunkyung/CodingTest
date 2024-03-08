package java_study;

public class employee {
        public static void main(String[] args) {
            int[] work = {34, 28, 20, 31, 32, 28, 37, 41};
            quickSort(work, 0, work.length - 1);

            for (int i = 0; i < work.length; i++) {
                System.out.println(work[i]);
            }
        }
        public static void quickSort(int[] arr, int low, int high) {
            if (low < high) {
                int pivotIndex = partition(arr, low, high);
                quickSort(arr, low, pivotIndex - 1);
                quickSort(arr, pivotIndex + 1, high);
            }
        }

        public static int partition(int[] arr, int low, int high) {
            int pivot = arr[high];
            int i = low - 1;

            for (int j = low; j < high; j++) {
                if (arr[j] >= pivot) {
                    i++;
                    change(arr, i, j);
                }
            }

            change(arr, i + 1, high);
            return i + 1;
        }

        public static void change(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

}
