package method_Overriding;

import java.util.*;
public class Game {
    
    Game()
    {
        System.out.println("Welcome to the Game");
    }

    public Vehicle getVehicle()
    {
        System.out.println("Please Press 1 for Car");
        System.out.println("Please Press 2 for Bike");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if(choice == 1)
        {
            System.out.println("You have selected Car");
            return new Car();
        }
        else if(choice == 2)
        {
            System.out.println("You have selected Bike");
            return new Bike();
        }
        else {

            System.out.println("This is not Valid Choice");
            return getVehicle();
        }
    }
}
