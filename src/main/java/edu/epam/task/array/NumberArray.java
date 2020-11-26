package edu.epam.task.array;

import java.util.Arrays;

public class NumberArray{
    private int[] array;

    public NumberArray(int[] array) {
        this.array = array;
    }

    public NumberArray() {
        array = new int[50];
    }
    public NumberArray(int size){
        array = new int[size];
    }

    public NumberArray(NumberArray numberArray) {
        this.array = numberArray.getArray();
    }

    public int[] getArray(){
        int[] result = new int[array.length];
        int i=0;
        for(int a:array){
            result[i]=a;
            i++;
        }
        return result;
    }

    public void setNumberArray(int[] array) {
        this.array = array;
    }

    public int getNumber(int i){
        return array[i];
    }

    public void add(int a){
        array[array.length]= a;
    }

    public int get(int i){
        return array[i];
    }

    public int size() {
        return array.length;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder().append("length=").append(size())
                .append(", array=").append(Arrays.toString(array));
        return String.valueOf(result);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        if (obj==null|| getClass() !=obj.getClass()){
            return false;
        }

        NumberArray array = (NumberArray) obj;
        if (array.size()!=this.size()){
            return false;
        }
        for (int i = 0; i<size(); i++){
            if(array.getNumber(i)!=this.getNumber(i)){
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 31;
        int result = size() * 31;
        for(int i = 0; i<size(); i++) {
            result += array[i]*31;
        }
        return result;
    }
}
