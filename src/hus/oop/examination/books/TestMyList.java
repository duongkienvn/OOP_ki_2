package hus.oop.examination.books;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestMyList {
    public static void main(String[] args) {
        /*
         TODO

         - Chạy demo các hàm test.
         - Lưu kết quả chạy chương trình vào file text có tên <Ten_MaSinhVien_MyList>.txt
           (ví dụ, NguyenVanA_123456_MyList.txt)
         - Nộp kết quả chạy chương trình (file text trên) cùng với các file source code.
         */

        saveToFile("C:\\Users\\Dell\\eclipse-workspace\\OOP_ki_2\\" +
                "src\\hus\\oop\\examination\\books\\DuongCongKien_23001895_MyList.txt");
    }

    public static void testMyArrayList(PrintWriter writer) {
        /*
         TODO

         - Tạo ra một list kiểu MyArrayList có ít nhất 10 Book.

         - Sử dụng BookManager để
             + Sắp xếp và in ra danh sách các Book theo thứ tự tăng dần theo title.
             + Sắp xếp và in ra danh sách các Book theo thứ tự giảm dần theo title.
             + Sắp xếp và in ra danh sách các Book theo thứ tự tăng dần theo số trang.
             + Sắp xếp và in ra danh sách các Book theo thứ tự giảm dần theo số trang.
         */

        MyList myArrayList = createMyArrayList();

        BookManager bookManager = new BookManager(myArrayList);
        MyList increasingByTitle = bookManager.sortByTitle(true);
        MyList decreasingByTitle = bookManager.sortByTitle(false);
        MyList increasingByPage = bookManager.sortByPageNumber(true);
        MyList decreasingByPage = bookManager.sortByPageNumber(false);

        writer.println("Sorting by title ascending:");
        writer.println(increasingByTitle.toString());
        writer.println("Sorting by title descending:");
        writer.println(decreasingByTitle.toString());
        writer.println("Sorting by page number ascending:");
        writer.println(increasingByPage.toString());
        writer.println("Sorting by page number descending:");
        writer.println(decreasingByPage.toString());
    }

    public static void testMyLinkedList(PrintWriter writer) {
        /*
         TODO

         - Tạo ra một list kiểu MyLinkedList có ít nhất 10 Book.

         - Sử dụng BookManager để
             + Sắp xếp và in ra danh sách các Book theo thứ tự tăng dần theo tên sách.
             + Sắp xếp và in ra danh sách các Book theo thứ tự giảm dần theo tên sách.
             + Sắp xếp và in ra danh sách các Book theo thứ tự tăng dần theo số trang.
             + Sắp xếp và in ra danh sách các Book theo thứ tự giảm dần theo số trang.
         */

        MyList myLinkedList = createMyLinkedList();

        BookManager bookManager = new BookManager(myLinkedList);
        MyList increasingByTitle = bookManager.sortByTitle(true);
        MyList decreasingByTitle = bookManager.sortByTitle(false);
        MyList increasingByPage = bookManager.sortByPageNumber(true);
        MyList decreasingByPage = bookManager.sortByPageNumber(false);

        writer.println("Sorting by title ascending:");
        writer.println(increasingByTitle.toString());
        writer.println("Sorting by title descending:");
        writer.println(decreasingByTitle.toString());
        writer.println("Sorting by page number ascending:");
        writer.println(increasingByPage.toString());
        writer.println("Sorting by page number descending:");
        writer.println(decreasingByPage.toString());
    }

    public static void testIterator(MyList myList) {
        /*
         TODO
         Sử dụng iterator duyệt qua tất cả các phần tử trong danh sách myList và in ra thông tin về phần tử đó.
         */

        MyIterator iterator = myList.iterator();
        while (iterator.hasNext()) {
            Object element = iterator.next();
            if (element instanceof Book) {
                Book book = (Book) element;
                System.out.println(book.toString());
            }
        }
    }

    public static MyList createMyArrayList() {
        MyList myArrayList = new MyArrayList();
        myArrayList.append(new Book("Book 1", 2000, 200));
        myArrayList.append(new Book("Book 2", 2005, 300));
        myArrayList.append(new Book("Book 3", 2001, 400));
        myArrayList.append(new Book("Book 4", 2006, 100));
        myArrayList.append(new Book("Book 5", 2009, 250));
        myArrayList.append(new Book("Book 6", 2003, 290));
        myArrayList.append(new Book("Book 7", 2011, 240));
        myArrayList.append(new Book("Book 8", 2015, 500));
        myArrayList.append(new Book("Book 9", 2014, 450));
        myArrayList.append(new Book("Book 10", 2007, 700));

        return myArrayList;
    }

    public static MyList createMyLinkedList() {
        MyList myLinkedList = new MyLinkedList();
        myLinkedList.append(new Book("Book 1", 2000, 200));
        myLinkedList.append(new Book("Book 2", 2005, 300));
        myLinkedList.append(new Book("Book 3", 2001, 400));
        myLinkedList.append(new Book("Book 4", 2006, 100));
        myLinkedList.append(new Book("Book 5", 2009, 250));
        myLinkedList.append(new Book("Book 6", 2003, 290));
        myLinkedList.append(new Book("Book 7", 2011, 240));
        myLinkedList.append(new Book("Book 8", 2015, 500));
        myLinkedList.append(new Book("Book 9", 2014, 450));
        myLinkedList.append(new Book("Book 10", 2007, 700));

        return myLinkedList;
    }

    public static void saveToFile(String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            writer.write("Results of testing MyArrayList:\n");
            testMyArrayList(writer);
            writer.write("Results of testing MyLinkedList:\n");
            testMyLinkedList(writer);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
