package edu.epam.task.service;

public class JaggedArraySortService {

    public void jaggedArraySort(int [][] array, TypeSort type){
        ArraySortService sortService = new ArraySortService();
        for (int[] ints : array) {
            sortService.bubbleSortArray(ints);
        }
        for(int i = array.length-1; i>0; i--){
            for(int j = 0; j < array.length-1; j++){
                if (typeSortMethod(array[j], array[j+1], type)) {
                    int[] tmp = array[j];
                    array[j] = array[j+1];
                    array[j + 1] = tmp;
                }
            }
        }
    }

    private boolean typeSortMethod(int[] array, int[] array1, TypeSort typeSort) {
        ArraySearchService searchService = new ArraySearchService();
        for (int i = 0; i < (Math.min(array.length, array1.length)); i++) {
            switch (typeSort) {
                case MIN:
                    if (array[array.length-i-1] != array1[array1.length-i-1]) {
                        return array[array.length-i-1] > array1[array1.length-i-1];
                    }
                    if (i==(Math.min(array.length,array1.length)-1)&&array1.length>array.length){
                        return true;
                    }
                case MAX:
                    if (array[i] != array1[i]) {
                        return array[i] < array1[i];
                    }
                case SUM:
                    return sum(array) < sum(array1);
            }
        }
        return false;
    }

    private int sum(int[] array) {
        int sum= 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }
}
