package Study09;

import com.sun.deploy.util.StringUtils;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Wrapper01 {
    public static void main(String[] args) {
        final String s = "你好";
        Integer I1 = 1;
        int i1 = I1;
        String s1 = new String("1");
        String s2 = "nihao";
        int[] i = {1,2,3};
        String s3 = null;
        StringBuffer sb = new StringBuffer("10");
        sb.append(s3);
        System.out.println(sb);
    }
}
