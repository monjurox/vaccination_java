package newvac;


import java.io.*;
import java.util.Scanner;

public class Vaccine {
    String name;
    int age;
    String gender;
    int nid;
    String vaccine;
    String hospital;


    Scanner input = new Scanner(System.in);


    static int a;

    Vaccine[] arr = new Vaccine[500];

    void BasicInfo(String name,
                   int age,
                   String gender,
                   int nid) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.nid = nid;


    }

    //mehtod for Select 4 process
    void output() {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\monju\\Desktop\\3374_Vacc\\vaccine.txt"));

            for (int i = 0; i < a; i++) {
                if (arr[i].vaccine != null) {

                    bw.write(arr[i].name + " " + arr[i].age + " " + arr[i].gender + " " + arr[i].nid + " " + arr[i].vaccine + " " + arr[i].hospital + "\n");

                }

            }
            bw.flush();
            bw.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //file read starts
        try {
            File myObj = new File("C:\\Users\\monju\\Desktop\\3374_Vacc\\vaccine.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    //method for Select 1 process
    void take() {


        for (int i = 0; i < a; i++) {
            System.out.println("Inserting " + (i + 1) + " person data");
            System.out.println("Enter Name:");
            String name = input.next();
            System.out.println("Enter Age:");
            int age = input.nextInt();
            System.out.println("Enter Gender:");
            String gender = input.next();
            System.out.println("Enter NID:");
            int nid = input.nextInt();
            arr[i] = new Vaccine();
            arr[i].BasicInfo(name, age, gender, nid);
            System.out.println((i + 1) + " Person data was inserted successfully");
        }


    }

    //method for Select 2 process
    void search() {

        System.out.println("Enter NID");
        int search = input.nextInt();


        for (int i = 0; i < a; i++) {
            if (search == arr[i].nid) {

                System.out.println("Search Success!  Welcome " + arr[i].name);

                if (arr[i].gender.equals("female")) {
                    System.out.println("Are You Pregnant?");

                    String prg = input.next();
                    if (prg.equals("yes")) {
                        System.out.println("NOT ELIGIBLE");
                    } else {
                        System.out.println("What is your current covid result?");
                        String covid = input.next();
                        if (covid.equals("positive")) {
                            System.out.println("NOT ELIGIBLE");

                        } else {
                            System.out.println("Select Vaccine from (Moderna, Pfizer, AstraZeneca):");
                            String vacc = input.next();
                            arr[i].vaccine = vacc;
                            System.out.println("Select Hospital (Square, Popular, DMC): ");
                            String hosp = input.next();
                            arr[i].hospital = hosp;
                            System.out.println("Congratulations your registration is successful! ");
                            System.out.println("We will let you know the date");
                        }

                    }

                } else {
                    System.out.println("What is your current covid result?");
                    String covid = input.next();
                    if (covid.equals("positive")) {
                        System.out.println("NOT ELIGIBLE");

                    } else {
                        System.out.println("Select Vaccine from (Moderna, Pfizer, AstraZeneca):");
                        String vacc = input.next();
                        arr[i].vaccine = vacc;
                        System.out.println("Select Hospital (Square, Popular, DMC): ");
                        String hosp = input.next();
                        arr[i].hospital = hosp;
                        System.out.println("Congratulations your registration is successful!");
                        System.out.println("We will let you know the date");
                    }
                }

            }

        }


    }

    //method for Select 3 process
    void fileread() {

        try {
            File myObj = new File("C:\\Users\\monju\\Desktop\\3374_Vacc\\vacc.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // method for menu
    void menu() {

        System.out.println("Select 1 to enter new patient information ");
        System.out.println("Select 2 to take Vaccination");
        System.out.println("Select 3 to get Vaccination Information");
        System.out.println("Select 4 to see Vaccination Information");
        System.out.println("Select 5 to exit ");
        System.out.println("\n");
    }


}
