import java.util.Scanner;

public class Main {
    //main class that runs the program.
    MathGenerator m;
    Character c;
    Database db;
    Scanner scan;

    // 0 - easy 1- medium 2- hard
    int difficulty;

    public Main()
    {
        m = new MathGenerator();
        db = new Database();
        scan = new Scanner(System.in);

        System.out.println("Welcome to Math Game v. 0.1!");

        System.out.print("Please enter your name :: ");
        String name = scan.nextLine();

        System.out.print("Please enter the difficulty (0, 1, 2) :: ");
        int diff = scan.nextInt();

        scan.nextLine();

        System.out.print("Please select a character (dragon, cat, bear) :: ");
        String chara = scan.nextLine();


        c = new Character(diff, name, chara);
    }

}
