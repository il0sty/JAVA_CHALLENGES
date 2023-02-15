import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class SevenBoom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type the size of the array: ");
        int size = input.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i<size; i++){
            System.out.print("Write the "+(i+1)+"º number: ");
            int number = input.nextInt();
            numbers.add(i, number);
        }
        System.out.println(resolve(numbers) ? "Boom!" : "there is no 7 in the array");
    }

    public static boolean resolve(ArrayList<Integer> numbers){
        boolean check = false;
        for (Integer number : numbers) {
            boolean stop = false;
            String[] writeNumber = number.toString().split("");
            for (String numbersString : writeNumber) {
                if (Objects.equals(numbersString, "7")) {
                    check = true;
                    stop = true;
                    break;
                }
            }
            if (stop) {
                break;
            }
        }
        return check;
    }
}

//Create a function that takes an array of numbers and return "Boom!" if the digit 7 appears in the array.
//Otherwise, return "there is no 7 in the array".