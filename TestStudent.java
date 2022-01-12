package main;

import java.util.Scanner;

/**
 *
 * @author amirul asri
 */
public class TestStudent {
    public static void main(String[] args) {
        student stud1 = new student();
        stud1.setallstudentdata ("Muhamad Ibrahim", "COV12323232", 3.32, "Computer Science");
        System.out.println("");
        System.out.println("First value set (student 1): ");
        System.out.println(stud1.toString());
        System.out.println("Status: " + stud1.FindStatus(stud1.getcgpa()));
        
        student stud2 = new student();
        stud2.setallstudentdata("Farhana Salleh", "COV141242141", 2.85, "Accounting");
        System.out.println("");
        System.out.println("First value set (student 2): ");
        System.out.println(stud2.toString());
        System.out.println("Status: " + stud2.FindStatus(stud2.getcgpa()));
        
        stud1.setcgpa(2.8);
        System.out.println("");
        System.out.println("After CGPA value set to 2.8 (student 1): ");
        System.out.println(stud1.toString());
        System.out.println("Status: " + stud1.FindStatus(stud1.getcgpa()));
        
        stud2.setcgpa(1.5);
        System.out.println("");
        System.out.println("After CGPA value set to 1.5 (student 2): ");
        System.out.println(stud1.toString());
        System.out.println("Status: " + stud2.FindStatus(stud2.getcgpa()));
        
        student stud3 = new student();
        String user_stud_name;
        String user_id_number;
        double user_cgpa;
        String user_course_name;
        
        Scanner userinput = new Scanner(System.in);
        
        System.out.print("\nEnter student name: ");
        user_stud_name = userinput.nextLine();
        System.out.print("Enter student ID number: ");
        user_id_number = userinput.next();
        System.out.print("Enter student CGPA: ");
        user_cgpa = userinput.nextDouble();
        System.out.print("Enter student course name: ");
        userinput.nextLine();
        user_course_name = userinput.nextLine();
        stud3.setallstudentdata(user_stud_name, user_id_number, user_cgpa, user_course_name);
        System.out.println("Show data entered by user (staff 3)");
        System.out.println("");
        System.out.println(stud3.toString());
        System.out.println("Status: " + stud3.FindStatus(stud3.getcgpa()));
    }
}

class student{
    private String stud_name = null;
    private String id_number = null;
    private double cgpa = 0;
    private String course_name = null;
    
    //MUTATORS
    public void setallstudentdata(String stud_name, String id_number, double cgpa, String course_name){
        this.stud_name = stud_name;
        this.id_number = id_number;
        this.cgpa = cgpa;
        this.course_name = course_name;
    }
    
    //EACH MUTATORS
    public void setstudname(String stud_name){
        this.stud_name = stud_name;
    }
    
    public void setidnumber(String id_number){
        this.id_number = id_number;
    }
    
    public void setcgpa(double cgpa){
        this.cgpa = cgpa;
    }
    
    public void setcoursename(String course_name){
        this.course_name = course_name;
    }
    
    //ACCESSOR
    
    public String getstudname(){
        return stud_name;
    }
    
    public String getidnumber(){
        return id_number;
    }
    
    public double getcgpa(){
        return cgpa;
    }
    
    public String getcoursename(){
        return course_name;
    }
    
    //PROCESSOR
    public String FindStatus(double cgpa){
        String categorystatus = null;
        if(cgpa  >= 2.00){
            categorystatus = "PASS";
        }else if((cgpa < 2.00) && (cgpa >= 1.8)){
            categorystatus = "PROBITION";
        }else if(cgpa < 1.8){
            categorystatus = "FAIL";
        }
        return categorystatus;
    }
    
    
    @Override
    public String toString(){
        return "Student name: " + stud_name + "\nID number: " + id_number + "\nCGPA: " + cgpa + "\nCourse name: " + course_name;
    }
}
