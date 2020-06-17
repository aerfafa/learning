package se.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestCollect {

    public static void main(String args[]){


        List<String> li = new ArrayList<String>();
        li.add("a");
        li.add("b");
        li.add("c");

        Iterator<String> iterator = li.iterator();

      while(iterator.hasNext()){
          System.out.println(li.size());
          String next = iterator.next();
          if("a".equals(next)){
              iterator.remove();

          }
      }




    }



}
