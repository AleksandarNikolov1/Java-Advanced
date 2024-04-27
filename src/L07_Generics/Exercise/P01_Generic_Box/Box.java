package L07_Generics.Exercise.P01_Generic_Box;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private List<T> list;

    public Box(){
        this.list = new ArrayList<>();
    }

    public void addElement(T element){
        this.list.add(element);
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
