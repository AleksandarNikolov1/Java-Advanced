package L07_Generics.Lab.P03_Generic_Scale;

public class Scale<T extends Comparable<T>> {

    private T left;
    private T right;

    public Scale(T left, T right){
        this.left = left;
        this.right = right;
    }

    public T getHeavier(){
        if (left.compareTo(right) > 0)
            return left;

        else if (left.compareTo(right) < 0)
            return right;

        else
            return null;
    }
}
