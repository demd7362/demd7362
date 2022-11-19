public class SortExample {
    static void bubbleSort(int[] arr) {
        // 앞에서부터 현재 원소와 다음 원소를 비교한다!
        // 뒤에서부터 정렬 완료된다
        for (int i = 1; i < arr.length; i++) { // 9 8 1 3 2
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void selectionSort(int[] arr) {
        // 주어진 리스트에서 최솟값을 찾고 맨 앞자리 값과 교환한다!
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            // 최솟값을 갖고있는 인덱스 찾기
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // i번째 값과 찾은 최솟값을 서로 교환
            swap(arr, minIndex, i);
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int target = arr[i];
            int j = i - 1;
            for (; j >= 0 && target < arr[j]; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = target;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = { 9, 8, 1, 3, 2 };
        bubbleSort(arr);
        selectionSort(arr);
        insertionSort(arr);

    }
}
