package JavaApp;
import java.util.Scanner;
import java.lang.Math;
public class BMIcalcuator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        calcuateBMI();
    }
    public static void calcuateBMI() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your height (meters):");
        double height = scan.nextDouble();

        System.out.print("Please enter your weight (kilogram):");
        double weight = scan.nextDouble();

         double BMI = weight/ Math.pow(height, 2);

       System.out.println("Your BMI :"+" "+BMI);
       if(BMI>0 && BMI<18.4){
           System.out.println("You are slim");
       }
       else if(BMI>18.5 && BMI<24.9){
           System.out.println("Your body is healty");
       }
       else if(BMI>25 && BMI<29.9){
           System.out.println("You have little weight");
       }
       else if(BMI>30 && BMI<34.9){
           System.out.println("You are fat");
       }
       else if(BMI>35 && BMI<44.9){
           System.out.println("You are so fat");
       }
       else if(BMI>45){
           System.out.println("You are like an butter");
       }

    }
}
