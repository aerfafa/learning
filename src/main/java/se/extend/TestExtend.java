package se.extend;

public class TestExtend {


    public static void main(String args[]){


        // 父类引用 ，指向各种不同的实现。这就是多态的含义
        Father father = new Child();
        //调用了子类的重写方法
        father.fun1();

       //可以访问父类public属性\方法
        System.out.println(father.s1);
        father.fun4();
        //无法直接调用子类属性,需要向下转型
        System.out.println(((Child) father).s1);
        ((Child) father).fun2("");
        //无法调用子类重载的方法
        father.fun2();

        //总结 1： 向上造型，可以访问父类的属性，方法（若有被重写则是子类重写的方法）,
        // 这就是所谓的多态含义，允许父类某个行为可以有不同实现方式 -->一个应用意义是有动态绑定功能，父类型作为A方法入参，调用这个A方法时传入子类型
        // 若要访问子类的自有的属性和方法，就是向下转型。


        Child cc = new Child();
        //可以使用父类的行为属性。
        cc.fun2();

        IAA aa = new Child();
        aa.methodB();
    }



}
