package L08_Iterators_and_Comparators.Exercise.P01_ListyIterator;

import java.util.List;

public class ListyIterator {
    private int index;
    private List<String> list;

    public ListyIterator(List<String> list) {
        this.list = list;
        this.index = 0;
    }

    public boolean hasNext() {
        return this.index + 1 < list.size();
    }

    public boolean move() {
        index++;
        return this.index < list.size();
    }

    public void print() {
        try {
            System.out.println(list.get(index));
        }

        catch (Exception e){
            System.out.println("Invalid Operation!");
        }
    }

}
