
import java.util.*;

  class Main {
    public static void main(String[] args) {
      
      Scanner scan = new Scanner(System.in);
      double temp;
      int choice;
      System.out.println("Welcome to my Temperature and Weight Converter Calcuator ! ");
      while (true) {
        
        System.out.println("1. Conversion from Celcius to Farenheit");
        System.out.println("2. Conversion from Farenheit to Celcius");
        System.out.println("3. Conversion from Celcius to Kelvin");
        System.out.println("4. Conversion from Kelvin to Celcius");
        System.out.println("5. Conversion from Farenheit to Kelvin");
        System.out.println("6. Conversion from Kelvin to Farenheit");
        System.out.println("7. Conversion from Kilograms to Pounds");
        System.out.println("8. Conversion from Pounds to Kilograms");
        System.out.println("9. Conversion from Kilograms to Stones");
        System.out.println("10. Conversion from Stones to Kilograms");
        System.out.println("11.Conversion from Kilograms to Ounces");
        System.out.println("12.Conversion from Ounces to Kilograms");
        System.out.println("13.Conversion from Pounds to Stones");
        System.out.println("14.Conversion from Stones to Pounds");
        System.out.println("15.Conversion from Pounds to Ounces");
        System.out.println("16.Conversion from Ounces to Pounds");
        System.out.println("17. Conversion from Stones to Ounces");
        System.out.println("18. Conversion from Ounces to Stones");
        
        System.out.println("19. Exit");
        System.out.println("\n * * * * * * * *\n");
        System.out.println("Choose number conversion type: ");
        choice = scan.nextInt();
        switch (choice) {
  
          case 1:
            System.out.println("Enter temperature to Convert: ");
            temp = scan.nextDouble();
            System.out.println(temp + " Celcius equals " + (((temp * 9.0 / 5.0)) + 32) + " Farenheit Degrees\n");
            break;
          case 2:
            System.out.println("Enter temperature to Convert: ");
            temp = scan.nextDouble();
            System.out.println(temp + " Farenheit equals " + ((temp - 32) * 5 / 9) + " Celcius Degrees\n");
            break;
          case 3:
            System.out.println("Enter temperature to Convert: ");
            temp = scan.nextDouble();
            System.out.println(temp + " Celcius equals " + (temp + 273.15) + " Kevin Degrees\n");
            break;
          case 4:
            System.out.println("Enter temperature to Convert: ");
            temp = scan.nextDouble();
            System.out.println(temp + " Kelvin equals " + (temp - 273.15) + " Celcius Degrees\n");
            break;
          case 5:
            System.out.println("Enter temperature to Convert: ");
            temp = scan.nextDouble();
            System.out.println(temp + " Kelvin equals " + ((temp - 32) * 5 / 9 + 273.15) + " Farenheit Degrees\n");
            break;
          case 6:
            System.out.println("Enter temperature to Convert: ");
            temp = scan.nextDouble();
            System.out.println(temp + " Farenheit equals " + (((temp - 273.15) * 9 / 5) + 32) + " Kelvin Degrees\n");
            break;
          case 7:
            System.out.println("Enter weight to Convert: ");
            temp = scan.nextDouble();
            System.out.println(temp + " Kilogram equals " + temp*2.20462 + " Pounds\n");
            break;
          case 8:
            System.out.println("Enter weight to Convert: ");
            temp = scan.nextDouble();
            System.out.println(temp + " Pounds equals " + temp*0.453592 + " Kilograms\n");
            break;
          case 9:
            System.out.println("Enter weight to Convert: ");
            temp = scan.nextDouble();
            System.out.println(temp + " Kilogram equals " + temp*0.157473 + " Stones\n");
            break;
          case 10:
            System.out.println("Enter weight to Convert: ");
            temp = scan.nextDouble();
            System.out.println(temp + " Stones equals " + temp*6.35029318 + " Kilograms\n");
            break;
          case 11:
            System.out.println("Enter weight to Convert: ");
            temp = scan.nextDouble();
            System.out.println(temp + " Kilogram equals " + temp*35.27396 + " Ounces\n");
            break;
          case 12:
            System.out.println("Enter weight to Convert: ");
            temp = scan.nextDouble();
            System.out.println(temp + " Ounces equals " + temp*0.0283495 + " Kilograms\n");
            break;
          case 13:
            System.out.println("Enter weight to Convert: ");
            temp = scan.nextDouble();
            System.out.println(temp + " Pounds equals " + temp*0.0714286 + " Stones\n");
            break;
          case 14:
            System.out.println("Enter weight to Convert: ");
            temp = scan.nextDouble();
            System.out.println(temp + " Stones equals " + temp*14 + " Pounds\n");
            break;
          case 15:
            System.out.println("Enter weight to Convert: ");
            temp = scan.nextDouble();
            System.out.println(temp + " Pounds equals " + temp*16 + " Ounces\n");
            break;
          case 16:
            System.out.println("Enter weight to Convert: ");
            temp = scan.nextDouble();
            System.out.println(temp + " Ounces equals " + temp*0.0625 + " Pounds\n");
            break;
          case 17:
            System.out.println("Enter weight to Convert: ");
            temp = scan.nextDouble();
            System.out.println(temp + " Stones equals " + temp*224 + " Ounces\n");
            break;
          case 18:
            System.out.println("Enter weight to Convert: ");
            temp = scan.nextDouble();
            System.out.println(temp + " Ounces equals " + temp*0.00446429 + " Stones\n");
            break;
          case 19:
            System.out.println("Thank you for choosing our Temperature Converter !\n");
            
            System.exit(0);
          default:
            System.out.println("Default choice please choose between 1-19 only !\n");
            break;
  
        }
      }
    }
  
  
}
