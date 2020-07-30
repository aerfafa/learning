package se.statics;

/**
 *  测试构造方法、static代码块 执行顺序
 */
public class TestStatic {

    static {
        System.out.println("static{}代码块执行");
    }

private String ss = "ssss";

    public static  void main(String args[]){
        System.out.println("s");
    }


}
