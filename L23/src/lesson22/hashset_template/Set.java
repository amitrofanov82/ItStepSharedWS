package lesson22.hashset_template;

 
public interface Set {

    void add(Object o);
    void remove(Object o);
    boolean contains(Object o);
    Object next();
    int size();

}
