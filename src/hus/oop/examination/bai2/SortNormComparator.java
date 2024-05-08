package hus.oop.examination.bai2;

import java.util.Comparator;

public class SortNormComparator implements Comparator<MyVector> {
    @Override
    public int compare(MyVector v1, MyVector v2) {
        return (int) (v1.norm() - v2.norm());
    }
}
