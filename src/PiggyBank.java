import java.util.Scanner;

public class PiggyBank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type the cost of the car: ");
        int cost = input.nextInt();

        System.out.print("Type how much savings John has: ");
        int savings =  input.nextInt();

        System.out.print("Type the investment's start amount: ");
        int start = input.nextInt();

        System.out.println("After "+NumberOfDays(cost,savings,start)+" days he can buy a car");
    }
    public static int NumberOfDays(int cost, int savings, int start) {
        int numberDays = 0;
        while(savings<cost){
            for(int i = 0; i<7; i++){
                numberDays++;
                savings += start+i;
                if (cost<=savings){
                    break;
                }
            }
            start++;
        }
        return numberDays;
    }

    //John wants to save money for his first car. He puts money in his piggy bank every day. Every day, he puts in $1 more than the previous day. Every Monday he starts with a new value — $1 more than the previous Monday.
    //Write a function that returns the number of days he needs to buy his first car cost. John had some savings (include it before counting). On the first Monday, he puts the start amount into his piggy bank.
}
