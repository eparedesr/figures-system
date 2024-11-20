import figures.Line;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option = 0;
        Scanner scanner = new Scanner(System.in);
        Line line = new Line();
        do{
                System.out.println("1. Create Line");
                System.out.println("2. Print Line");
                System.out.println("3. Exit");
                option=scanner.nextInt();
                switch (option){
                    case 1:
                        System.out.println("Please enter length: ");
                        int lineLength = scanner.nextInt();
                        line.setLength(lineLength);
                        break;
                    case 2:
                        line.drawLine();
                        break;
                    case 3:
                        System.out.println("xxxxx Exiting System xxxx");
                        break;
                    default:
                        System.out.println("Please enter a valid option");
                        break;
                }
        }while(option != 3);
    }
}