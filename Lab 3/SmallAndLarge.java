import java.util.Scanner;

public class SmallAndLarge {
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
        System.out.println("Sortest element is : "+age[0]);
        System.out.println("Largest element is : "+age[n-1]);

        sc.close();
    }
}
