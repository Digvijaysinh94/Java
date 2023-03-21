import java.util.*;;
//Reverse the digits of a number
public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();//143
        while (n>0) {
            int ans=n%10;
            n=n/10;
            System.out.print(ans);
        }
        sc.close();
    }
}
