package main;
import java.util.Scanner;
/**
 *
 * @author amirul asri
 */
public class TestStaffArray {
    public static void main(String[] args) {
        String staff_name = null;
        int staff_id = 0;
        String department = null;
        String position = null;
        double salary = 0;
        
        Scanner userinput = new Scanner(System.in);
        staff [] staffarray = new staff[5];
        
        for(int i = 0; i < staffarray.length; i++){
            staffarray[i] = new staff();
            System.out.println("-------------------------");
            System.out.print("Enter staff "+ (i+1) +" name: ");
            staff_name = userinput.nextLine();
            System.out.print("Enter staff id "+ (i+1) +": ");
            staff_id = userinput.nextInt();
            userinput.nextLine();
            System.out.print("Enter department "+ (i+1) +": ");
            department = userinput.nextLine();
            System.out.print("Enter position "+ (i+1) +": ");
            position = userinput.nextLine();
            System.out.print("Enter salary "+ (i+1) +": ");
            salary = userinput.nextDouble();
            staffarray[i].setallstaffdata(staff_name, staff_id, department, position, salary);
            userinput.nextLine();
        }
        
        System.out.println("\n\n----Stored staff data----");
        for(int i = 0; i < staffarray.length; i++){
            System.out.println("********");
            System.out.println(staffarray[i].toString());
        }
        
        System.out.println("\n\nStaff who have salary more than 2500.00");
        for(int i = 0; i < staffarray.length; i++){
            if(staffarray[i].getsalary() >= 2500){
                System.out.println("********");
                System.out.println("Staff name: " + staffarray[i].getstaffname());
                System.out.println("Staff department: " + staffarray[i].getdepartment());
            }
        }
    }
}

class staff{
    private String staff_name = null;
    private int staff_id = 0;
    private String department = null;
    private String position = null;
    private double salary = 0;
    
    //MUTATORS
    public void setallstaffdata(String staff_name, int staff_id, String department, String position, double salary){
        this.staff_name = staff_name;
        this.staff_id = staff_id;
        this.department = department;
        this.position = position;
        this.salary = salary;
    }
    
    //EACH MUTATORS
    public void setstaffname(String staff_name){
        this.staff_name = staff_name;
    }
    
    public void setstaffid(int staff_id){
        this.staff_id = staff_id;
    }
    
    public void setdepartment(String department){
        this.department = department;
    }
    
    public void setposition(String position){
        this.position = position;
    }
    
    public void setsalary(double salary){
        this.salary = salary;
    }
    
    //ACCESSOR
    public String getstaffname(){
        return staff_name;
    }
    
    public int getstaffid(){
        return staff_id;
    }
    
    public String getdepartment(){
        return department;
    }
    
    public String getposition(){
        return position;
    }
    
    public double getsalary(){
        return salary;
    }
    
    @Override
    public String toString(){
        return "Staff name: " + staff_name + "\nStaff ID: " + staff_id + "\nDepartment: " + department + "\nPosition: " + position + "\nSalary: RM" + salary;
    }
}