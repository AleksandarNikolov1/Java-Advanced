package L07_Generics.Exercise.P07_Custom_List;

import java.util.*;

public class CustomList<T extends Comparable<T>> {

    private List<T> list;

    public CustomList(){
        this.list = new ArrayList<>();
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

}
