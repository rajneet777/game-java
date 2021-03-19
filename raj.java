//Name: Rajneet kaur
//Student ID:201905916
//Date Submitted:03/20/2021
//Class IN2203 Section Number G1
//Name of work: Assignment 1: The gambling Game
import java.util.*;
public class MainApplicaton {
    public static void main(String[] args){
    Casino c= new Casino();
    c.OrganizeNewGame();
    }
}
class Casino{
    Player p1= new Player();
    Game g1= new Game();
    String userAnswer;
        Scanner s= new Scanner(System.in);
        public void OrganizeNewGame(){
            p1.welcomePlayer();
            System.out.println("Welcome to the Casino: Would you like to play a game? (y/n)");
        userAnswer= s.nextLine();
        if(userAnswer.equals("y")){
            System.out.println("Let's get started");
                    g1.PlayGame();
                    p1.winnerOfGame();
}
else
{System.out.println("Good bye");}
}
}
class Game{
    Random r= new Random();
    int ComputerGuess= r.nextInt(100) ;
    
    public void PlayGame(){
        
        System.out.println("I'll guess a game ");
        System.out.println("If your guess is within 20 of my guess: then you win . Else i will win  ");
        ComputerGuess= ComputerGuess();
    }
     public int ComputerGuess(){
      int programGuess;
       programGuess = r.nextInt(100);
      return programGuess;
     }
}
class Player extends Game{
    String Playername;
    int Playerage;
    Scanner inp= new Scanner(System.in);
    Game obj2= new Game();
    public void welcomePlayer()
    {
         System.out.println("Insert Player Name");
        Playername= inp.nextLine();
        System.out.println("Insert Player Age");
        Playerage= inp.nextInt();
       
    }
    
    public void winnerOfGame()
    {
        int numOftry= 5;
        int numberToguess;
        
        for(int i=1; i<= numOftry;i++)
        {
            System.out.println("please guess a number between 1 to 100");
            numberToguess= inp.nextInt();
            
            if(Math.abs(numberToguess - obj2.ComputerGuess)< 20 )
            {System.out.println("Cngratulations , Player wins");
                System.out.println(numberToguess+ " is within 20 of " + obj2.ComputerGuess );
            break;}
            
            else 
            {
                System.out.println("OOPS! , Computer wins ! " + numberToguess + " is not within 20 of Computer's guess");
                System.out.println("Try again");
            }
            if(i==numOftry)
            {
                System.out.println("Your number of trials has been expired");
                System.out.println("The number is"+ ComputerGuess);
            }
            
        }
        
        
    }
    
}
        

