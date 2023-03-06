import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        try {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please type your Fibonacci Index number and press Enter: ");

            int fibonacciIndex = scanner.nextInt();
            System.out.println("Your Fibonacci number is " + fibonacci(fibonacciIndex) + " at index " + fibonacciIndex);
            System.out.println("The Fibonacci sequence from 0 to index: " + fibonacciIndex);
            System.out.println(fibonacciList(fibonacciIndex));

        }catch (InputMismatchException e){
           System.out.println("Please enter a integer value only which is your Fibonacci Index");
        }
    }

    public static String fibonacciList(int data){
        StringBuilder fibonacciList = new StringBuilder();
        for(int i=0; i < data+1; i++){

            fibonacciList.append(fibonacci(i)).append(" ");

        }
        return fibonacciList.toString();
    }
    public static int fibonacci(int data){

        if(data < 0){
            throw new IllegalStateException("Please enter a positive number there is no negative number in fibonacci Sequence!");
        }
        if(data <= 1){
            return data;
        }
        return  fibonacci(data-1) + fibonacci(data-2);
    }

}