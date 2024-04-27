package L07_Generics.Exercise.P08_Custom_List_Sorter;

import java.util.Collections;

public class Sorter {

    public static<T extends Comparable<T>> void sort(CustomList<T> customList){
        Collections.sort(customList.getList());
    }
}
