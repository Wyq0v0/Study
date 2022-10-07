package Study11;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add("jack");
        col.add("Tom");
        col.add("Mike");
        Iterator I = col.iterator();
        while(I.hasNext()){
            Object obj = I.next();
            System.out.println(obj);
        }
        for (Object o : col) {
            System.out.println(o);
        }
        int[] i = {1,3,4,2,65,12,5,7,2};
        for(int i2 : i){
            System.out.println(i2);
        }
    }
}
