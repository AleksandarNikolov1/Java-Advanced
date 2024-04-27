package L07_Generics.Lab.P04_List_Utilities;


import java.util.Collections;
import java.util.List;

public class ListUtils<T> {

    public static <T extends Comparable<T>> T getMin(List<T> list) {
        throwExceptionIfCollectionIsEmpty(list);
        return Collections.min(list);
    }

    public static <T extends Comparable<T>> T getMax(List<T> list) {
        throwExceptionIfCollectionIsEmpty(list);
        return Collections.max(list);
    }

    private static <T> void throwExceptionIfCollectionIsEmpty(List<T> list) {
        if (list.isEmpty())
            throw new IllegalArgumentException();
    }
}
