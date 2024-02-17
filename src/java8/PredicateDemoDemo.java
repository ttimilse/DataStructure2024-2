package java8;

import java.util.function.Predicate;

public class PredicateDemoDemo {
    public static void main(String[] args) {
//        PredicateDemoDemo predicateDemoDemo = new PredicateDemoDemo();
//        System.out.println(predicateDemoDemo.testStringLength("Nepal"));

        Predicate<String> checkLength = s->s.length() >=3;
        System.out.println("The length of String is greater than 3: " + checkLength.test("Nepal"));

    }
//    public boolean testStringLength(String s){
//        if(s.length()>=3){
//            return true;
//        }else return false;
//    }
}
