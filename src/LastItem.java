import java.util.*;

public class LastItem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        ArrayList<String> userList = new ArrayList<>();

        System.out.println("Please enter list items: ");
        
        while (true){
            String listItem = input.nextLine();

            if (listItem.equals("")){
                String lastIndex = userList.get(userList.size() - 1);
                System.out.println("The last item in the list is: " + lastIndex);
                return;
            } else
            userList.add(listItem);


        }

    }
}
