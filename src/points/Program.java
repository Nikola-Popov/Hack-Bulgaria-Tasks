package points;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        double initX = 0.0;
        double initY = 0.0;
        String string = ">bc>^^a^a>>>>>>>>^^^^^^>>~>>^^";

        Scanner input = new Scanner(System.in);
        System.out.println("Starting point: ");
        System.out.print("x = ");
        initX = input.nextInt();
        System.out.print("y = ");
        initY = input.nextInt();

        SystemLogic systemLogic = new SystemLogic(initX, initY);
        systemLogic.readStringInput(string);
        systemLogic.printCurrentCoordinates();
        input.close();
    }
}
