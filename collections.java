package day22;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class collections {

	public static void main(String[] args) {
              List<Object> al= new ArrayList<>();
              al.add(10);
              al.add("Lux");
              al.add(true);
              al.addFirst(200);
              al.addLast(100);
              al.contains(al);
              al.get(3);
              al.getFirst();
              al.getLast();
              al.remove(0);
              System.out.println(al);
              List<Integer> al1= new ArrayList<>();
              al1.add(80);
              al1.add(40);
              al1.add(456);
              al1.add(98);
              System.out.println(al1);
              Collections.sort(al1);
              System.out.println(al1);
              
              

	}


}
