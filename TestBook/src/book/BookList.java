package book;

/**
 * 书架
 */
public class BookList {
    public Book[] books = new Book[10];//实例化是不需要继承的
    private int usedSize;//书的个数 封装

    /*
    用构造方法使其初始化时预先存储三本书
     */
    public BookList(){
        books[0]=new Book("三国演义","罗贯中",89,"小说");
        books[1]=new Book("红楼梦","曹雪芹",78,"小说");
        books[2]=new Book("西游记","吴承恩",49,"小说");
        this.usedSize=3;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public Book getPos(int pos) {//返回这本书
        return books[pos];
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

    public void setBooks(Book book, int pos){
        books[pos] = book;
    }


}
