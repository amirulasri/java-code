import java.text.SimpleDateFormat;
import java.util.Date;
public class RoomRental {

    private String customerName;
    private String contactNo;
    private String roomType;
    private Date startDate;
    private Date endDate;
    private int quantityRoom;
    
    //CONSTRUCTOR WITHOUT PARAMETER
    public RoomRental (){
        customerName = null;
        contactNo = null;
        roomType = null;
        startDate = null;
        endDate = null;
        quantityRoom = 0;
    }
    
    //CONSTRUCTOR WITH PARAMETER
    public RoomRental(String customerName, String contactNo, String roomType, Date startDate, Date endDate, int quantityRoom){
        this.customerName = customerName;
        this.contactNo = contactNo;
        this.roomType = roomType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.quantityRoom = quantityRoom;
    }

    //MUTATOR FOR ALL VARIABLE
    public void setAllCustomerData(String customerName, String contactNo, String roomType, Date startDate, Date endDate, int quantityRoom) {
        this.customerName = customerName;
        this.contactNo = contactNo;
        this.roomType = roomType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.quantityRoom = quantityRoom;
    }

    //MUTATOR FOR EACH VARIABLE
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setQuantityRoom(int quantityRoom) {
        this.quantityRoom = quantityRoom;
    }

    //ACCESSOR FOR GETTING DATA
    public String getCustomerName() {
        return customerName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public String getRoomType() {
        return roomType;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public int getQuantityRoom() {
        return quantityRoom;
    }
    
    //PROCESS FOR CALCULATING PRICE WITH DISCOUNT
    public double FindPrice(int days) {
        //GET ROOM TYPE AND FIND ROOM PRICE
        int roomPrice = 0;
        if (roomType.equalsIgnoreCase("Standard")) {
            roomPrice = 100;
        } else if (roomType.equalsIgnoreCase("Deluxe")) {
            roomPrice = 150;
        } else if (roomType.equalsIgnoreCase("Superior")) {
            roomPrice = 200;
        }

        //CALCULATION FOR TOTAL PRICE
        double price = (roomPrice * days) * quantityRoom;

        //DISCOUNT IF BOOKING MORE THAN TWO DAYS
        if (days > 2) {
            double discount = price * 0.05;
            price = price - discount;
        }

        return price;
    }
    
    //PROCESS FOR GETTING DIFFERENT DAYS BY TWO DATES
    public int CalculateDays() {
        long startMillisecond = startDate.getTime();
        long endMillisecond = endDate.getTime();
        int daysdiff = 0;
        long timedatedifferent = 0;
        if (startMillisecond > endMillisecond) {
            timedatedifferent = startMillisecond - endMillisecond;
        } else {
            timedatedifferent = endMillisecond - startMillisecond;
        }
        daysdiff = (int) (timedatedifferent / (1000 * 60 * 60 * 24));
        return daysdiff;
    }
    
    //toString //DISPLAY DATA
    public String toString(){
        String newformatstartdate = null;
        String newformatenddate = null;
        SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
        newformatstartdate = dateformat.format(startDate);
        newformatenddate = dateformat.format(endDate);
        return "Name: " + customerName + "\nContact number: " + contactNo + "\nRoom type: " + roomType + "\nCheck in date: " + newformatstartdate + "\nCheck out date: " + newformatenddate + "\nRoom quantity: " + quantityRoom;
    }
}
