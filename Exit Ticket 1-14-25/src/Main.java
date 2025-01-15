import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter 3 int values: ");
        Scanner nv = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();

        do {
            for (int i = 0; i < 1; i++) { /*so for this for loop I'm not sure why,
             but it only works as intended when I use 1; but it's taking 3 anyway????*/
                try {
                    nums.add(nv.nextInt());

                } catch (Exception e) {
                    System.out.println("Invalid input! Enter an integer value: ");
                    nv.nextLine();
                }
            }
        }while (nums.size() <= 2);

        double sum = 0;
        for (int i = 0; i < 3; i++) {
            sum = sum + nums.get(i);
        }
        double avg = sum / 3;
        System.out.println("The average is " + avg);
    }
}