package Study07;

import java.time.MonthDay;

public class EnumTest {
    public static void main(String[] args) {
        for(Week w : Week.values()){
            System.out.println(w);
        }
    }
}
