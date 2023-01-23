package co.com.movingu;

import co.com.movingu.ticket.Ticket;
import co.com.movingu.user.Student;
import co.com.movingu.user.Trainer;
import co.com.movingu.user.User;
import co.com.movingu.vehicle.Scooter;
import co.com.movingu.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MovingUApp {

    //Lists that contains data related to the WS
    public static List<User> users = new ArrayList<>(){{
        add(new Student("0976152443", "Carolina Montoya", 24, "201547896", "FIEC"));
        add(new Trainer("0976152443", "Washington Pesantez", 36, "lecturer"));
    }};

    public static List<Vehicle> vehicles= new ArrayList<>(){{
        //add(new Bicycle("B-001","red",true, true, "M"));
        //add(new Bicycle("B-002","blue",false, false, "M"));
        //add(new Bicycle("B-003","red",true, true, "R"));
        //add(new Bicycle("B-004","green",false, true, "R"));
        //add(new Bicycle("B-005","grey",true, true, "M"));
        //add(new Scooter("S-001","black",false, true, 20));
        //add(new Scooter("S-002","blue",true, true, 50));
        //add(new Scooter("S-003","grey",true, true, 80));
        //add(new Scooter("S-004","grey",true, false, 50));
        //add(new Scooter("S-005","black",false, false, 50));

    }};

    public static List<Ticket> tickets = new ArrayList<>(){{
        //add(new Ticket());
        //add(new Ticket());
        //add(new Ticket());

    }};

    public static void main(String[] args) {

        int menuOption = 0;

        Scanner in = new Scanner(System.in);



        try {
            do {
                menu();
                menuOption = in.nextInt();

                switch (menuOption) {
                    case 1 -> registerUser(in);
                    //case 4 ->
                    default -> System.out.println("Invalid menu option");

                }
            } while (menuOption != 5);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input type option");
        }catch (Exception e) {
            System.out.println(e);
        }





    }

    public static void menu(){
        System.out.println("Moving - U");
        System.out.println("1. Register user");
        System.out.println("2. Borrow/Return");
        System.out.println("3. Pay a ticket");
        System.out.println("4. Check availability");
        System.out.println("5. Exit");
    }

    public static void registerUser(Scanner in){
        System.out.println("DNI number:");
        String userDni = in.next();

        System.out.println("User name:");
        String userName = in.next();

        System.out.println("User age:");
        int userAge = in.nextInt();

        System.out.print("User is: Student (S) / Trainer (T)");
        String userType = in.next().toUpperCase();

        switch (userType) {
            case "S" -> {
                System.out.println("Student college DNI");
                String userCollegeDni = in.next();
                System.out.println("Student faculty");
                String userFaculty = in.next();
                User s = new Student(userDni, userName, userAge, userCollegeDni, userFaculty);
                users.add(s);
                System.out.println("Student " + userName + " created successfully");
            }
            case "T" -> {
                System.out.println("Trainer category: ");
                String userCategory = in.next();
                User t = new Trainer(userDni, userName, userAge, userCategory);
                users.add(t);
                System.out.println("Trainer " + userName + " created successfully");
            }
            default -> System.out.println("Invalid option");
        }
    }

}