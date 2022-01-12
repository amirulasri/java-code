package main;
import java.util.Scanner;
/**
 *
 * @author amirul asri
 */
public class TestStaff {
    public static void main(String[] args) {
        staff staff1 = new staff();
        staff1.setallstaffdata("Muhamad Fakhri", 2215, "Finance", "Executive", 4500.0);
        System.out.println("First value set (staff 1): ");
        System.out.println(staff1.toString());
        System.out.println("");
        
        staff staff2 = new staff();
        staff2.setallstaffdata("Siti Saleha", 2432, "Marketing", "Administrator", 3500.0);
        System.out.println("First value set (staff 2): ");
        System.out.println(staff2.toString());
        System.out.println("");
        
        staff1.setsalary(5200.00);
        System.out.println("After staff salary set to 5200.00 (staff 1): ");
        System.out.println(staff1.toString());
        System.out.println("");
        
        staff2.setposition("senior administrator");
        System.out.println("After staff position set to senior administrator (staff 2): ");
        System.out.println(staff2.toString());
        System.out.println("");
        
        staff staff3 = new staff();
        String user_staff_name;
        int user_staff_id;
        String user_department;
        String user_position;
        double user_salary;
        Scanner userinput = new Scanner(System.in);
        System.out.print("Enter staff name: ");
        user_staff_name = userinput.nextLine();
        System.out.print("Enter staff id: ");
        user_staff_id = userinput.nextInt();
        userinput.nextLine();
        System.out.print("Enter staff department: ");
        user_department = userinput.nextLine();
        System.out.print("Enter staff position: ");
        user_position = userinput.nextLine();
        System.out.print("Enter staff salary: ");
        user_salary = userinput.nextDouble();
        staff3.setallstaffdata(user_staff_name, user_staff_id, user_department, user_position, user_salary);
        System.out.println("Show data entered by user (staff 3)");
        System.out.println("");
        System.out.println(staff3.toString());
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