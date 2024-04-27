package L08_Iterators_and_Comparators.Exercise.P06_Strategy_Pattern;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person f, Person s) {
        return Integer.compare(f.getAge(), s.getAge());
    }
}
