package Study01;

public class person01 {
    public static void main(String[] args) {
        person p1 = new person("小明",18);
        person p2 = new person();
    }
}

class person{
    String name;
    int age;
    public person(){
        name = "无";
        age = 0;
    }
    public person(String pName,int pAge){
        name = pName;
        age = pAge;
    }
}