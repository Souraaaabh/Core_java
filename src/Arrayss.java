import java.util.Scanner;

public class Arrayss {

    public void SearchInArray() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];

        System.out.println("PLease enter the number which needs to be checked");
        int targert = sc.nextInt();

        System.out.println("Please enter the List");

        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            if (nums[i] == targert) {
                System.out.println("Present at : " + i);
            }else {
                System.out.println("Not present in the List");

            }
        }
    }

    public void TwoDArray(){
        Scanner sc = new Scanner(System.in);
        int rows  = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    public void SearchInTwoDArray(){
        Scanner sc = new Scanner(System.in);
        int rows  = sc.nextInt();
        int cols = sc.nextInt();
        System.out.print("Please enter element which needs to be searched : ");
        int target = sc.nextInt();
        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(target == arr[i][j]){
                    System.out.print("Number is  present at index : "+ "("+ i+","+j+")");
}
//                }else{
//                    System.out.println("Not present");
//                }


            }
        }
    }
}