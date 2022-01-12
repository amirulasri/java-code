package main;

import java.util.Scanner;

/**
 *
 * @author amirul asri
 */
public class TestPet {
    public static void main(String[] args) {
        pet pet1 = new pet();
        pet1.setallpetdata("blacky", "cat", 2);
        System.out.println("First value set (pet 1): ");
        System.out.println(pet1.toString());
        System.out.println("");
        
        pet1.setpetage(3);
        System.out.println("After pet age set to 3 (pet 1): ");
        System.out.println(pet1.toString());
        System.out.println("");
        
        pet pet2 = new pet();
        pet2.setallpetdata("caca", "rabbit", 3);
        System.out.println("First value set (pet 2): ");
        System.out.println(pet2.toString());
        System.out.println("");
        
        pet2.setpetname("ribbit");
        System.out.println("After pet name set to ribbit (pet 2): ");
        System.out.println(pet2.toString());
        System.out.println("");
        
        pet pet3 = new pet();
        String userpetname;
        String user_animal_type;
        int userpetage;
        Scanner userinput = new Scanner(System.in);
        System.out.print("Enter pet name: ");
        userpetname = userinput.nextLine();
        System.out.print("Enter animal type: ");
        user_animal_type = userinput.nextLine();
        System.out.print("Enter pet age: ");
        userpetage = userinput.nextInt();
        pet3.setallpetdata(userpetname, user_animal_type, userpetage);
        System.out.println("");
        System.out.println("Show data entered by user (pet 3)");
        System.out.println(pet3.toString());
        
    }
}

class pet{
    private String name = "";
    private String animal_type = "";
    private int age = 0;
    
    public void setallpetdata(String n, String at, int a){
        name = n;
        animal_type = at;
        age = a;
    }
    
    public void setpetname(String n){
        name = n;
    }
    
    public void setpetanimalstype(String at){
        animal_type = at;
    }
    
    public void setpetage(int a){
        age = a;
    }
    
    public String getpetname(){
        return name;
    }
    
    public String getanimaltype(){
        return animal_type;
    }
    
    public int getpetage(){
        return age;
    }
    
    @Override
    public String toString(){
        return "The pet name is: " + name + "\nAnimal type: " + animal_type + "\nAge: " + age + " years";
    }
}