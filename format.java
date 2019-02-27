import java.util.Scanner;

public class GuessRoot {static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("In this program you need to guess the square root of a number (to 1 decimal place)\n");
        while (true) {
            int random = (int)(Math.random()*100) + 1; 
            double root = Math.sqrt(random);
            System.out.println("Guess the root of " + random);
            double answer = getDouble();
            if(Math.abs(root-answer) < 0.1) {
                 System.out.println("Well done!"); System.exit(0);
            } else { 
                double correct = root*10; correct += 0.5; 
                correct = (int)correct; correct /=10.0;
            System.out.println("Sorry, the answer was " + correct + "\n Try again with a different number.");
            }
        }
    }
    /* 
     This sub program prevents the program from crashing if you type in a word instead of an int or double 
     */ 
     static double getDouble() {	
         while(true) { 
            if (scanner.hasNextDouble()) { 
                 return scanner.nextDouble(); 
            } else {	
                scanner.next();
                System.out.println("Please type in a number!"); 
            }
        }
    }
}
