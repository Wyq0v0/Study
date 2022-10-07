package Study11;

import java.util.HashSet;

public class EmployeeTest {
    public static void main(String[] args) {
        HashSet h1 = new HashSet();
        h1.add(new Employee("小王",23));
        h1.add(new Employee("小刘",24));
        h1.add(new Employee("小明",21));
        h1.add(new Employee("小明",21));
        for (Object obj : h1) {
            System.out.println(obj);
        }
    }
}
