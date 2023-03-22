import java.util.*;
// calc the max value in given array
// int []arr={1,5,3};max=5
public class MaxValueArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int []arr=new int[n];
        for (int i = 0; i <n; i++) {
            System.out.println("Enter the element");
            arr[i]=sc.nextInt();
        }
        int max=0;
        for (int i = 0; i < arr.length; i++) {
    
              if (arr[i]>max) {
                max=arr[i];
              }
             
        }
        System.out.println(max);
        sc.close();
    }
}
