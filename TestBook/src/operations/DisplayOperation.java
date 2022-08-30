package operations;

import book.Book;
import book.BookList;

public class DisplayOperation implements IOPeration{
    @Override
    public void work(BookList bookList) {
        System.out.println("显示图书");
        int currenSize = bookList.getUsedSize();
        for (int i = 0; i < currenSize; i++) {
            Book book = bookList.getPos(i);
            System.out.println(book);
        }
    }
}
