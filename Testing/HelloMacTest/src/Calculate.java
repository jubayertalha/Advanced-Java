@FunctionalInterface
public interface Calculate <T extends Number>{
    T calc(T num1, T num2);
    default void show(T res){
        System.out.println("Result: "+res);
    }
}
