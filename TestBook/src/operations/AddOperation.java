package operations;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class AddOperation implements IOPeration{
    @Override
    public void work(BookList bookList){
        System.out.println("添加图书");//添加图书

        System.out.println("请输入你要添加的书的名字");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("请输入书的作者");
        String author = scanner.nextLine();

        System.out.println("请输入书的类型");
        String type = scanner.nextLine();

        System.out.println("请输入书的价格");
        int price = scanner.nextInt();




        Book book = new Book(name,author,price,type);
        //2.放入书架
        int currenSize = bookList.getUsedSize();//获取书的个数
        bookList.setBooks(book,currenSize);
        bookList.setUsedSize(currenSize+1);
        System.out.println("添加成功");
    }
}
