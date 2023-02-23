import java.util.ArrayList;

public class ParenthesesClusters {
    public static void main(String[] args) {
        for (String elements : split("()()()")) {
            System.out.println(elements);
        }

    }

    public static String[] split(String str) {
        String[] elementsSplit = str.split("");
        ArrayList<String> done = new ArrayList<>();
        int counter = 0;
        StringBuilder builder = new StringBuilder();
        for(String element:elementsSplit){
            if(element.equals("(")){
                builder.append("(");
                counter++;
            } else if (element.equals(")")){
                builder.append(element);
                counter--;
                if (counter==0) {
                    done.add(String.valueOf(builder));
                    builder.setLength(0);
                }
            }
        }
        int index = 0;
        String[] finalArray = new String[done.size()];

        for(String elements : done){
            finalArray[index++] = elements;
        }

        return finalArray;
    }
}
