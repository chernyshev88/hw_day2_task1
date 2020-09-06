import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hw_day2_task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] c = reader.readLine().toCharArray();
        System.out.println(c[c.length-1]);
    }
}
//Вввести с консоли целое число и вывести на экран последню цифру числа