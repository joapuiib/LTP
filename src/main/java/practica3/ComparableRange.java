package practica3;

public interface ComparableRange<T> extends Comparable<T> {
    int compareToRange(T o);
}
