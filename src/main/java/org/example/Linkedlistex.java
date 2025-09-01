



package org.example;

import java.util.Collections;
import java.util.LinkedList;

public class Linkedlistex {
    public static void main(String[] args) {
        LinkedList<Integer> ob=new LinkedList<>();
ob.add(23);
ob.add(26);
ob.add(30);
ob.add(35);
ob.add(4,41);
ob.set(1,435);
ob.remove(3);
        Collections.sort(ob);
        Integer element1=ob.get(1);
        boolean exist = ob.contains(35);
        System.out.println("the elements in the list "+ob);
        System.out.println("element at index 1 " +element1);
        System.out.println("list contains 35 " +exist);
    }
}
