import java.util.*;
// Count the number of digit for a given number n
class Count_Number{

public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    long n =sc.nextLong();//12345
    int count=0;
    while (n>0) {
        n=n/10;
        count=count+1;
    }
    System.out.println(count);
    sc.close();
    }
}