package algorithms;

import java.util.Arrays;

public class Merge_Sort {
    static int[] mergeSort(int[] arr) {
        if (arr == null) {
            return null;
        }
        if (arr.length < 2) {
            return arr;
        }

        int[] arrA = Arrays.copyOfRange(arr, 0, arr.length / 2);
        int[] arrB = Arrays.copyOfRange(arr, arr.length / 2, arr.length);

        arrA = mergeSort(arrA);
        arrB = mergeSort(arrB);

        return merge(arrA, arrB);
    }

    private static int[] merge(int[] arrA, int[] arrB) {
        int[] merged = new int[arrA.length + arrB.length];
        int posA = 0;
        int posB = 0;
        for (int i = 0; i < merged.length; i++) {
            if (posA == arrA.length) {
                merged[i] = arrB[posB];
                posB++;
            } else if (posB == arrB.length) {
                merged[i] = arrA[posA];
                posA++;
            } else if (arrA[posA] < arrB[posB]) {
                merged[i] = arrA[posA];
                posA++;
            } else if (arrB[posB] < arrA[posA]) {
                merged[i] = arrB[posB];
                posB++;
            }
        }
        return merged;
    }
}
