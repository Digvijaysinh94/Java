import java.util.*;
// Find Last occurance of number x

public class FindLastArray {
  
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Size of Element: ");
        int n =sc.nextInt();
        System.out.println("Enter the number : ");
        int x =sc.nextInt();
        int [] age=new int[n];
        int [] agee=new int[n];

        for (int i = 0; i < age.length; i++) {
            System.out.println("Enter the element : ");
            age[i]=sc.nextInt();
        }
       
        for (int i = 0; i < age.length; i++) {
            if (x==age[i]) {
                agee[i]=i;
            }
        }
            System.out.println(agee.length-1);
        
        sc.close();
    }
}
