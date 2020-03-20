package simons_algoritmer;

import timer.MyTimer;

public class InsertionSort {
    public void insertionSort(){
        int[] list = new int[]{9, 2, 5, 3, 9, 7, 9, 2, 5, 3, 9, 7, 9, 2, 5, 3, 9, 7, 9, 2, 5, 3, 9, 7, 9, 2, 5, 3, 9, 7, 9, 2, 5, 3, 9, 7, 9, 2, 5, 3, 9, 7, 9, 2, 5, 3, 9, 7, 9, 2, 5, 3, 9, 7, 9, 2, 5, 3, 9, 7, 9, 2, 5, 3, 9, 7, 9, 2, 5, 3, 9, 7, 9, 2, 5, 3, 9, 7, 9, 2, 5, 3, 9, 7, 9, 2, 5, 3, 9, 7};
        long startTime = MyTimer.currentTimestamp();
        for (int i = 0; i < list.length; i++) {
            System.out.println(i);
            int currentElement = list[i];
            int k;
            for (k = 0; k >= 0 && list[k] > currentElement ; k--) {
                list[k+1] = list[k];
            }
            list[k+1] = currentElement;
        }
        long endTime = MyTimer.currentTimestamp();
        String resultat = MyTimer.timeElapsed(startTime, endTime) ;
        System.out.println();
        System.out.println(resultat);
    }

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort();
    }
}
