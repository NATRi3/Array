package edu.epam.day4.task.service;

import edu.epam.day4.task.array.NumberArray;

import java.sql.Array;

public class ArraySortService {
    public void bubbleSortArray(NumberArray array){
        for(int i = array.length()-1; i<0; i--){
            for(int j = 0; j < i; j++){
                if( array.getNumberArray()[j] > array.getNumberArray()[j+1] ){
                    int tmp = array.getNumberArray()[j];
                    array.getNumberArray()[j] = array.getNumberArray()[j+1];
                    array.getNumberArray()[j+1] = tmp;
                }
            }
        }
    }

    public void selectionSortArray(NumberArray arr){
        for (int i = 0; i < arr.length(); i++) {
            int min = arr.getNumberArray()[i];
            int min_i = i;
            for (int j = i+1; j < arr.length(); j++) {
                if (arr.getNumberArray()[j] < min) {
                    min = arr.getNumberArray()[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = arr.getNumberArray()[i];
                arr.getNumberArray()[i] = arr.getNumberArray()[min_i];
                arr.getNumberArray()[min_i] = tmp;
            }
        }
    }
    public void quickSort(int[] numArray){
        quickSort(numArray,0,numArray.length);
    }

    public void quickSort(int[] numArray, int leftBorder, int rightBorder) {
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
            quickSort(numArray, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(numArray, leftBorder, rightMarker);
        }
    }
}
