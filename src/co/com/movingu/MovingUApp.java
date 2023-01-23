package co.com.movingu;

import co.com.movingu.ticket.Ticket;
import co.com.movingu.user.Student;
import co.com.movingu.user.Trainer;
import co.com.movingu.user.User;
import co.com.movingu.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovingUApp {
    static List<User> users = new ArrayList<>(){{
        add(new Student("0976152443", "Carolina Montoya", 24, "201547896", "FIEC"));
        add(new Trainer("0976152443", "Washington Pesantez", 36, "lecturer"));


    }};
    public static void main(String[] args) {
        //Lists that contains data related to the WS


        List<Vehicle> vehicles= new ArrayList<>(){{
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

        List<Ticket> tickets = new ArrayList<>(){{
            //add(new Ticket());
            //add(new Ticket());
            //add(new Ticket());

        }};

        //TO DO: Implement the necessary logic to make the menu work
        menu();


    }

    public static void menu(){
        System.out.println("Moving - U");
        System.out.println("1. Register user");
        System.out.println("2. Borrow/Return");
        System.out.println("3. Pay a ticket");
        System.out.println("4. Check availability");
        System.out.println("5. Exit");
        Scanner sc = new Scanner(System.in);
        String option = sc.nextLine();
        switch (option) {
            case "1":
                registerUser();
                break;
            case "2":
                borrowReturn();
                break;
            case "3":
                payTicket();
                break;
            case "4":
                checkAvailability();
                break;
            case "5":
        }
    }

    public static void registerUser() {
        String category = "";
        Scanner sc = new Scanner(System.in);
        //Ask the commom data: DNI, Name, age.
        System.out.print("Enter your DNI: ");
        String dni = sc.nextLine();
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("User is: Student (S) / Trainer (T)");
        String type = sc.nextLine();
        switch (type){
            case "S":
                // Ask the college DNI and the faculty
                System.out.print("Please enter your college DNI: ");
                String collegeDni = sc.nextLine();
                System.out.print("Please enter your faculty: ");
                String faculty = sc.nextLine();
                //create the student object
                User s = new Student(dni, name, age, collegeDni, faculty);
                users.add(s);
                //Display a message: User was registered
                System.out.print("User registered");
                break;

            case "T":
                // Ask if Trainer is Lecturer or Professor
                System.out.print("Are you a Lecturer(1) or Professor?(2): [1/2]");
                int trainerType = Integer.parseInt(sc.nextLine());
                category = ((trainerType == 1) ? ("Lecturer") : ("Professor"));
                //create the trainer object
                User t = new Trainer(dni, name, age, category);
                users.add(t);
                //Display a message: User was registered
                System.out.print("User registered");

        }
    }
    

}}