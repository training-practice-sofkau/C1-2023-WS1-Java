package co.com.movingu.ticket;

import co.com.movingu.user.User;
import co.com.movingu.vehicle.Vehicle;

import java.util.Date;

//TO DO: Complete/Rewrite the class according to the requirements
public class Ticket {

    private String ticketID;
    private Date ticketCreation;
    private Date ticketExpiration;
    private Date returnDate;
    private Boolean helmet;
    private Boolean helmetStatus;
    private String status;
    private Long amountToPay;
    private String vehicleId;
    private String userId;

    private Date date = new Date();


    public Ticket(
            String ticketID,
            String userId,
            String vehicleId) {
        this.ticketID = ticketID;
        this.ticketCreation = new Date(System.currentTimeMillis());
        this.ticketExpiration = new Date(System.currentTimeMillis()+3600000) ;
        this.status = "Active";
        this.userId = userId;
        this.vehicleId=vehicleId;
        this.amountToPay=0L;
        this.helmet=true;
        this.helmetStatus=true;
    }

    public String getTicketID() {
        return ticketID;
    }
    public String getVehicleId(){
        return vehicleId;
    }

    public String getUserId() {
        return userId;
    }

    public void setAmountPaid() {
        this.amountToPay = 0L;
    }

    public void setReturnDate() {
        this.returnDate = new Date(System.currentTimeMillis());
    }

    public void setHelmetStatus(Boolean helmetStatus) {
        this.helmetStatus = helmetStatus;
    }

    public void setHelmet(Boolean helmet) {
        this.helmet = helmet;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    //TO DO: Add the necessary getters & setters u other extra function
    public Long calculateDebt(String vehicleType, Vehicle vehicle){
        Long delayDebt;
        Integer helmetDebt=0;
        Integer damageDebt=0;
        Integer helmetDamageDebt=0;
        this.returnDate=new Date(System.currentTimeMillis());
        //Miliseconds/1000 = seconds. Seconds/60=minutes. Minutes/30=fee
        delayDebt = Math.abs(returnDate.getTime()-ticketExpiration.getTime())/1000/60/30;
        if (returnDate.compareTo(ticketExpiration)<=0){
            delayDebt=0L;
        }
        if (!helmet){
            helmetDebt=10;
        }
        if(!helmetStatus){
            helmetDamageDebt=5;
        }
        if(vehicleType.equals("B")&& vehicle.getCondition().equals("Bad")){
            damageDebt=20;
        }
        if(vehicleType.equals("S")&& vehicle.getCondition().equals("Bad")){
            damageDebt=30;
        }
        amountToPay =delayDebt+helmetDebt+damageDebt+helmetDamageDebt;
        return amountToPay;
    }





    @Override
    public String toString() {
        return "Ticket{" +
                "ticketID='" + ticketID + '\'' +
                ", ticketCreation=" + ticketCreation +
                ", ticketExpiration=" + ticketExpiration +
                ", helmet='" + helmet + '\'' +
                ", status='" + status + '\'' +
                ", amountToPay=" + amountToPay +
                ", vehicleId='" + vehicleId + '\'' +
                ", userId='" + userId + '\'' +
                ", date=" + date +
                '}';
    }
}
