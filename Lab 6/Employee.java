import java.util.Scanner;
public class Employee {
    
     private String firstName;
     private String lastName;
     private int age;
     private double salary;

   public Employee() { 
        Scanner scan = new Scanner(System.in);

        Employee(String first, String last, int old, double money){
        firstName = first;
        lastName = last;
        age = old;
        salary = money;
}
    public String toString() {
