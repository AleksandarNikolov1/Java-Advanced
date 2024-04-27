package L07_Generics.Lab.P02_Generic_Array_Creator;

import java.lang.reflect.Array;
import java.util.Arrays;


public class ArrayCreator<T> {

    @SuppressWarnings("unchecked")
    public static <T> T[] create (int length, T item){

        T[] array = (T[]) Array.newInstance(item.getClass(), length);
        Arrays.fill(array, item);

        return array;
    }

    @SuppressWarnings("unchecked")
    public static <T> T[] create (Class<T> cl, int length, T item){
        T[] array = (T[]) Array.newInstance(cl, length);
        Arrays.fill(array, item);

        return array;
    }
}