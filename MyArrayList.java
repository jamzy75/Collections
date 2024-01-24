package org.example;

public class MyArrayList {
    private int [] data;
    private int numElements;
    private  int capacity = 10;
    private int expansionFactor = 10;


    public MyArrayList(int capacity){
        this.capacity = capacity;
        data = new int[capacity];
    }

    public MyArrayList(int capacity,int expansionFactor){
       if(capacity <= 1000 && capacity>0){
           this.capacity = expansionFactor;
       }else if(capacity > 1000)
       {
           this.capacity = 1000;
       }


        if(expansionFactor <= 10000 && expansionFactor > 0){
            this.expansionFactor = expansionFactor;
        }else if(expansionFactor > 10000){
            this.expansionFactor = 10000;
        }

        data = new int[capacity];
    }

   public MyArrayList(){
       data = new int[10];
   }

   public int size(){
       return numElements;
   }

   public void add(int num){
       if(numElements == data.length){
           Grow();
       }
       data[numElements] = num;
       numElements++;
   }


   public int getIndex(int index){
        if(data.length<index && data.length>=index){
            return -1;
        }
        return data[index];
   }

   //Grow
    private void Grow(){
        //create new array with X extra slot
        int [] tempArray = new int[data.length + 10];
        //loop through original array and copy to new array
        for (int i = 0; i < data.length; i++){
            tempArray[i] = data[i];
        }
        data = tempArray;
    }


    //Replace the original array with the new one

}
