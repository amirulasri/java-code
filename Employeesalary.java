package employeesalary;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author amirul asri
 */
public class Employeesalary {
    
    public static double calcIncrement(double salary, int yearofservice){
        double newsalary = 0;
        if(yearofservice >= 10){
            newsalary = (salary * 0.04) + salary;
        }else if ((yearofservice >= 4) && (yearofservice <= 9)){
            newsalary = (salary * 0.025) + salary;
        }else if ((yearofservice >=1) && (yearofservice <= 3)){
            newsalary = (salary * 0.02) + salary;
        }
        return newsalary;
    }
    
    public static void printReport(String name, int yearofservice, double salary, double newsalary){
        DecimalFormat f = new DecimalFormat("##.00");
        System.out.println("\n=====================================");
        System.out.println("            2NE1 Company");
        System.out.println("=====================================");
        
        System.out.println("Name              : " + name);
        System.out.println("Year of Service   : " + yearofservice);
        System.out.println("Current Salary    : RM" + f.format(salary));
        System.out.println("New Salary        : RM" + f.format(newsalary));
        
    }
    
    public static void main(String[] args) {
        String name;
        int yearofservice;
        double salary;
        double newsalary;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.print("Enter year of service: ");
        yearofservice = input.nextInt();
        System.out.print("Enter your current salary: RM");
        salary = input.nextDouble();
        
        newsalary = calcIncrement(salary, yearofservice);
        printReport(name, yearofservice, salary, newsalary);
        
    }
    
}
