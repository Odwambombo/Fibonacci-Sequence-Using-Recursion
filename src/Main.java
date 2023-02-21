import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type your Fibonacci Index number and press Enter: ");
        int data = scanner.nextInt();
        System.out.println("Your Fibonacci number is "+ Fibonacci(data)+ " at index "+ data );
    }
    public static int Fibonacci(int data){
        int array[]=new int[data];
        if(data <= 1){
            return data;
        }

        array[0]= 0; array[1]=1;
        array[data-1] = Fibonacci(data-1) + Fibonacci(data-2);
        return array[data-1];
    }

}