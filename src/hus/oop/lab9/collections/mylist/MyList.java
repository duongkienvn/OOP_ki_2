package hus.oop.lab9.collections.mylist;

import java.util.Objects;

public interface MyList {
    void add(Object o);
    void add(Object o, int index);
    void remove(int index);
    Object get(int index);
    int size();
}
