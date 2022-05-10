import java.util.*;

public class SumOfList {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numList = new ArrayList<>();

        System.out.println("Enter a list of numbers: ");

        while (true){
            int listItem = Integer.valueOf(input.nextLine());
            
            
            if(listItem == 0){
                break;
            }
            numList.add(listItem);
        }
                int total = 0; 

            for (int i = 0; i < numList.size(); i++) {
                System.out.print(numList.get(i) + ", ");
               total+= numList.get(i);
                }
                System.out.println("were the items in the list.");
                System.out.println("The sum of that list is: " + total);

            }
        }


