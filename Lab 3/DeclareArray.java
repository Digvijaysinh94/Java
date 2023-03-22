import java.util.*;

class DeclareArray{

    static void detail(int n ,int y){
        Scanner sc =new Scanner(System.in);

        int [][] name=new int[n][y];
        for (int i = 0; i < n; i++) {
            for(int j =0;j<y;j++){
            System.out.println("Enter the elemnt");
            name[i][j]=sc.nextInt();

            }
        }
        for (int i = 0; i < name.length; i++) {
            for(int j=0;j< name.length;j++){
                System.out.println(name[i][j]);

            }
            
        }
sc.close();
    }




    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the elemnt Size");

        int n =sc.nextInt();
        int y =sc.nextInt();
        // String [][] name ={{"Af","dg"},{"sfd","ew"}};
        // System.out.println(name[0][0]);

        detail(n,y);
        sc.close();
    }
}