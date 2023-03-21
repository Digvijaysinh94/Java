import java.util.*;
// 1 2 1 2 1 2
// 2 1 2 1 2 1
// 1 2 1 2 1 2
// 2 1 2 1 2 1
public class PatternSeaven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for(int j =1;j<=n;j++){
                if (i%2 == 0) {
                    System.out.print("21");
                }
                else{
                    System.out.print("12");
                }
                
            }
            System.out.println();
        }
        sc.close();
    }
}
