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

        System.out.println(
                "Welcome! Only $1 bills are accepted. Choose an item to buy: \n"
                        + items);
        System.out.println(
                " Select '1' for Coke \n Select '2' for Sprite \n Select '3' for Chips \n Select '4' for Fruit Snacks \n Select '5' for M&Ms");

        int chosenItem = input.nextInt();

        // If Coke is selected
        if (chosenItem == 1) {
            System.out.println("You chose " + items.get(chosenItem - 1) + ".");
            System.out.println("Please enter your amount of money. In $1 bills. ");

            int amountBills = input.nextInt();

            System.out.println("\n Select '1' to confirm purchase \n Select '2' to cancel purchase");

            int confirm = input.nextInt();

            while (confirm != 1 && confirm != 2) {
                System.out.println("Please enter either '1' to confirm purchase or '2' to cancel.");
                confirm = input.nextInt();
            }

            if (confirm == 1) {
                if (amountBills < coke) {
                    System.out.println("Please insert the correct amount of money.");
                }

                if (amountBills == coke) {
                    System.out.println("Thank you for your purchase! Come again soon!");
                }

                if (amountBills > coke) {
                    int cashBack = amountBills - coke;
                    System.out.println("Thank you for your purchase! Here is the remainder of your money: $" + cashBack
                            + ". Come again soon!");
                }

            }

            if (confirm == 2) {
                System.out.println("Transaction canceled. Here is your full refund of " + amountBills
                        + " dollars. Come again soon!");
            }

        }

        // If Sprite is selected
        if (chosenItem == 2) {
            System.out.println("You chose " + items.get(chosenItem - 1) + ".");
            System.out.println("Please enter your amount of money. In $1 bills. ");

            int amountBills = input.nextInt();

            System.out.println("\n Select '1' to confirm purchase \n Select '2' to cancel purchase");

            int confirm = input.nextInt();

            while (confirm != 1 && confirm != 2) {
                System.out.println("Please enter either '1' to confirm purchase or '2' to cancel.");
                confirm = input.nextInt();
            }

            if (confirm == 1) {
                if (amountBills < sprite) {
                    System.out.println("Please insert the correct amount of money.");
                }

                if (amountBills == sprite) {
                    System.out.println("Thank you for your purchase! Come again soon!");
                }

                if (amountBills > sprite) {
                    int cashBack = amountBills - sprite;
                    System.out.println("Thank you for your purchase! Here is the remainder of your money: $" + cashBack
                            + ". Come again soon!");
                }

            }

            if (confirm == 2) {
                System.out.println("Transaction canceled. Here is your full refund of " + amountBills
                        + " dollars. Come again soon!");
            }

        }

        // If chips are selected
        if (chosenItem == 3) {
            System.out.println("You chose " + items.get(chosenItem - 1) + ".");
            System.out.println("Please enter your amount of money. In $1 bills. ");

            int amountBills = input.nextInt();

            System.out.println("\n Select '1' to confirm purchase \n Select '2' to cancel purchase");

            int confirm = input.nextInt();

            while (confirm != 1 && confirm != 2) {
                System.out.println("Please enter either '1' to confirm purchase or '2' to cancel.");
                confirm = input.nextInt();
            }

            if (confirm == 1) {
                if (amountBills < chips) {
                    System.out.println("Please insert the correct amount of money.");
                }

                if (amountBills == chips) {
                    System.out.println("Thank you for your purchase! Come again soon!");
                }

                if (amountBills > chips) {
                    int cashBack = amountBills - chips;
                    System.out.println("Thank you for your purchase! Here is the remainder of your money: $" + cashBack
                            + ". Come again soon!");
                }

            }

            if (confirm == 2) {
                System.out.println("Transaction canceled. Here is your full refund of " + amountBills
                        + " dollars. Come again soon!");
            }

        }

        // If fruit snacks are selected
        if (chosenItem == 4) {
            System.out.println("You chose " + items.get(chosenItem - 1) + ".");
            System.out.println("Please enter your amount of money. In $1 bills. ");

            int amountBills = input.nextInt();

            System.out.println("\n Select '1' to confirm purchase \n Select '2' to cancel purchase");

            int confirm = input.nextInt();

            while (confirm != 1 && confirm != 2) {
                System.out.println("Please enter either '1' to confirm purchase or '2' to cancel.");
                confirm = input.nextInt();
            }

            if (confirm == 1) {
                if (amountBills < fruitSnacks) {
                    System.out.println("Please insert the correct amount of money.");
                }

                if (amountBills == fruitSnacks) {
                    System.out.println("Thank you for your purchase! Come again soon!");
                }

                if (amountBills > fruitSnacks) {
                    int cashBack = amountBills - fruitSnacks;
                    System.out.println("Thank you for your purchase! Here is the remainder of your money: $" + cashBack
                            + ". Come again soon!");
                }

            }

            if (confirm == 2) {
                System.out.println("Transaction canceled. Here is your full refund of " + amountBills
                        + " dollars. Come again soon!");
            }

        }

        // If M&M's is selected
        if (chosenItem == 5) {
            System.out.println("You chose " + items.get(chosenItem - 1) + ".");
            System.out.println("Please enter your amount of money. In $1 bills. ");

            int amountBills = input.nextInt();

            System.out.println("\n Select '1' to confirm purchase \n Select '2' to cancel purchase");

            int confirm = input.nextInt();

            while (confirm != 1 && confirm != 2) {
                System.out.println("Please enter either '1' to confirm purchase or '2' to cancel.");
                confirm = input.nextInt();
            }

            if (confirm == 1) {
                if (amountBills < mms) {
                    System.out.println("Please insert the correct amount of money.");
                }

                if (amountBills == mms) {
                    System.out.println("Thank you for your purchase! Come again soon!");
                }

                if (amountBills > mms) {
                    int cashBack = amountBills - mms;
                    System.out.println("Thank you for your purchase! Here is the remainder of your money: $" + cashBack
                            + ". Come again soon!");
                }

            }

            if (confirm == 2) {
                System.out.println("Transaction canceled. Here is your full refund of " + amountBills
                        + " dollars. Come again soon!");
            }

        }

        // if (chosenItem == 2) {
        // System.out.println("Select '1' to confirm purchase \n Select '2' to cancel
        // purchase");

        // int confirm = input.nextInt();

        // while (confirm != 1 || confirm != 2) {
        // if (confirm == 1) {

        // }

        // if (confirm == 2) {

        // }
        // }
        // }

        // if (chosenItem == 3) {
        // System.out.println("Select '1' to confirm purchase \n Select '2' to cancel
        // purchase");

        // int confirm = input.nextInt();

        // while (confirm != 1 || confirm != 2) {
        // if (confirm == 1) {

        // }

        // if (confirm == 2) {

        // }
        // }
        // }

        // if (chosenItem == 4) {
        // System.out.println("Select '1' to confirm purchase \n Select '2' to cancel
        // purchase");

        // int confirm = input.nextInt();

        // while (confirm != 1 || confirm != 2) {
        // if (confirm == 1) {

        // }

        // if (confirm == 2) {

        // }
        // }
        // }

        // if (chosenItem == 5) {
        // System.out.println("Select '1' to confirm purchase \n Select '2' to cancel
        // purchase");

        // int confirm = input.nextInt();

        // while (confirm != 1 || confirm != 2) {
        // if (confirm == 1) {

        // }

        // if (confirm == 2) {

        // }
        // }
        // }
    }

}