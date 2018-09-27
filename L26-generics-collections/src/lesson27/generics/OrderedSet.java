package lesson27.generics;

public interface OrderedSet<T> extends Set<T> {
	T getFirst();
	T getLast();
	T prev();
}
