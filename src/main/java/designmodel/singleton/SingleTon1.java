package designmodel.singleton;

/**
 * @Todo
 * @Author mina
 * @Date 2020-07-30  9:21
 */
public class SingleTon1 {


    private static SingleTon1 singleTon1;
//    饿汉模式 -- 预先提供
//    private static SingleTon1 singleTon1 = new SingleTon1();


    //自定义无参数构造方法，不定义则系统默认提供
    private SingleTon1(){

    }

    //懒汉模式 --没有 就提供
    public static synchronized SingleTon1 getSingleTon1(){

        if(singleTon1 == null){
            return  new SingleTon1();
        }
        return singleTon1;

    }




}
