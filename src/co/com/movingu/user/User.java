package co.com.movingu.user;

//TO DO: Complete/Rewrite the class according to the requirements
public abstract class User {

    protected String dni;
    protected String name;
    protected int age;
    protected boolean blocked;
    protected boolean ticketOn;

    public User(String dni, String name, Integer age) {
        this.dni = dni;
        this.name = name;
        this.age = age;
        this.blocked = false;
        this.ticketOn = false;
    }

    //Abstract method
    public abstract void statusMsg();

    @Override
    public String toString() {
        return  "dni='" + dni + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", blocked=" + blocked +
                ", ticketOn=" + ticketOn
                +"\n";
    }
}