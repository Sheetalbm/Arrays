package HashTable;

import java.util.*;
import java.lang.String;
/*
 Stores employees data
 */
public class SimpleHashTable {

    private Employee[] eHashTable;

    public SimpleHashTable(){
        eHashTable = new Employee[10];
    }

    public void put(String key, Employee employee){
        int hashedKey = hashFunction(key);
        if(eHashTable[hashedKey]!=null){
            System.out.println("The data in the hashtable at this location already exists");
        }else {
            eHashTable[hashedKey] = employee;
        }
    }

    private int hashFunction(String key){
        return key.length() % eHashTable.length;
    }

    public Employee get(String key){
        int hashedKey = hashFunction(key);
        return eHashTable[hashedKey];
    }

    public void printHashTable(){
        for(int i=0; i<eHashTable.length; i++){
            System.out.println(eHashTable[i]);
        }
    }
}
