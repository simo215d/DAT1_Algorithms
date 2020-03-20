package simons_algoritmer;

import timer.MyTimer;

public class SelectionSort {
    public void selectionSort() {
        int[] list = new int[]{9, 2, 5, 3, 9, 7, 9, 2, 5, 3, 9, 7, 9, 2, 5, 3, 9, 7, 9, 2, 5, 3, 9, 7, 9, 2, 5, 3, 9, 7, 9, 2, 5, 3, 9, 7, 9, 2, 5, 3, 9, 7, 9, 2, 5, 3, 9, 7, 9, 2, 5, 3, 9, 7, 9, 2, 5, 3, 9, 7, 9, 2, 5, 3, 9, 7, 9, 2, 5, 3, 9, 7, 9, 2, 5, 3, 9, 7, 9, 2, 5, 3, 9, 7, 9, 2, 5, 3, 9, 7};
        long startTime = MyTimer.currentTimestamp();
        for (int i = 0; i < list.length; i++) {
            int smallest = list[i];
            int indexOfNumberToSwap = i;
            //i find the smallest number starting from what we already sorted
            for (int j = i; j < list.length; j++) {
                if (list[j] < smallest) {
                    smallest = list[j];
                    indexOfNumberToSwap = j;
                }
            }
            //here i swap the smallest number with our 'checkpoint' element position
            list[indexOfNumberToSwap] = list[i];
            list[i] = smallest;
            System.out.println("smallest number: " + smallest + ". index: " + indexOfNumberToSwap + ". list: ");
            for (int j = 0; j < list.length; j++) {
                System.out.println(list[j]);
            }
        }
        long endTime = MyTimer.currentTimestamp();
        String resultat = MyTimer.timeElapsed(startTime, endTime) ;
        System.out.println();
        System.out.println(resultat);
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort();
    }
}
