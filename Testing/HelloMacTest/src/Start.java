public class Start {
    public static void main(String[] args) {
        Calculate<Integer> add = Integer::sum;
        Calculate<Integer> sub = (Integer num1, Integer num2) -> num1-num2;
        Calculate<Float> multi = (Float num1, Float num2) -> {
            return num1*num2;
        };
        Calculate<Double> div = (Double num1, Double num2) -> num1/num2;

        add.show(add.calc(10,5));
        add.show(sub.calc(10,5));
        multi.show(multi.calc(10f,5f));
        div.show(div.calc(10d,5d));
    }
}
