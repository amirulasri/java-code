package main;

import java.util.Scanner;

/**
 *
 * @author amirul asri
 */
public class TestStudentArray {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        student [] studarray = new student[5];
        String stud_name = null;
        String id_number = null;
        double cgpa = 0;
        String course_name = null;
        
        for(int i = 0; i < studarray.length; i++){
            studarray[i] = new student();
            System.out.println("-------------------------");
            System.out.print("Enter student "+ (i+1) +" name: ");
            stud_name = userinput.nextLine();
            System.out.print("Enter student "+ (i+1) +" id: ");
            userinput.next();
            System.out.print("Enter student "+ (i+1) +" CGPA: ");
            cgpa = userinput.nextDouble();
            userinput.nextLine();
            System.out.print("Enter student "+ (i+1) +" course name: ");
            course_name = userinput.nextLine();
            studarray[i].setallstudentdata(stud_name, id_number, cgpa, course_name);
        }
        
        System.out.println("\n\n----Stored student data----");
        for(int i = 0; i < studarray.length; i++){
            System.out.println("********");
            System.out.println(studarray[i].toString());
        }
        
        System.out.println("\n\nStudent who have CGPA more than 2.50");
        for(int i = 0; i < studarray.length; i++){
            if(studarray[i].getcgpa() >= 2.50){
                System.out.println("********");
                System.out.println("Student name: " + studarray[i].getstudname());
                System.out.println("Course name: " + studarray[i].getcoursename());
            }
        }
        
        int failcount = 0;
        System.out.println("\n\nList of student (fail)");
        for(int i = 0; i < studarray.length; i++){
            if(studarray[i].FindStatus(studarray[i].getcgpa()).equalsIgnoreCase("FAIL")){
                System.out.println("********");
                System.out.println("Student name: " + studarray[i].getstudname());
                System.out.println("Course name: " + studarray[i].getcoursename());
            }
        }
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
