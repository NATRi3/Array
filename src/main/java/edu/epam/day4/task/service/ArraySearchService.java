package edu.epam.day4.task.service;

import edu.epam.day4.task.array.NumberArray;

public class ArraySearchService {
    public int binarySearch(NumberArray array, int item) {
        int first = 0;
        int last = array.length() - 1;
        int position;
        position = (first + last) / 2;
        while ((array.getArray()[position] != item) && (first <= last)) {
            if (array.getArray()[position] > item) {
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
        return searchMaxNumber(array.getArray());
    }

    public int searchMaxNumber(int[] array){
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[max]) {
                max = i;
            }
        }
        return max;
    }

    public int searchMinNumber(int[] array){
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[min]) {
                min = i;
            }
        }
        return min;
    }

    public int searchMinNumber(NumberArray array) {
        return searchMinNumber(array.getArray());
    }

    public NumberArray searchPrimeNumber(NumberArray array) {
        NumberArray PrimeNumbers = new NumberArray();
        for (int i = 0; i < array.length(); i++) {
            if (isNumberPrime(array.getNumber(i))){
                PrimeNumbers.add(array.getNumber(i));
            }
        }
        return  PrimeNumbers;
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
        NumberArray result = new NumberArray();
        for(int i = 0; i < array.length(); i++){
            if(isNumberPrime(array.getNumber(i))){
                result.add(array.getNumber(i));
            }
        }
        return result;
    }

    private boolean isNumberFibonacci(int number){
        if (number == 0) {
            return true;
        }
        int firstFibonacci = 0, secondFibonacci = 1;
        while (number >= secondFibonacci) {
            int tmp = secondFibonacci;
            secondFibonacci = secondFibonacci + firstFibonacci;
            firstFibonacci = tmp;
            if (number == secondFibonacci)
                return true;
        }
        return false;
    }

    public NumberArray searchThreeDigitNumber(NumberArray array){
        NumberArray result = new NumberArray();
        int a,b,c;
        for(int i = 0; i < array.length(); i++){
            if(array.getNumber(i)>101&&array.getNumber(i)<988){
                a=array.getNumber(i)%10;
                b=array.getNumber(i)/10%10;
                c=array.getNumber(i)/100;
                if ( a!=b && a!=c && b!=c ){
                    result.add(array.getNumber(i));
                }
            }
        }
        return result;
    }
}
