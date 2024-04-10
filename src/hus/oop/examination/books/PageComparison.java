package hus.oop.examination.books;

public class PageComparison implements BookComparator {
    public int compare(Book left, Book right) {
        return left.getPages() - right.getPages();
    }
}
