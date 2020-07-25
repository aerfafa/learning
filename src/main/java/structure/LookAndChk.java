package structure;

import java.util.*;

/**
 * @Todo
 * @Author mina
 * @Date 2020-07-16  10:56
 */
public class LookAndChk {

    public static void main(String args[]){

List<String> linkedList = new ArrayList<String>();
        linkedList.add("2");
        linkedList.add("1");
        linkedList.add("0");
        linkedList.add("22");
//        String min = Collections.min(linkedList);
//        System.out.println(min);
//        Collections.sort(linkedList);
        for (String item2:
             linkedList) {
            System.out.println(item2);
        }

        Collections.reverse(linkedList);
        for (String item2:
                linkedList) {
            System.out.println(item2);
        }

        String  s1 = " a a ";
        System.out.println("beforeTrim:"+s1+"afterTrim:"+s1.trim());
//        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        Map<String,String> hashMap = new HashMap<String, String>();
        hashMap.put("a","22");
        hashMap.put("3","33");
        hashMap.put("1","11");
        hashMap.put("4","44");

//        for (String item:
//                hashMap.values()) {
//            System.out.println(item);
//        }

        System.out.println(Collections.binarySearch(linkedList,"2"));

        String ss[] = {"1","2"};
        List<String> strings =new ArrayList<>(Arrays.asList(ss)) ;
        strings.add("3");
        strings.sort(new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(strings.toString());



    }



}
