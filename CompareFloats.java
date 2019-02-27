import java.util.Scanner;

public class CompareFloats{
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        System.out.println("What is 1586.6 - 708.5?");
        double guess  = stdin.nextDouble();
        double answer =  1586.6 - 708.5;

        if(Math.abs(guess - answer) < 0.000001){
            System.out.println("Correct");
        }else{
            System.out.println("Wrong");
        }

        answer = Math.sin(Math.toRadians(30));
        System.out.println(answer);
    }
}
