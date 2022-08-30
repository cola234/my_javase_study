package operations;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class BorrowOperation implements IOPeration{
    @Override
    public void work(BookList bookList) {
        System.out.println("借图书");
        System.out.println("请输入你要借阅的图书");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int currenSize = bookList.getUsedSize();
        for (int i = 0; i < currenSize; i++) {
            Book book = bookList.getPos(i);
            if (name.equals(book.getName())) {
                book.setBorrowed(true);
                System.out.println("借阅成功！");
                return;
            }
        }
        System.out.println("找不到这本书！");
    }
}
