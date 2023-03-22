import java.util.*;
// sorted or not
public class Sorted {
    static void printarr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    } 
    // 5 6  7 8 1
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Size of Element: ");
        int n =sc.nextInt();
       
        int [] age=new int[n];
        for (int i = 0; i < age.length; i++) {
            System.out.println("Enter the element : ");
            age[i]=sc.nextInt();
        }
        int temp=0;
        for (int i = 0; i < age.length; i++) {
            for (int j = i+1; j < age.length; j++) {
                if (age[i]>age[j]) {
                    temp=age[i];
                    age[i]=age[j];
                    age[j]=temp;
                }
            }
        }
        printarr(age);
        sc.close();
    }
}
