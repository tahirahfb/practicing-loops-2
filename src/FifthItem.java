import java.util.*;

public class FifthItem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> userList = new ArrayList<>();

        System.out.println("Please enter list items:");

        while (true){
            String listItems = input.nextLine();

            if (listItems.equals("")){
            System.out.println("The fifth item in the list is: " + userList.get(4));
                return;
                
            } else 
            userList.add(listItems);
        }

    }
}
