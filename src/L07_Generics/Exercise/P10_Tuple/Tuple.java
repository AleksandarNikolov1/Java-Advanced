package L07_Generics.Exercise.P10_Tuple;

public class Tuple<K, V> {

    private K key;
    private V value;

    public Tuple(){
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.key + " -> " + this.value;
    }
}
