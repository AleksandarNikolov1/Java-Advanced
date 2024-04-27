package L08_Iterators_and_Comparators.Exercise.P06_Strategy_Pattern;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person f, Person s) {
        int result =Integer.compare(f.getName().length(), s.getName().length());
        return result != 0 ? result : String.valueOf(f.getName().charAt(0))
                .compareTo(String.valueOf(s.getName().charAt(0)));
    }
}
