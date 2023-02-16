import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class TilesSlide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> row = new ArrayList<>();
        System.out.print("Choose the size of the row: ");
        int size = input.nextInt();
        for (int i = 0; i<size; i++){
            System.out.print("Choose the value of the "+(i+1)+"º tile: ");
            row.add(i,input.nextInt());
        }
        ArrayList<Integer> newRow = leftSlide(row);

        for(Integer tiles : newRow){
            System.out.println(tiles);
        }

    }
    public static ArrayList<Integer> leftSlide(ArrayList<Integer> row){
        ArrayList<Integer> usedTiles = new ArrayList<>();
        boolean stopSlide = false;
        while (!stopSlide){
            stopSlide = true;
            for(int i = 1; i<row.size(); i++){
                if (row.get(i - 1) ==0 && row.get(i) !=0){
                    row.set(i - 1, row.get(i));
                    row.set(i, 0);
                    stopSlide = false;
                }
                if (Objects.equals(row.get(i - 1), row.get(i)) && (row.get(i-1)!=0 && row.get(i)!=0) && (usedTiles.size()==0 || !usedTilesVer(i-1,usedTiles))){
                    row.set(i-1, row.get(i)*2);
                    row.set(i,0);
                    usedTiles.add(i-1);
                    stopSlide = false;
                }
            }
            for(Integer tiles : row){
                System.out.println(tiles);
            }
        }
        return row;
    }

    public static boolean usedTilesVer(int p1,ArrayList<Integer> usedTiles){
        boolean ver = false;
        for (Integer usedTile : usedTiles)
            if (usedTile == p1) {
                ver = true;
                break;
            }
        return ver;
    }
}
