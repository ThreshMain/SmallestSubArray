import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //0=K,1=W,2=D,3=A,4=I,5=B,6=D,7=W,8=C,9=D,10=W,11=S,12=D,13=B,14=F,15=A,16=C,17=E,18=S,19=D,20=B,21=C,22=D,23=E,24=S,25=A,26=D,27=B,28=X,var s=Arrays.asList("K W D A I B D W C D W S D B F A C E S D B C D E S A D B X".split(" "));
        var s=Arrays.asList("K W D A I B D W C D W S D B F A C E S D B C D E S A D B X".split(" "));
        var x="A B C".split(" ");
        var o=SmallestSubArray.findAll(s,x);
        System.out.println("G");
    }
}
