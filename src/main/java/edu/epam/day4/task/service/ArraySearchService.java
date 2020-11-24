package edu.epam.day4.task.service;

import edu.epam.day4.task.array.NumberArray;

public class ArraySearchService {
    public static int binarySearch(NumberArray array, int item) {
        int first = 0;
        int last = array.length() - 1;
        int position;
        position = (first + last) / 2;
        while ((array.getNumberArray()[position] != item) && (first <= last)) {
            if (array.getNumberArray()[position] > item) {
                last = position - 1;
            } else {
                first = position + 1;
            }
            position = (first + last) / 2;
        }
        if (first <= last) {
            return ++position;

        } else {
            throw new NullPointerException();
        }
    }
    public int searchMaxNumber(NumberArray array) {
        int max = 0;
        for (int i = 0; i < array.length(); i++) {
            if (array.getNumberArray()[i] > array.getNumberArray()[max]) {
                max = i;
            }
        }
        return max;
    }

    public int searchMinNumber(NumberArray array) {
        int min = 0;
        for (int i = 0; i < array.length(); i++) {
            if (array.getNumberArray()[i] < array.getNumberArray()[min]) {
                min = i;
            }
        }
        return min;
    }

    public NumberArray searchPrimeNumber(NumberArray array) {
        NumberArray indexPrimeNumber = new NumberArray();
        for (int i = 0; i < array.length(); i++) {
            if (isNumberPrime(array.getNumber(i))){
                indexPrimeNumber.add(array.getNumber(i));
            }
        }
        return  indexPrimeNumber;
    }

    private boolean isNumberPrime (int number){
        for (int j = 2; j < number; j++) {
            if (number % j != 0) {
                return false;
            }
        }
        return true;
    }

    public NumberArray searchFibonacciNumber (NumberArray array){
        for(int i = 0; i < array.length(); i++){
            if (array.getNumber(i))
        }
    }

    private boolean isNumberFibonacci (int number){
        
    }

}
