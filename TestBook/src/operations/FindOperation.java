package operations;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class FindOperation implements IOPeration{
    @Override
    public void work(BookList bookList){
        System.out.println("查找图书");//查找图书
        System.out.println("请输入你要查找的图书名");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int currentSize = bookList.getUsedSize();//获取当前图书的个数
        for (int i = 0; i < currentSize; i++) {
            //比较
            Book book = bookList.getPos(i);
            if(name.equals(book.getName())){
                System.out.println("找到了！");
                System.out.println(book);
                return;
            }else {
                System.out.println("没有这本书");
            }
        }
    }
}
