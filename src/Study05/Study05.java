package Study05;

public class Study05 {
    public static void main(String[] args) {
        Cellphone p1 = new Cellphone();
        p1.alarmclock(new Bell(){
            public void ring(){
                System.out.println("起床了");
            }
        });
    }
}
