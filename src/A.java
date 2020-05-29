import java.util.Scanner;

public class A {
    Scanner sc = new Scanner(System.in);    // creating Scanner object

    public void userResponse(){

        System.out.print("Do you like my program (Y/N) : ");
        char response = sc.next().charAt(0);    // input char

        if (response == 'Y' || response == 'y'){
            System.out.println("Thank you so much");
        }
        else {
            System.out.println("Duh!!!");
        }
    }

    public void displayMessage(){
        System.out.print("Enter a message: ");
        String msg = sc.nextLine();
        System.out.println(msg);
    }
}