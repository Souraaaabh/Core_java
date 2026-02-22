import java.util.Scanner;

public class Patterns {

    public void RectPattern(){
        Scanner sc = new Scanner(System.in);
        int rep = sc.nextInt();

        for (int i = 1; i <=rep ; i++) {
//            System.out.print("*");
            for (int j = 1; j <=rep ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public void HollowPattern(){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n=m-1;

        for (int i = 1; i <=n ; i++) {
//            System.out.print("*");
            for (int j = 1; j <=m ; j++) {
                if (i==1|| j==1 || i ==n  || j==m){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public void HalfPyramid(){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n=m-1;
//        for (int i = 1; i <=m ; i++)bl
        for (int i = m; i >=1 ; i--) {   //to invert the halfpyramid
//            System.out.print("*");
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }
}
