package user;

import operations.*;

import java.util.Scanner;

/**
 * 这里是普通用户的类
 */
public class NormalUser extends User{
    public NormalUser(String name){
        super(name);
        this.ioPerations = new IOPeration[] {
            new ExitOperation(),
            new FindOperation(),
            new BorrowOperation(),
            new ReturnOperation(),
        };//给数组分配
    }

    @Override
    public int menu(){
        System.out.println("***********************************");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("0.退出系统");
        System.out.println("***********************************");
        System.out.println("请输入你的操作");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
