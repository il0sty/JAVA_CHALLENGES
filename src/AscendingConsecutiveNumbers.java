import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AscendingConsecutiveNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type a number: ");
        String str = input.nextLine();
        System.out.println(ascending(str) ? "True" : "False");
    }
    public static boolean ascending(String str) {
        boolean asc = false;
        ArrayList<String> numbersWrited = new ArrayList<>(Arrays.asList(str.split("")));
        for(int i = 1;i<numbersWrited.size();i++){
            ArrayList<Integer> toNumbers = new ArrayList<>();
            int j = 0;
            while (j<numbersWrited.size() && numbersWrited.size()%i==0){
                String toWrite = "";
                for (int k = 0; k<i;k++){
                    toWrite += numbersWrited.get(j+k);
                }
                toNumbers.add(Integer.parseInt(toWrite));
                j+=i;
            }
            if(ver(toNumbers) && toNumbers.size()>1){
                asc = true;
                break;
            }
        }
        return asc;
    }

    public static boolean ver (ArrayList<Integer>elements){
        boolean ver = true;
        for(int i = 0; i<elements.size()-1;i++){
            if(elements.get(i)+1 != elements.get(i+1)){
                ver = false;
                break;
            }
        }
        return ver;
    }
}
