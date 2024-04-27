package L07_Generics.Exercise.P09_Custom_List_Iterator;

import java.util.*;
import java.util.function.Consumer;

public class CustomList<T extends Comparable<T>> implements Iterable<T> {

    private List<T> list;

    public CustomList(){
        this.list = new ArrayList<>();
    }

    public List<T> getList() {
        return list;
    }

    public void add(T element){
        this.list.add(element);
    }

    public T remove(int index){
        return list.remove(index);
    }

    public boolean contains(T element){
        return this.list.contains(element);
    }

    public void swap(int firstIndex, int secondIndex){
        T temp = this.list.get(firstIndex);
        this.list.set(firstIndex, list.get(secondIndex));
        this.list.set(secondIndex, temp);
    }

    public int countGreaterThan(T element){
        return (int) this.list.stream().filter(e -> e.compareTo(element) > 0).count();
    }

    public T getMax(){
        return Collections.max(this.list);
    }

    public T getMin(){
        return Collections.min(this.list);
    }

    public void print(){
        for (T element : list) {
            System.out.println(element);
        }
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator();
    }
}
