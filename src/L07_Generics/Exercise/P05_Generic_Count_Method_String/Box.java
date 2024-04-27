package L07_Generics.Exercise.P05_Generic_Count_Method_String;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable<T>> {
    private List<T> list;

    public Box(){
        this.list = new ArrayList<>();
    }

    public void addElement(T element){
        this.list.add(element);
    }

    public void swapElements(int firstIndex, int secondIndex){
        T temp = list.get(firstIndex);
        list.set(firstIndex, list.get(secondIndex));
        list.set(secondIndex, temp);
    }

    public int getGreaterElementsCount(T elementToCompare){
        return (int) list.stream().filter(e -> e.compareTo(elementToCompare) > 0).count();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T t : list) {
            sb.append(String.format("%s: %s%n", t.getClass().getName(), t));
        }

        return sb.toString();
    }
}
