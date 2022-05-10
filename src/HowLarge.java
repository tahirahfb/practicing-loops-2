import java.util.*;

public class HowLarge {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        ArrayList<String> userList = new ArrayList<>();

        System.out.println("Enter list items: ");

        while(true){
            String listItem = input.nextLine();
            

            if (listItem.equals("")){
                System.out.println("The total amount of items in the list is: " + userList.size());
                return;
            } else
            userList.add(listItem);
        }
    }
}
