package java8;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        FunctionalInterfaceDemo functionalInterfaceDemo = Test::testImp;
        functionalInterfaceDemo.singleAbs();

        // if no implementation of is available in existing code base then use following code for LE

        FunctionalInterfaceDemo f = ()-> System.out.println("Implementation of SAM");
        f.singleAbs();

    }
}
class Test{
    public static void testImp() {
        System.out.println("This is test implementation of your abs");
    }
}
