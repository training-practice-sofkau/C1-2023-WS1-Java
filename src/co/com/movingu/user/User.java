package co.com.movingu.user;

//TO DO: Complete/Rewrite the class according to the requirements
public abstract class User {
    //TO DO: Attributes
    protected String dni;

    protected String name;

    protected int age;

    protected boolean blocked;

    protected int ticketOn;

    public User(String dni, String name, int age) {
        this.dni = dni;
        this.name = name;
        this.age = age;
        this.blocked = false;
        this.ticketOn = 0;
    }

    //Abstract method
    public abstract void statusMsg();




}