import java.util.*;

// * * * * *
// *       *
// * * * * *

public class PaternTwo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for(int j =1;j<=5;j++){
                // System.out.print("*");
                if (i%2==0) {
                    if (j==2 || j==3 || j==4) {
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                } else {
                    System.out.print("*");
                }

            }
            System.out.println("");
        }
        sc.close();
    }
}
