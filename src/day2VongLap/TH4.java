package day2VongLap;

public class TH4 {
    public static void main(String[] args) {
        int choice;
        java.util.Scanner input = new java.util.Scanner(System.in);

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter1 your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 1; i < 5; i++) {
                        for (int j = 1; j < 5 - i + 1; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 6; i++) {
                        for (int j = 1; j <= 6; j++) {
                            if (i == 1 || i == 6 || j == 1 || j == 6 ||
                                    i == j || (i + j) == (6 + 1)) {
                                System.out.print(" * ");
                            } else {
                                System.out.print("   ");
                            }
                        }
                        System.out.println();
                    }
            break;
                case 3:
                    System.out.println("Draw the rectangle");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }

    }
}
