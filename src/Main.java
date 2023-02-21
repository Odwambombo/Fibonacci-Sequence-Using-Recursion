import java.util.Scanner;

public class Main {

    //A array to store the data of each index of the fibonacci sequence
    public static int[] array;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type your Fibonacci Index number and press Enter: ");
        int data = scanner.nextInt();
        array = new int[data +1];
        System.out.println("Your Fibonacci number is "+ Fibonacci(data)+ " at index "+ data );
        System.out.println();
        System.out.println("The Fibonacci sequence from 0 to your index: ");
        for(int i=0; i < data+1; i++){
            System.out.print(Fibonacci(i)+" ");
        }
    }

    public static int Fibonacci(int data){

        if(data <= 1){
            return data;
        }
        if(array[data] != 0){
            return array[data];
        }
        int value = Fibonacci(data-1) + Fibonacci(data-2);
        array[data] = value;
        return value;
    }

}