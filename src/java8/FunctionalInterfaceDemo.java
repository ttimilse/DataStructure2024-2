package java8;

public interface FunctionalInterfaceDemo {
    void singleAbs();
    default void printName(){
        System.out.println("Welcome to code");
    }
}
