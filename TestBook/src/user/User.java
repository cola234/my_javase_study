package user;

import book.BookList;
import operations.IOPeration;

/**
 * 这个类相当于一个抽象类
 */
public abstract class User{
    protected String name;
    protected IOPeration[] ioPerations;//存放接口的数组 这个数组用于存放具体操作

    public User(String name){
        this.name=name;
    }

    public void doOperation(int choice, BookList bookList){//操作接口数组的方法
        ioPerations[choice].work(bookList);
    }

    public abstract int menu();
}