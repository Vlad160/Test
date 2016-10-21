/**
 * Created by Vlad on 24.09.2016.
 */
import java.util.Scanner;
import java.math.BigDecimal;
public class main {
    public static void main(String args[ ]) {
        double result=0,exp,tempx,temp,sin;
        int x,n = 1,k;
        final double PI = 3.1415926535;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите точноdсть");
        k = in.nextInt();
        exp = Math.pow(10,-k);
        System.out.print("Введите x(в градусах)");
        x = in.nextInt();
        tempx = x*PI / 180;
        temp = tempx;
        while(Math.abs(temp)>exp) {
            result += temp;
            temp *= -1.0 * tempx * tempx / ((2 * n) * (2 * n + 1));
            n++;
        }
        sin = Math.sin(tempx);
        BigDecimal y = new BigDecimal(result);
        BigDecimal z = new BigDecimal(sin);
        System.out.println("Синус(Math.sin) " + y.setScale(k+1,BigDecimal.ROUND_DOWN));
        System.out.println("Синус(ряд Тейлора) " +z.setScale(k+1,BigDecimal.ROUND_DOWN));

    }
}