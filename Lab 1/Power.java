import java.util.*;

//Given 2 numbers a and b Find a raise to the power b
public class Power {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();
        int b =sc.nextInt();
        int ans =(int) Math.pow(a, b);
        System.out.println(ans);

        sc.close();

    }
}
