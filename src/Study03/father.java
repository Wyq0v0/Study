package Study03;

public class father {
    private String secret;
    public static int age = getAge();
    public String name = getName();

    {
        System.out.println("非静态代码块被调用");
    }
    static{
        System.out.println("静态代码块被调用");
    }
    public father(){

    }

    private static int getAge(){
        System.out.println("静态年龄");
        return 40;
    }
    public void hello(){
        System.out.println("hello");
    }
    private String getName(){
        System.out.println("父亲");
        return "父亲";
    }
    public String toString(){
        return "哈哈";
    }

}
