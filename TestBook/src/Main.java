import book.BookList;
import user.AdminUser;
import user.NormalUser;
import user.User;

import java.util.Scanner;

public class Main {

    public static User login(){
        System.out.println("输入你的姓名：");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("请输入你的身份：1-》管理员,0-》普通用户");
        int choice = scanner.nextInt();
        if(choice == 1){
            return new AdminUser(userName);
        }else {
            return new NormalUser(userName);
        }
    }

    public static void main(String[] args) {
        //0.准备数据
        BookList bookList = new BookList();//实例化书架
        User user = login();//这里发生了向上转型
        while (true){
            int choice = user.menu();//多态：根据返回的类型来确定权限组
            user.doOperation(choice,bookList);//操作接口数组的方法
        }

    }
}
