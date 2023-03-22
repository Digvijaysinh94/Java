import java.util.*;
// a connerancy of number in array
class FindArray{
    static void printarr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Size of Element: ");
        int n =sc.nextInt();
        System.out.println("Enter the number : ");
        int x =sc.nextInt();
        int count=0;
        int [] age=new int[n];
        for (int i = 0; i < age.length; i++) {
            System.out.println("Enter the element : ");
            
            age[i]=sc.nextInt();
        }
        for (int i = 0; i < age.length; i++) {
            if (x==age[i]) {
                count++;
            }
        }
        System.out.println(count);
        
        sc.close();
    }
}