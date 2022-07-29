//RANDOM IN BUILT PACKAGE IN JAVA FOR THIS RANDOM GUESS NO. 
//OASIS INFOBYTE 2ND TASK NUMBER GUESSING GAME !
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Scanner;

public class Game2 {
  public static void main(String[] args) {
    Random Random_number= new Random();
    int right_guess=Random_number.nextInt(100);
    int turns=0;
    Scanner scan=new Scanner(System.in);
    System.out.println("WELCOME IN NUMBER GUESSING GAME ");
    System.out.println("Guess a number between 1 to 100, You will have 5 turns!" );
    System.out.println("BEST OF LUCK!");
    
    int guess;
    JOptionPane.showMessageDialog(null,"WELCOME IN NUMBER GUESSING GAME ");
    JOptionPane.showMessageDialog(null,"Guess a number between 1 to 100, You will have 5 turns!");
    JOptionPane.showMessageDialog(null,"BEST OF LUCK!");
   /*while(guess != right_guess)
   {
    String response=JOptionPane.showInputDialog(null,"Enter The Guess between 1 and 100","Guessing Game",3);
    guess=Integer.parseInt(response);
JOptionPane.showMessageDialog(null,""+guess+right_guess+turns);
   }*/
       
    int i=0;
    boolean win=false;
    while(win==false) {
      System.out.println("Enter a guess no. between 1 to 100 : ");
      guess=scan.nextInt();
      turns++;
    //CONDITION APPLY 
    if(guess==right_guess) {
      win=true;
    }
    else if(i>5){
      System.out.println("You loose! the right answer was: "+right_guess);
      return;
    }
    //USER PUT GREATER  NO.VALUE THAN RIGHTGUESS
    else if(guess<right_guess){
      i++;
      System.out.println("Yor Guess is lower than the right guess! Turns left: "+(5-i));
        }
        //USER PUT LESS NO.VALUE THAN RIGHTGUESS
    else if(guess>right_guess) {
      i++;
      System.out.println("Your Guess Is Higher Than THe Right Guess! Turns left: "+(5-i));
       }
  }
    System.out.println(" OOhhOO! YOu win!");
    System.out.println("Then number was "+right_guess);
    System.out.println("You used "+turns+" turns to guess the right number");
    System.out.println("Your score is "+((5-turns)*10)+" out of 100");
    
    JOptionPane.showMessageDialog(null, "You want to play next round  "); 
    //String choice =scan.next();
    //  if(choice == Y)
    
}
}


















/*import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class Game2 extends JPanel{*/
    
   /*private int guessCount;
    private JLabel JLabel1 = new JLabel1("Guessing Game ");
    private JLabel JLabel2 = new JLabel2("The Computer given no. between ");
    private JLabel JLabel3 = new JLabel3("1 and 100 and you will try to guess ");
    private JLabel JLabel4 = new JLabel4("If you do not get the number within 5 guesses ");
    private JLabel JLabel5 = new JLabel5("The Programm will show you the number and will ");
    private JLabel JLabel6 = new JLabel6("automatically shut down ");
    private JLabel JLabel7 = new JLabel7("Enter your guess"); */ 
   
    
//}
