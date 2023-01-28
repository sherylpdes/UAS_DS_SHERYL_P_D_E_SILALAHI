import java.util.NoSuchElementException;

public class ArrayQueue {
    private Book[] queue;
    private int front;
    private int rear;

    public ArrayQueue(int capacity){
        queue = new Book[capacity];
    }

    public void enqueue(Book book){
        if(rear == queue.length){
            Book[] newArray = new Book[2 * queue.length];
            System.arraycopy(queue,0,newArray,0,queue.length);
            queue = newArray;
        }
        queue[rear] = book;
        rear++;
    }

    public Book dequeue(){
        if(size() == 0){
            throw new NoSuchElementException();
        }
        Book book = queue[front];
        queue[front] = null;
        front++;
        if(size() == 0){
            front = 0;
            rear = 0;
        }
        return book;
    }

    public int size(){
        return rear - front;
    }

    public void printQueue(){
        for(int i = front; i< rear; i++){
            System.out.println(queue[i]);
        }
    }
}
