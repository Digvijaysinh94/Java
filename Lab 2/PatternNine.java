import java.util.*;
//       1
//     1 2 1
//   1 2 3 2 1
// 1 2 3 4 3 2 1

public class PatternNine{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for(int k =1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){
                System.out.print(j);
            }
            for(int d= i-1;d>=1;d--){
                System.out.print(d);
            }
        
            System.out.println();
        }
        sc.close();
    }
}
