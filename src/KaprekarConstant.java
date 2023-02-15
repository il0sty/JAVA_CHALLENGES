import java.util.*;

import static java.lang.System.in;

public class KaprekarConstant {
    public static void main(String[] args) {
        System.out.print("Write a number: ");
        Scanner input = new Scanner(in);
        int num = input.nextInt();
        System.out.println(kaprekar(num));

    }
    public static int kaprekar(int num) {
        int count = 0;
        while (num != 6174) {
            System.out.println(num);
            if (num<1000){
                num = num*10;
            }
            count++;
            List<Integer> reorderListAsc = new ArrayList<>();
            List<Integer> reorderListDes= new ArrayList<>();
            String[] writeNumber = Integer.toString(num).split("");
            for (String numbersString : writeNumber) {
                reorderListAsc.add(Integer.valueOf(numbersString));
                reorderListDes.add(Integer.valueOf(numbersString));
            }

            Collections.sort(reorderListAsc);
            Collections.sort(reorderListDes, Collections.reverseOrder());




            int numAsc = ListToNumber(reorderListAsc,reorderListAsc.size()-1,1);
            int numDes = ListToNumber(reorderListDes, reorderListDes.size()-1, 1);
            System.out.println(numAsc + " "+ numDes);
            num = numAsc>numDes? numAsc-numDes : numDes-numAsc;
        }

        return count;
    }

    public static int ListToNumber(List<Integer> list, int num, int mult){
        if (num==0){
            return list.get(num)*mult;
        }
        return list.get(num)*mult + ListToNumber(list,num-1,mult*10);
    }
}
