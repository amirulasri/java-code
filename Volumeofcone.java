package volumeofcone;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author amirul asri
 */
public class Volumeofcone {
    
    public static double calc(double radius, double height){
        double result;
        result = 0.33 * 3.142 * (radius * radius) * height;
        return result;
    }
    
    public static void disp(double result){
        DecimalFormat f = new DecimalFormat("##.00");
        System.out.println("Volume of Cone is " + f.format(result));
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius, height, result;
        System.out.print("Enter radius: ");
        radius = input.nextDouble();
        System.out.print("Enter height: ");
        height = input.nextDouble();
        result = calc(radius, height);
        disp(result);
    }
}