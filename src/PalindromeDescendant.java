
import java.util.Scanner;

public class PalindromeDescendant {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type a number: ");
        int num = input.nextInt();
        System.out.print(palindromeDescendant(num)? "True" : "False");
    }

    public static boolean palindromeDescendant(int num) {
        String[] numbers = Integer.toString(num).split("");
        boolean palindrome = numbers.length != 1;
        for(int i = 0; i<numbers.length/2;i++){
            if(Integer.parseInt(numbers[i])!=Integer.parseInt(numbers[numbers.length-i-1])){
                palindrome = false;
            }
        }
        if(!palindrome && numbers.length%2==0){
            return palindromeDescendant(descendant(numbers));
        } else return palindrome;

    }
    public static int descendant(String[] numbers){
        String newNumber = "";
        int n = 0;
        for(int i = 0; i<numbers.length;i++){
            if(i%2==0){
                n = Integer.parseInt(numbers[i]);
            } else {
                n += Integer.parseInt(numbers[i]);
                newNumber += Integer.toString(n);
            }
        }
        System.out.println(newNumber);
        return Integer.parseInt(newNumber);
    }

}
