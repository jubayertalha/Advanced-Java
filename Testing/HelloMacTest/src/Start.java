import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Start {
    public static void main(String[] args) {
//        Calculate<Integer> add = Integer::sum;
//        Calculate<Integer> sub = (Integer num1, Integer num2) -> num1-num2;
//        Calculate<Float> multi = (Float num1, Float num2) -> {
//            return num1*num2;
//        };
//        Calculate<Double> div = (Double num1, Double num2) -> num1/num2;
//
//        add.show(add.calc(10,5));
//        add.show(sub.calc(10,5));
//        multi.show(multi.calc(10f,5f));
//        div.show(div.calc(10d,5d));
        Student s1 = new Student("Talha", 3.85);
        Student s2 = new Student("Jubayer", 3.95);
        Student s3 = new Student("Rahman", 3.90);

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        printAll(students);

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o2.getCgpa(),o1.getCgpa());
            }
        });

        printAll(students);

        Student maxCgpa = students.get(students.size()-1);
        System.out.println(maxCgpa.getName()+"\n"+maxCgpa.getCgpa());
    }

    public static void printAll(List<Student> items){
        for(Student item : items){
            System.out.println(item.getName()+"\n"+item.getCgpa());
        }
        System.out.println();
    }
}
