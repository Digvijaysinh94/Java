import java.util.*;
// Count the number of element strictly greaterthen value x

public class Find {
  
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Size of Element: ");
        int n =sc.nextInt();
        System.out.println("Enter the number : ");
        int x =sc.nextInt();
        int [] age=new int[n];
        int count=0;
        for (int i = 0; i < age.length; i++) {
            System.out.println("Enter the element : ");
            age[i]=sc.nextInt();
        }
        for (int i = 0; i < age.length; i++) {
            if (x<age[i]) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();

    }
}
