package lesson27.generics;

public interface Set<TTT> {

	void add(TTT o);
	void remove(TTT o);
	boolean contains(TTT o);
	TTT next();
	int size();

}
