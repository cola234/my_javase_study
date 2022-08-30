package operations;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class DelOperation implements IOPeration {
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书");
        System.out.println("请输入你要删除的图书");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int currenSize = bookList.getUsedSize();
        int index = -1;
        for (int i = 0; i < currenSize; i++) {
            Book book = bookList.getPos(i);
            if (name.equals(book.getName())) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("没找到这本书！");
            return;
        }
        //找到书之后要从后往前覆盖
        for (int i = 0; i < currenSize - 1; i++) {
            Book book = bookList.getPos(i + 1);
            bookList.setBooks(book, i);
        }
        bookList.setBooks(null, currenSize - 1);
        bookList.setUsedSize(currenSize - 1);
        System.out.println("删除成功");
    }
}
