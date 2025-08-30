package org.example;
import java.util.ArrayList;
import java.util.Collections;

public class Arraylistex {
    public static void main(String[] args) {
         ArrayList <Integer>  list=new ArrayList<>();
         ArrayList <String> list1=new ArrayList<>();
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(3,5);
    list.remove(2);//to remove integer at index 2
        list.set(1,6);//to change index 1 to value 6
        Collections.sort(list);//to sorting the elements in the list
        list1.add("Apple");
list1.add(1,"javascript"); //to add element at specific index
    list1.add(2,"java"); //to add element at specific index
        list1.set(1, "springboot"); //to change index 1 string element to springboot
        Collections.sort(list1); //to sort the elements in list1
        String element= list1.get(1);//to access the string element at index1
         int element1=list.get(1);//to access the integer element at index2
boolean exist=list1.contains("Apple");
        System.out.println("it contains apple " +exist);//check the list contains element or not to return boolean value either true or false
for(String  list2 : list1)
        System.out.println("list 2 elements are" +list2);
        System.out.println("integers in the arraylist are "+list);
        System.out.println("Strings in the arraylist are "+list1);
       // System.out.println(list2);
        System.out.println("string  at index 1 is "+element);
        System.out.println("Integer at index 1 is " +element1);
    }
}
