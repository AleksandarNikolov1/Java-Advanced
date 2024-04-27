package L07_Generics.Lab.P01_Jar_Of_T;

import java.util.ArrayDeque;

public class Jar<T> {
    private ArrayDeque<T> stack;

    public Jar(){
        this.stack = new ArrayDeque<>();
    }

    public void add(T element){
        this.stack.push(element);
    }

    public T remove(){
        return this.stack.pop();
    }

    public ArrayDeque<T> getStack() {
        return stack;
    }
}
