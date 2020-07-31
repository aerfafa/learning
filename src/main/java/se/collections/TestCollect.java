package se.collections;

import java.util.*;

public class TestCollect {

    public static void main(String args[]){


        iteratorMap();

        iteratorList();


    }


    private static void toPrintln(String ss){

        System.out.println(ss);

    }

    private static  void iteratorList(){

        toPrintln("-----------list.iterator------start------");

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
        toPrintln("-----------list.iterator------end------");
    }

    private static  void  iteratorMap(){

        HashMap<String,String> itemMap = new HashMap<>();
        itemMap.put("1s","11");
        itemMap.put("1","11");
        itemMap.put("12","22");
        for (Map.Entry<String,String> entry :itemMap.entrySet()) {
            toPrintln("key:"+entry.getKey() +"value:"+entry.getValue());
        }
        ArrayList<Map.Entry<String, String>> entries = new ArrayList<>(itemMap.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        for (Map.Entry<String, String> entry:entries){
            toPrintln(entry.getKey()+" ："+entry.getKey());
        }

    }



}
