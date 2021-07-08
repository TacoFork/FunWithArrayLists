import java.util.ArrayList;
import java.util.Scanner;
public class FunWithArrayLists {
    public static void main(String[] args){
        ArrayList<String> color_list = new ArrayList<>();
        Scanner keyboard = new Scanner (System.in);
        char control = ' ';

        color_list.add("red");
        color_list.add("green");
        color_list.add("blue");

        System.out.println("Color at index 0: " + color_list.get(0));

        while (control != 'q'){
            System.out.print("Enter a color to enter: ");
            color_list.add(keyboard.next());
            System.out.print("Press 'Q' to quit or anything else to continue: ");
            control = keyboard.next().toLowerCase().charAt(0);
        }
        System.out.println(color_list);
    }
}