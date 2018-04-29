
import org.junit.Test;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaTest {

    @Test
    public void test(){
        List arrayList = Arrays.asList("rear","aaa","ssaa","ggaa");
        Predicate<String> predicate = (String s)-> s.length()>0;

        //Comparator<String> comparable =(String a,String b)-> a.compareToIgnoreCase(b);
        Comparator<String> comparable = String::compareToIgnoreCase;
        Collections.sort(arrayList,comparable);
        System.out.printf(arrayList.toString());
        int weight = 10;
        Function<Integer,String> function = (Integer weightw)-> new String("sss");
    }
}
