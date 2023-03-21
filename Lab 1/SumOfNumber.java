import java.util.*;;
// Find the sum of digits in a given number n
public class SumOfNumber {
 public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();//143
        int add = 0;
        while(n>0) {
            int ans=n%10;
            n=n/10;
            add=add+ans;
        }
        sc.close();
        System.out.println("The sum of number is : "+add);
    }
}
