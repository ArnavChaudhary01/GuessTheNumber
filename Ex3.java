import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;
    public int getNoOfGuesses(){
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses = noOfGuesses;
    }

    Game(){
        Random r = new Random();
        this.number = r.nextInt(100);
    }

    void takeUserInput(){
        System.out.print("Guess The Number : ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    boolean isCorrectNumber(){
        noOfGuesses++;
        if(inputNumber == number){
            System.out.println("You guessed it right, it was " + number);
            System.out.println("You guessed it in " + noOfGuesses + " attempts");
            return true;
        }
        else if(inputNumber < number){
            System.out.println("Guess Higher...");
        }
        else if(inputNumber > number){
            System.out.println("Guess Lower...");
        }
        return false;
    }
}
public class Ex3 {
    public static void main(String[] args) {
        Game  g = new Game();
        boolean b = false;
        while(!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}
