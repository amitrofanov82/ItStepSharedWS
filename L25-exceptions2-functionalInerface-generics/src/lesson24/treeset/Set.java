package lesson24.treeset;

 
public interface Set {

    void add(Object o);
    void remove(Object o);
    boolean contains(Object o);
    Object next();
    int size();

}
