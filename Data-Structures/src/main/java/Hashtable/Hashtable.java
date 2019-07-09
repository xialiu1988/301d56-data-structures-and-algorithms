package Hashtable;

import java.util.HashMap;

public class Hashtable {

    public Llist[] arr;
    public int size;


    public void setArr(Llist[] arr) {
        this.arr = arr;
    }

    public void setSize(int size) {
        this.size = size;
    }

    //constructor
    public Hashtable(){
        size=50;
        arr=new Llist[size];
    }

    public Hashtable(int size){
        this.size=size;
        arr=new Llist[size];
    }

    //add value to hashtable
    public void add(String key,String value){
   int index=hash(key);
        if (arr[index] == null)
        {
            arr[index] = new Llist();
        }
        arr[index].add(key, value);


    }

    //hash the key
    public int hash(String key) {
        int hashValue = 0;
        char[] letters = key.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            hashValue += letters[i];
        }
        hashValue = (hashValue * 599) % arr.length;
        return hashValue;
    }

    //delete item from hashtable
    public boolean delete(String key)
    {
        int index = hash(key);
        if (arr[index] != null)
        {
            return arr[index].delete(key);
        }
        return false;
    }

    public Llist get(String key)
    {
        int index = hash(key);
        if (arr[index] != null)
        {
            return arr[index];
        }

        return null;
    }

    public boolean contains(String key)
    {
        int index = hash(key);
        if (arr[index] != null)
        {
            return true;
        }
        else return false;

    }


}
