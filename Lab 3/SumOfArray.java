import java.util.*;
// calc the sum of all the element in given array
// arr=[3,5,1]=target=9
class SumOfArray{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int []arr=new int[n];
        for (int i = 0; i <n; i++) {
            System.out.println("Enter the element");
            arr[i]=sc.nextInt();
        }
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            ans+=arr[i];
        }
        System.out.println(ans);
        sc.close();
    }
}