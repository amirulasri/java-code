import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.DecimalFormat;

public class TestRoomRental {

    public static void main(String[] args) throws ParseException {
        //DECLARE ALL VARIABLE NEEDED
        String customerName;
        String contactNo;
        String roomType;
        String startDateInput;
        String endDateInput;
        int quantityRoom;

        Date startDate;
        Date endDate;

        //DECLARE FOR SET TWO DECIMAL PLACE FOR PRICE
        DecimalFormat twodecimalplace = new DecimalFormat("0.00");

        //DISPLAY INTRO SYSTEMS
        System.out.println("+++++++++++++++++++++++++");
        System.out.println("  Hotel Sri Kayangan");
        System.out.println("+++++++++++++++++++++++++\n");

        //DECLARE ARRAY OBJECT
        RoomRental[] rentalArr = new RoomRental[10];

        //DECLARE SCANNER FOR USER INPUT
        Scanner input = new Scanner(System.in);

        //LOOPING FOR USER INPUT
        for (int i = 0; i < rentalArr.length; i++) {
            //DECLARE EACH ARRAY OBJECT
            rentalArr[i] = new RoomRental();

            //INPUT SECTION
            System.out.println("---Customer " + (i + 1) + "---");
            System.out.print("Customer name: ");
            customerName = input.nextLine();
            System.out.print("Contact number: ");
            contactNo = input.nextLine();
            System.out.print("Enter your room type (Standard, Deluxe, Superior): ");
            roomType = input.next();
            input.nextLine(); // FIX INPUT SKIPPING BUG
            System.out.print("Enter check in Date (dd/mm/yyyy): ");
            startDateInput = input.nextLine();
            System.out.print("Enter check out Date (dd/mm/yyyy): ");
            endDateInput = input.nextLine();
            System.out.print("Enter room quantity: ");
            quantityRoom = input.nextInt();
            input.nextLine(); // FIX INPUT SKIPPING BUG

            //CONVERT STRING TO DATE
            startDate = new SimpleDateFormat("dd/MM/yyyy").parse(startDateInput);
            endDate = new SimpleDateFormat("dd/MM/yyyy").parse(endDateInput);

            //SET VALUE BY USING MUTATOR
            rentalArr[i].setAllCustomerData(customerName, contactNo, roomType, startDate, endDate, quantityRoom);
            System.out.print("\n");
        }

        //DISPLAY ALL STORED DATA TO SCREEN
        System.out.println("-- All stored customer data displayed here --");
        for (int i = 0; i < rentalArr.length; i++) {
            int datedifferentdays = rentalArr[i].CalculateDays();

            System.out.println("--+Customer " + (i + 1) + "+--");
            System.out.println(rentalArr[i].toString());
            System.out.println("Days: " + datedifferentdays);

            //DISPLAY FOR DISCOUNT IF MORE THAN TWO DAYS
            if (datedifferentdays > 2) {
                System.out.println("Discount (More than 2 days)(5%): RM -" + twodecimalplace.format((rentalArr[i].FindPrice(datedifferentdays) * 0.05)));
            } else {
                System.out.println("Discount: No discount");
            }
            System.out.println("Total price: RM" + twodecimalplace.format(rentalArr[i].FindPrice(datedifferentdays)) + "\n");
        }

        //CALCULATE HOW MANY ROOM ARE BOOKED
        int countstandard = 0;
        int countdeluxe = 0;
        int countsuperior = 0;

        //COUNT BY USING FOR LOOP
        for (int i = 0; i < rentalArr.length; i++) {
            if (rentalArr[i].getRoomType().equalsIgnoreCase("Standard")) {
                countstandard = countstandard + rentalArr[i].getQuantityRoom();
            } else if (rentalArr[i].getRoomType().equalsIgnoreCase("Deluxe")) {
                countdeluxe = countdeluxe + rentalArr[i].getQuantityRoom();
            } else if (rentalArr[i].getRoomType().equalsIgnoreCase("Superior")) {
                countsuperior = countsuperior + rentalArr[i].getQuantityRoom();
            }
        }

        //DISPLAY ALL BOOKED ROOM COUNTED
        System.out.println("***Number of Room Rental for each type***");
        System.out.println("Standard: " + countstandard);
        System.out.println("Deluxe: " + countdeluxe);
        System.out.println("Superior: " + countsuperior);

        System.out.println(); //SPACER

        //FIND CUSTOMER NAMED SITI AND CHANGE CUSTOMER ROOM RENTAL TYPE DATA
        //USING FOR LOOP
        String findname = "Siti";
        String newroomtype = "Superior";
        String oldroomtype = "Standard";
        int countcheck = 0;
        for (int i = 0; i < rentalArr.length; i++) {
            if ((rentalArr[i].getCustomerName().equalsIgnoreCase(findname)) && (rentalArr[i].getRoomType().equalsIgnoreCase(oldroomtype))) {
                rentalArr[i].setRoomType(newroomtype);
                //AFTER DATA UPDATE. DISPLAY NEW CUSTOMER DATA
                int datedifferentdays = rentalArr[i].CalculateDays();
                System.out.println("==New Customer " + (i + 1) + " data==");
                System.out.println(rentalArr[i].toString());
                System.out.println("Days: " + datedifferentdays);
                //DISPLAY FOR DISCOUNT IF MORE THAN TWO DAYS
                if (datedifferentdays > 2) {
                    System.out.println("Discount (More than 2 days): RM -" + twodecimalplace.format((rentalArr[i].FindPrice(datedifferentdays) * 0.05)));
                } else {
                    System.out.println("Discount: No discount");
                }
                System.out.println("Total price: RM" + twodecimalplace.format(rentalArr[i].FindPrice(datedifferentdays)) + "\n");
            } else {
                countcheck++;
            }

            //DISPLAY MESSAGE IF NO DATA FOUND AFTER EVERY OBJECT ARRAY CHECK
            if (countcheck == rentalArr.length) {
                System.out.println("Customer named " + findname + " or room rental selected is "+oldroomtype+" not found. No data changes.");
            }
        }
    }
}
