package L08_Iterators_and_Comparators.Exercise.P04_Foggy;

import java.util.Iterator;

public class Lake implements Iterable<Integer> {

    private int[] integers;
    private int index = 0;

    public Lake(int[] integers) {
        this.integers = integers;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Frog();
    }

    private class Frog implements Iterator<Integer> {

        @Override
        public boolean hasNext() {
            return index < integers.length;
        }

        @Override
        public Integer next() {

            int element = integers[index];

            if (integers.length % 2 == 0 && index == integers.length - 2) {
                element = integers[index];
                index = 1;
            }

            else if (integers.length % 2 == 1 && index == integers.length - 1) {
                element = integers[index];
                index = 1;
            }

            else {
                index += 2;
            }

            return element;
        }

    }
}
