package co.com.movingu.vehicle;

//TO DO: Complete/Rewrite the class according to the requirements
public abstract class Vehicle implements Loanable{
    private boolean available;
    private boolean condition;
    private String code;
    private String color;

    public Vehicle(boolean available, String code, String color, boolean condition) {

        this.available = available;
        this.code = code;
        this.color = color;
        this.condition = condition;

    }

    @Override
    public void updateAvailability(boolean value) {
        this.available = value;
    }
    //TO DO: Attributes

}
