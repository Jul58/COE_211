import java.util.Scanner;
public class EntryPoint{
	public static void main(String[] args){
		String BasicWeek;
		String AdvancedWeek ;	
		String Calculator;	
		String Employee;
		int num;
	
  	   Scanner scan=new Scanner(System.in);
	
		System.out.println("Which service would you like to use: \n"+"[1]: BasicWeek\n"+"[2]: AdvancedWeek\n"+"[3]: Calculator\n"+"[4]: Employee");
		num=scan.nextInt();
	
		
		switch(num) {
		
			case 1: BasicWeek b = new BasicWeek();
				b.printDays();
					break;
			case 2: AdvancedWeek a = new AdvancedWeek();
				a.printDays();
					break;
			case 3: Calculator c = new Calculator();
					break;
			case 4: Employee e = new Employee();
			       System.out.println(e.toString());
					break;
			default: System.out.println("Please make sure you pick a number between 1 and 4");
						
						
		
	}
 }
}

		