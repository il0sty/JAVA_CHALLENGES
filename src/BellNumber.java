import java.util.ArrayList;
import java.util.Scanner;

public class BellNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = input.nextInt();
        System.out.println("The current bell number is " + bell(number));
    }
    public static int bell(int n){
        int[][]bellMatriz = new int[n][n];
        bellMatriz[0][0] = 1;
        for (int i = 1; i<n;i++){
            for (int j=0; j<=i; j++){
                if(j==0){
                    bellMatriz[j][i] = bellMatriz[i-1][i-1];
                } else bellMatriz[j][i] = bellMatriz[j-1][i-1] + bellMatriz[j-1][i];
            }
        }
        return bellMatriz[n-1][n-1];
    }
}
