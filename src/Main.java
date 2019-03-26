import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Size:");
        int n = sc.nextInt();
        System.out.println("Upper bound:");
        int high = sc.nextInt();
        System.out.println("Lower bound:");
        int low = sc.nextInt();
        Matrix.createMatrix(n, high, low);
    }
}
