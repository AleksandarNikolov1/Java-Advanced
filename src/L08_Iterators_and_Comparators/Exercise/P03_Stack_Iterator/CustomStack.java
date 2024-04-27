package L08_Iterators_and_Comparators.Exercise.P03_Stack_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomStack implements Iterable<Integer> {

    private List<Integer> stack;

    public CustomStack(){
        this.stack = new ArrayList<>();
    }

    public void push(int integer){
        stack.add(integer);
    }

    public int pop(){
        return stack.remove(stack.size() - 1);
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new StackIterator();
    }

    private class StackIterator implements Iterator<Integer>{

        private int index = stack.size() - 1;

        @Override
        public boolean hasNext() {
            return index >= 0;
        }

        @Override
        public Integer next() {
            return stack.get(index--);
        }
    }
}
