package se.oftenuse;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Todo
 * @Author mina
 * @Date 2020-07-25  17:00
 */
public class TestNum {

    public static  void main(String args[]){

//        NumberFormat currency = NumberFormat.getCurrencyInstance(); //建立货币格式化引用
//        NumberFormat percent = NumberFormat.getPercentInstance();  //建立百分比格式化引用
//        percent.setMaximumFractionDigits(3); //百分比小数点最多3位
//
//        BigDecimal loanAmount = new BigDecimal("15000.48"); //贷款金额
//        BigDecimal interestRate = new BigDecimal("0.008"); //利率
//        BigDecimal interest = loanAmount.multiply(interestRate); //相乘
//
//        System.out.println("贷款金额:\t" + currency.format(loanAmount));
//        System.out.println("利率:\t" + percent.format(interestRate));
//        System.out.println("利息:\t" + currency.format(interest));

        String  ss = "1234asdf";

        char[] s = {'a','b'};
        System.out.println(String.copyValueOf(s));


        BigDecimal bigDecimal = new BigDecimal("-0.09");
        BigDecimal abs = bigDecimal.abs();
        System.out.println(abs.toString());



        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());


        Date time = calendar.getTime();


    }

}
