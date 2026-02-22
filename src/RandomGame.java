import java.util.Scanner;

public class RandomGame {


    public int RandomNumber(){
        return (int)(Math.random() *100);

    }

    public void Game(){

        Scanner sc = new Scanner(System.in);
        int guess;
        int counter = 0;
        int target = RandomNumber();
        System.out.println(target);
        System.out.println("If you want to exit the game please enter -1");


do {

    System.out.println("Enter a number: ");

    guess = sc.nextInt();
    if (guess==target){
        counter++;
        System.out.println("Yes you guessed it right");
        System.out.println("You guessed in "+counter+" tries");

        break;
    }
    else if (guess>target){
        System.out.println("Try with smaller number");
        counter++;

    }
    else{
        System.out.println("Try with Greater number");
        counter++;
    }
}
        while (guess>=0);
}
}
