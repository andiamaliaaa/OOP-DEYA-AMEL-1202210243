import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean repeat = true;
        Scanner input = new Scanner(System.in);
        Calculation calc = new Calculation();

        do{
            try{
                System.out.println("===Menu Program===");
                System.out.println("1. Sqaure");
                System.out.println("2. Circle");
                System.out.println("3. Trapezoid");
                System.out.println("0. Exit");
                System.out.print("Select menu : ");

                int menu = input.nextInt();
                switch(menu){
                    case 1:
                        System.out.print("Enter the lenght of the side of the square : ");
                        double square = input.nextDouble();
                        calc.setSquare(square);
                        calc.run();
                        System.out.print("Result = "+calc.getSquare());
                        System.out.println("");
                        break;
                    case 2:
                        System.out.print("Enter the radius of the circle : ");
                        double circle = input.nextDouble();
                        calc.setCircle(circle);
                        calc.run();
                        System.out.println("Result = "+calc.getCircle());
                        System.out.println("");
                        break;
                    case 3:
                        System.out.print("Insert the side of the base of thetrapezoid : ");
                        double base = input.nextDouble();
                        System.out.print("Enter the upper side of the trapezoid : ");
                        double upper = input.nextDouble();
                        System.out.print("Enter the height od the trapezoid : ");
                        double height = input.nextDouble();
                        calc.setTrapezoid(base,upper,height);
                        calc.run();
                        System.out.println("Result = "+calc.getTrapezoid());
                        System.out.println("");

                    case 0:
                        System.out.println("Program End");
                        repeat = false;
                        break;
                    default:
                    System.out.println("Option not available");
                    continue;
                }
            } catch(InputMismatchException e){
                System.out.println("Error : Input must be a number");
                input.next();
            }catch(IllegalArgumentException e){
                System.out.println(e);
            }
        }while(repeat);
        input.close();
    }
}
