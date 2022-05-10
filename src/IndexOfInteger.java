import java.util.*;

public class IndexOfInteger {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numList = new ArrayList<>();

        System.out.println("Enter a list of numbers: ");

        while (true){
            int listItem = Integer.valueOf(input.nextLine());
            int userNumber;
            
            if(listItem == 0){
                System.out.println("You are done entering integers into the list!");
                System.out.println("What number are you looking for in the list?");
                userNumber = Integer.valueOf(input.nextLine());
            for (int i = 0 ; i < numList.size(); i++ ) {
                if (userNumber == numList.get(i)){
                    System.out.println(userNumber + " is at index " + i);
                }
                
                }

            } else 
            numList.add(listItem);
        }
    }
}
