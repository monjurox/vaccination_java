package newvac;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws Exception {
        Vaccine obj = new Vaccine();
        Scanner in = new Scanner(System.in);
        int selection;

        System.out.println("Insert the number of people:");
        int b = in.nextInt();
        in.nextLine();
        obj.a = b;
        obj.menu();
        do {
            selection = in.nextInt();
            switch (selection) {
                case 1:
                    obj.take();
                    obj.menu();
                    break;

                case 2:
                    obj.search();
                    obj.menu();
                    break;

                case 3:
                    obj.fileread();
                    obj.menu();


                    break;
                case 4:
                    obj.output();
                    obj.menu();

                    break;
                case 5:
                    System.out.println("You have exited the program");
                    break;
                default:
                    System.out.println("wrong input");
                    break;
            }


        }
        while (selection < 5);


    }

}
