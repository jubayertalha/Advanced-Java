import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Integer size;
        System.out.print("Enter Queue Size: ");
        size = (Integer) new Scanner(System.in).nextInt();
        while (true){
            int opt = getOption();
            if(opt==1) break;
            System.out.println("Queue Empty");
        }
        Object newItem = new Scanner(System.in).next();

    }
    static int getOption(){
        System.out.println("Enqueue: 1");
        System.out.println("Dequeue: 2");
        System.out.println("Show Queue: 3");
        System.out.print("\nEnter Option: ");
        System.out.println("\n");
        return (int) new Scanner(System.in).nextInt();
    }
}
