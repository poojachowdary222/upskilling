package day2;

public class CommonElements {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 4, 6, 7, 9};
        int[] array2 = {1, 2, 4, 5, 9, 10};
        findCommonElements(array1, array2);
    }

    public static void findCommonElements(int[] array1, int[] array2) {
        int i = 0, j = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] == array2[j]) {
                System.out.print(array1[i] + " ");
                i++;
                j++;
            } else if (array1[i] < array2[j]) {
                i++;
            } else {
                j++;
            }
        }
    }
}

