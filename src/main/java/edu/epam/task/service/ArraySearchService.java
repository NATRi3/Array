package edu.epam.task.service;

import edu.epam.task.array.NumberArray;

public class ArraySearchService {
    public int binarySearch(NumberArray array, int item) {
        int first = 0;
        int last = array.size() - 1;
        int position;
        position = (first + last) / 2;
        while ((array.getNumber(position) != item) && (first <= last)) {
            if (array.getNumber(position) > item) {
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

    public int searchMaxNumber(NumberArray array){
        int max = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.getNumber(i) > array.getNumber(max)) {
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
        for (int i = 0; i < array.size(); i++) {
            if (isNumberPrime(array.getNumber(i))){
                PrimeNumbers.add(array.getNumber(i));
            }
        }
        return  PrimeNumbers;
    }

    private boolean isNumberPrime (int number){
        boolean result = true;
        for (int j = 2; j < number; j++) {
            if (number % j != 0) {
                result = false;
            }
        }
        return result;
    }

    public NumberArray searchFibonacciNumber (NumberArray array){
        NumberArray result = new NumberArray();
        for(int i = 0; i < array.size(); i++){
            if(isNumberPrime(array.getNumber(i))){
                result.add(array.getNumber(i));
            }
        }
        return result;
    }

    private boolean isNumberFibonacci(int number){
        boolean result = false;
        if (number == 0) {
            result = true;
        }
        int firstFibonacci = 0, secondFibonacci = 1;
        while (number >= secondFibonacci) {
            int tmp = secondFibonacci;
            secondFibonacci = secondFibonacci + firstFibonacci;
            firstFibonacci = tmp;
            if (number == secondFibonacci)
                result = true;
        }
        return false;
    }

    public NumberArray searchThreeDigitNumber(NumberArray array){
        NumberArray result = new NumberArray();
        int a,b,c;
        for(int i = 0; i < array.size(); i++){
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
