import java.util.*;
//Find the sum of the following series 1-2+3-4+5
public class SumOfSeries {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();//n=5
        int ans=0;
        for (int i = 1; i <=n; i++) {
            if (i%2==0) {
               ans -=i;  
            }
            else{
                ans +=i;
            }
        }
        System.out.println(ans);
        sc.close();
        
    }
}
