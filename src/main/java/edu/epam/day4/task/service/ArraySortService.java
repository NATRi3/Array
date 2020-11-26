package edu.epam.day4.task.service;

import edu.epam.day4.task.array.NumberArray;

public class ArraySortService {
    public void bubbleSortArray(int[] array){
        for(int i = array.length-1; i>0; i--){
            for(int j = 0; j < i; j++){
                if( array[j] < array[j+1] ){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }
    public void bubbleSortArray(NumberArray array){
        bubbleSortArray(array.getArray());
    }

    public void selectionSortArray(NumberArray arr){
        for (int i = 0; i < arr.length(); i++) {
            int min = arr.get(i);
            int min_i = i;
            for (int j = i+1; j < arr.length(); j++) {
                if (arr.get(j) < min) {
                    min = arr.get(j);
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = arr.get(i);
                arr.getArray()[i] = arr.getArray()[min_i];
                arr.getArray()[min_i] = tmp;
            }
        }
    }
    public void quickSort(NumberArray numArray){
        quickSortFromTo(numArray.getArray(),0,numArray.length());
    }

    private void quickSortFromTo(int[] numArray, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = numArray[(leftMarker + rightMarker) / 2];
        do {
            while (numArray[leftMarker] < pivot) {
                leftMarker++;
            }
            while (numArray[rightMarker] > pivot) {
                rightMarker--;
            }

            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    int tmp = numArray[leftMarker];
                    numArray[leftMarker] = numArray[rightMarker];
                    numArray[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);
        if (leftMarker < rightBorder) {
            quickSortFromTo(numArray, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSortFromTo(numArray, leftBorder, rightMarker);
        }
    }
}
