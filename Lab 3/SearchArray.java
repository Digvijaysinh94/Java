import java.util.*;
// Search  the element in given array if present return index else return -1
// int arr[]={1,5,3} x=5 output 1
public class SearchArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
      int ans=  search(n);
      if (ans==-1) {
        System.out.println("Element not Found");
      } else {
        System.out.println("Element is found at index: "+ans);
      }
       sc.close();
    }
    static int search(int n){
        Scanner sc =new Scanner(System.in);
        int []arr=new int[n];
        for (int i = 0; i <n; i++) {
            System.out.println("Enter the element");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value to find : ");
        int x= sc.nextInt();
        sc.close();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x) {
                return i;
            } 
        }
        
        return -1;

    }
}
