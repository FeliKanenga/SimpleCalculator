import java.util.Arrays;
import java.util.Scanner;

public class Calculator {

    public static int add (int ... num){
        int sum = 0;

        sum = Arrays.stream(num).sum();

        System.out.println(sum);

        return sum;
    }
    public static int multiply (int ... num){
        int times = 1;

        for (int x: num){times *= x ;}

        System.out.println(times);

        return times;
    }

    public static void main(String[] args) {
        add(1,3);
        multiply(1,2);

    }

}
