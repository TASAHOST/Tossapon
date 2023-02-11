package F;
import java.time.LocalDate;
import java.time.Period;
public class IDCard {
	//attribute
	private static String name;
	private static String dob;
	private static String id;
	private static String addr;
	
	

	public IDCard() {
		name = "tossapon nilpech";
		dob ="";
		id ="1217633885744";
		addr="123/13";
		
	}
	
	
	
	
	public static void display() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(addr);
		//return 1;
	}
	
	public static void displayAge() {
		LocalDate dob = LocalDate.of(2002, 05, 15);
		LocalDate Curtime = LocalDate.now();
		Period period = Period.between(dob, Curtime);
		System.out.printf("age %d years",period.getYears());
		
		//return 1;
	}
	
}
