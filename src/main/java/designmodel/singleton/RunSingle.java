package designmodel.singleton;

/**
 * @Todo
 * @Author mina
 * @Date 2020-07-30  9:43
 */
public class RunSingle {



    public static void main(String args[]){


        SingleTon1 singleTon1 = SingleTon1.getSingleTon1();

//        System.out.println(singleTon1.getAa());

        SingletonEnum.INSTANCE.doSthing();

    }
}
