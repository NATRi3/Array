package edu.epam.day4.task.array;

import java.util.Arrays;

public class NumberArray{
    private int length;
    private int[] array;

    public NumberArray(int[] array) {
        this.array = array;
    }

    public NumberArray() {
        this.length=0;
    }

    public int[] getArray() {
        return array;
    }

    public void setNumberArray(int[] array) {
        this.array = array;
    }

    public int getNumber(int i){
        return array[i];
    }

    public void add(int a){
        array[length+1]= a;
        length++;
    }

    public int get(int i){
        return array[i];
    }

    public int length() {
        return length;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder().append("length=").append(length)
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
        if (array.length()!=this.length()){
            return false;
        }
        for (int i = 0; i<length; i++){
            if(array.getArray()[i]!=this.getArray()[i]){
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 31;
        int result = length * 31;
        for(int i = 0; i<length; i++) {
            result += array[i]*31;
        }
        return result;
    }
}
