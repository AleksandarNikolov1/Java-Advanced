package L08_Iterators_and_Comparators.Exercise.P02_Collection;

import java.util.Iterator;
import java.util.List;

public class ListyIterator implements Iterable<String> {
    private int index;
    private List<String> list;

    public ListyIterator(List<String> list) {
        this.list = list;
        this.index = 0;
    }

//    public boolean hasNext() {
//        return this.index + 1 < list.size();
//    }
//
//    public boolean move() {
//        index++;
//        return this.index < list.size();
//    }

    public void print() {
        try {
            System.out.println(list.get(index));
        }

        catch (Exception e){
            System.out.println("Invalid Operation!");
        }
    }


    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            @Override
            public boolean hasNext() {
                return index < list.size();
            }

            @Override
            public String next() {
                return list.get(index++);
            }
        };
    }

    public void printAll(){
        for (String string : list) {
            System.out.print(string + " ");
        }

        System.out.println();
    }
}
