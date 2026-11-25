import java.util.Scanner;

public class Main {


    public static void adventure(){
        System.out.println("Finding for materials...\n");
    }

    public static void craft(){
        System.out.println("Crafting...\n");
    }

    public static void combat(){
        System.out.println("Finding enemies...\n");
    }

    static void main(){
        System.out.println("Adventure Game");

        Scanner scn = new Scanner(System.in);



        mainLoop:
        while(true){
            System.out.print("Choose action\n1. Adventure\n2. Craft\n3. Combat\n4. Exit game\n:");
            int action = Integer.parseInt(scn.nextLine());

            switch(action){
                case 1:
                    adventure();
                    break;
                case 2:
                    craft();
                    break;
                case 3:
                    combat();
                    break;
                case 4:
                    System.out.println("Saving...");
                    System.out.println("Exiting game.");
                    break mainLoop;
                default:
                    System.out.println("Invalid action. Try again.\n");
            }
        }




    }
}
