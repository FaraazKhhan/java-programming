import java.util.Scanner;

public class A {

    static void userResponse(){
        Scanner sc = new Scanner(System.in);    // creating Scanner object

        System.out.print("Do you like my program (Y/N) : ");
        char response = sc.next().charAt(0);    // input char

        if (response == 'Y' || response == 'y'){
            System.out.println("Thank you so much");
        }
        else {
            System.out.println("Duh!!!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello!");

        System.out.print("Enter your name: ");

        String name = sc.nextLine();

        int favNumber = 0;
        System.out.print("Enter your favourite number: ");
        favNumber = sc.nextInt();

        System.out.println("You just entered: " + name + " and " + favNumber);

        int diff = favNumber - 10;
        System.out.println("Difference between my favourite number 10 and your " + favNumber + "= " + diff);

        userResponse();
    }
}
