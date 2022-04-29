package com.example.sorting;

import org.jetbrains.annotations.NotNull;

public class SortingUtility {

    /**
     * Part A Gnome Sort Algorithm
     * <p>
     * Implement gnome sort per this pseudocode.
     * <p>
     * <pre>
     *    method gnomeSort(a[])
     *       pos = 0
     *       while pos < length(a)
     *          if (pos == 0 or a[pos] >= a[pos-1])
     *          pos = pos + 1
     *       else
     *          swap a[pos] and a[pos-1]
     *          pos = pos - 1
     * </pre>
     *
     * @param data
     * @param <T>
     * @see <a href="https://en.wikipedia.org/wiki/Gnome_sort">https://en.wikipedia.org/wiki/Gnome_sort</a>
     */

    public static <T extends Comparable<T>> void gnomeSort(T[] data) {
        // TODO implement pseudocode above

        for (int i = 0; i <= data.length; i++) {
            int currentPos = i;

            while (currentPos < data.length) {
                if (currentPos == 0)
                    currentPos++;
                if (data[currentPos].compareTo(data[currentPos - 1]) >= 0) {
                    currentPos++;
                } else {
                    swap(data, currentPos, currentPos - 1);
                    currentPos--;
                }
            }

        }
    }

    /**
     * Part B Optimized Gnome Sort Algorithm.
     * <p>
     * Implement an optimized gnome sort per the pseudocode below.
     * <p>
     * <pre>
     *    method gnomierSort(a[])
     *       for pos in 1 to length(a)
     *       gnomierSort(a, pos)
     * </pre>
     *
     * @param data
     * @param <T>
     * @see <a href="https://en.wikipedia.org/wiki/Gnome_sort">https://en.wikipedia.org/wiki/Gnome_sort</a>
     */
    public static <T extends Comparable<T>> void gnomierSort(T[] data) {

        // TODO implement pseudocode above

        for (int i = 0; i <= data.length; i++) {
            int currentPos = i;

            while (currentPos < data.length) {
                if (currentPos == 0 || data[currentPos].compareTo(data[currentPos - 1]) >= 0) {
                    currentPos++;
                } else {
                    swap(data, currentPos, currentPos - 1);
                    currentPos--;
                }
            }
        }
    }

    /**
     * Part C Optimized Gnome Sort Algorithm
     * <p>
     * Implement an optimized gnome sort per the pseudocode below.
     * <p>
     * <pre>
     *    method gnomierSort(a[], upperBound)
     *       pos = upperBound
     *       while pos > 0 and a[pos-1] > a[pos]
     *          swap a[pos-1] and a[pos]
     *          pos = pos - 1
     * </pre>
     *
     * @param data
     * @param <T>
     */
    private static <T extends Comparable<T>> void gnomierSort(T[] data, int upperBound) {

        // TODO implement pseudocode above
        for (int i = 0; i <= data.length; i++) {
            int currentPos = upperBound;
            upperBound = i;

            while (currentPos > 0 && data[upperBound - 1].compareTo(data[upperBound]) <= 0) {
                swap(data, upperBound - 1, upperBound);
                currentPos--;
            }
        }
    }

    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {

        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;

    }

}





