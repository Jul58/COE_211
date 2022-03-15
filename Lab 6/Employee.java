import java.util.Scanner;
public class Employee {
    
     private String firstName;
     private String lastName;
     private int age;
     private double salary;

   public Employee() { 
        Scanner scan = new Scanner(System.in);
       
        System.out.println("Please enter the employee's first name:");
        firstName = scan.nextLine();
        
        System.out.println("Please enter the employee's last name:");
        lastName = scan.nextLine();
        
        System.out.println("Please enter the employee's age:");
        age = scan.nextInt();
        
        System.out.println("Please enter the employee's salary:");
        salary = scan.nextInt();
}
    public String toString() {
           return "Employee Information: " + firstName +" " + lastName + ", " + age + ", " + salary;
    }
}
 
