import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Vending {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int balance = 10000;
    int change = 0;
    List<String> items = Arrays.asList("Coke: $2", "Sprite: $2", "Chips: $3", "Fruit Snacks: $1", "M&Ms: $1");
    int coke = 2;
    int sprite = 2;
    int chips = 3;
    int fruitSnacks = 1;
    int mms = 1;

    System.out.println("Welcome! Only $1 bills are accepted. Choose an item to buy: \n" + items);  
    System.out.println(" Select '1' for Coke \n Select '2' for Sprite \n Select '3' for Chips \n Select '4' for Fruit Snacks \n Select '5' for M&Ms");  
    
    int chosenItem = input.nextInt();

}
    

}