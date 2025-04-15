package org.example.tp1.exo3;

public class BinarySearchFixed {

    public static int binarySearch(int[] array, int element) {
        if (array == null) {
            throw new NullPointerException("Array must not be null");
        }

        int low = 0;
        int high = array.length - 1;

        while (low <= high) { // correction ici
            int mid = (low + high) / 2;

            if (array[mid] == element) {
                return mid;
            } else if (array[mid] < element) { // strictement inférieur ici
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; // élément non trouvé
    }
}

