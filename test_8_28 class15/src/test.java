import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

class Student{
    public String name;
    public int age;

    public Student(String name,int age){
        this.age=age;
        this.name=name;
    }
}

class NameComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.age-o2.age;
    }
}


public class test {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("zhangsan",18);
        students[1] = new Student("lisi",25);
        students[2] = new Student("wangwu",17);
        NameComparator nameComparator = new NameComparator();
        Arrays.sort(students,nameComparator);

        System.out.println(Arrays.toString(students));
    }
}
