public class Queue<T extends Number> implements QueueFunction<T>{
    private Integer size;
    private T[] queue;
    private Integer front;
    private Integer rear;

    public Queue(Integer size){
        this.size = size;
        queue = (T[]) new Object[size];
        front = 0;
        rear = 0;
    }

    @Override
    public void enqueue(T item) {
        if(!overFlow()){
            queue[rear] = item;
            rear++;
            System.out.println("Enqueue: "+item);
        }
    }

    @Override
    public void dequeue() {
        if(!underFlow()){
            System.out.println("Dequeue: "+queue[front]);
            for(int i = 1; i== rear; i++){
                queue[i-1] = queue[i];
            }
            rear--;
        }
    }

    @Override
    public boolean overFlow() {
        if((rear +1)>=size){
            System.out.println("Queue Overflow");
            return true;
        }
        return false;
    }

    @Override
    public boolean underFlow() {
        if((rear-1)<0){
            System.out.println("Queue Underflow");
            return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        if(front.equals(rear)){
            System.out.println("Queue Empty");
            return true;
        }
        return false;
    }

    @Override
    public void showQueue() {
        if(isEmpty()) return;
        for (T item: queue) {
            System.out.print(item+" ");
        }
        System.out.println();
    }
}
