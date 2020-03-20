package simons_algoritmer;

import timer.MyTimer;

public class BubbleSort {
    public void bubbleSort(){
        int[] list = new int[]{9, 2, 5, 3, 9, 7, 9, 2, 5, 3, 9, 7, 9, 2, 5, 3, 9, 7, 9, 2, 5, 3, 9, 7, 9, 2, 5, 3, 9, 7, 9, 2, 5, 3, 9, 7, 9, 2, 5, 3, 9, 7, 9, 2, 5, 3, 9, 7, 9, 2, 5, 3, 9, 7, 9, 2, 5, 3, 9, 7, 9, 2, 5, 3, 9, 7, 9, 2, 5, 3, 9, 7, 9, 2, 5, 3, 9, 7, 9, 2, 5, 3, 9, 7, 9, 2, 5, 3, 9, 7};
        long startTime = MyTimer.currentTimestamp();
        //i perform the loop as many times as the list is long, because the app told me so :P
        for (int k = 0; k < list.length; k++) {
            //in every loop i make the swaps if right is less the left.
            for (int i = list.length-1; i > 0; i--) {
                //store values
                int currentRightNumber = list[i];
                int currentLeftNumber = list[i-1];
                //perform swap
                if (currentRightNumber<currentLeftNumber){
                    list[i]=currentLeftNumber;
                    list[i-1]=currentRightNumber;
                }
            }
        }
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        long endTime = MyTimer.currentTimestamp();
        String result = MyTimer.timeElapsed(startTime, endTime) ;
        System.out.println();
        System.out.println(result);
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort();
    }
}
