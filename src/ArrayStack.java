import java.util.EmptyStackException;

public class ArrayStack {
    private Book[] stack;
    private int top;

    public ArrayStack (int capacity){
        stack = new Book[capacity];
    }

    public void push (Book book){
        if(top == stack.length){
            //resize element array
            Book[] newArray = new Book[2 * stack.length];
            System.arraycopy(stack,0,newArray,0,stack.length);
            stack = newArray;

        }
        stack[top++] = book;
    }

    public Book pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        Book book = stack[--top];
        stack[top] = null;
        return book;
    }

    public boolean isEmpty(){
        return top == 0;
    }

    public Book peek(){
        if(isEmpty()){
            throw  new EmptyStackException();
        }
        return stack[top-1];
    }
    public int size(){
        return top;
    }

    public void printStack(){
        for(int i = top - 1; i>=0;i--){
            System.out.println(stack[i]);
        }
    }
}

