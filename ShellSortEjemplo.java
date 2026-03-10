public class ShellSortSimple {

    public static void shellSort(int[] arr) {

        int n = arr.length;

        for (int gap = n / 2; gap > 0; gap = gap / 2) {

            for (int i = gap; i < n; i++) {

                int temp = arr[i];
                int j = i;

                while (j >= gap && arr[j - gap] > temp) {

                    arr[j] = arr[j - gap];
                    j = j - gap;
                }

                arr[j] = temp;
            }
        }
    }

    public static void main(String[] args) {

        int[] numeros = {9, 5, 1, 4, 3};

        System.out.println("Arreglo original:");

        for (int n : numeros) {
            System.out.print(n + " ");
        }

        shellSort(numeros);

        System.out.println("\nArreglo ordenado:");

        for (int n : numeros) {
            System.out.print(n + " ");
        }
    }
}
