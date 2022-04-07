import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Manager {
   public static void main(String[]args) throws IOException {
   try { 
        FileWriter fw = new FileWriter(new File("expenses.text"));
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter outToFile = new PrintWriter(bw);

        String a = "";
        String b = "";
        double c = 0;
        String log;
        String d = "y";
        String f = "y";

        Scanner fileScan = new Scanner(new File("expenses.text"));
        Scanner scan = new Scanner(System.in);

    do {
         
          System.out.println("Input your name");
          a = scan.nextLine();

          System.out.println("What did you purchase?");
          b = scan.nextLine();

          System.out.println("How much did you pay? (in USD)");
          c = scan.nextDouble();
          scan.nextLine();

          outToFile.println(a + " purchased " + b + " for " + c + " US Dollars.");
          fw.close();
          System.out.println("Would you like to log another purchase?(y/n)");
          d = scan.nextLine();
      
          }
            while(d.equalsIgnoreCase("y"));
            System.out.println("Would you like to read a summary of your purchases?(y/n)");
            f = scan.nextLine();
            outToFile.close();
            scan.close();
            
               if(f.equalsIgnoreCase("y")){
                  while(fileScan.hasNext()){
                    log = fileScan.nextLine();
                    System.out.println(log);
               
                        }
            }
            
        } catch (IOException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
             
    }
}
          