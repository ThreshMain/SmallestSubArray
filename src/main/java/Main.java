import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> s=Arrays.asList("KWDAIBDWCDWSDBFACESDBCDESADBX".split(""));
        String[] x="ABC".split("");
        List<SmallestSubArray.Range> o=SmallestSubArray.findAll(s,x);
        for(SmallestSubArray.Range r:o){
            System.out.println("Array = " + s.subList(r.getStart(),r.getEnd()));
        }

    }
}
