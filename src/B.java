import java.util.Scanner;

public class B extends A {

    @Override
    public void displayMessage(){
        System.out.print("Enter a message: ");
        String msg = sc.nextLine();
        System.out.println("Your message is " + msg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello!");

        System.out.print("Enter your name: ");

        String name = sc.nextLine();

        System.out.print("Enter your favourite number: ");
        int favNumber = sc.nextInt();

        System.out.println("You just entered: " + name + " and " + favNumber);

        int diff = favNumber - 10;
        System.out.println("Difference between my favourite number 10 and your " + favNumber + "= " + diff);

        B obj = new B();    // creating an object of Class B
        obj.displayMessage();
        obj.userResponse(); // calling userResponse method by obj of Class B
    }
}
