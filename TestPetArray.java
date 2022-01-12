package main;

import java.util.Scanner;

/**
 *
 * @author amirul asri
 */
public class TestPetArray {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        String name = null;
        String animal_type = null;
        int age = 0;
        pet [] petarray = new pet[5];
        for(int i = 0; i < petarray.length; i++){
            petarray[i] = new pet();
            System.out.println("-------------------------");
            System.out.print("Enter pet "+ (i+1) +" name: ");
            name = userinput.nextLine();
            System.out.print("Enter animal type "+ (i+1) +": ");
            animal_type = userinput.nextLine();
            System.out.print("Enter pet "+ (i+1) +" age: ");
            age = userinput.nextInt();
            userinput.nextLine();
            
            petarray[i].setallpetdata(name, animal_type, age);
        }
        
        System.out.println("\n\n----Stored pet data----");
        for(int i = 0; i < petarray.length; i++){
            System.out.println("********");
            System.out.println(petarray[i].toString());
        }
        
        int catcount = 0;
        for(int i = 0; i < petarray.length; i++){
            if(petarray[i].getanimaltype().equalsIgnoreCase("cat")){
                catcount = catcount + 1;
            }
        }
        
        System.out.println("\n\nThe number of cat (pet type): " + catcount);
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