package print_a_calendar;
import java.util.*;

public class print_calendar {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		System.out.println("How many days are in the month?");
		int days = s.nextInt();
		System.out.println("What is the starting day of the month?"); 
		int start = s.nextInt();
		
		
		
		String [] answer = new String[7];
		answer[0] = "Sun"; answer[1] = "Mon"; answer[2] = "Tue"; answer[3] = "Wed"; answer[4] = "Th"; answer[5] = "Fri"; answer[6] = "Sat"; 
		
		//actual program
		for(int i = 0; i < answer.length; i++) {
			System.out.printf("%7s",  answer[i]); 
		}
		System.out.println(); 
		int place = start;
		for(int i = 0; i < place; i++) {
			System.out.printf("%7s", " "); 
		}
		System.out.printf("%7s", 1); 
		place ++; 
		for(int i = 2; i <= days; i++) {
			if(place%7 == 0) {
				place = 0;
				System.out.println();
			}
			System.out.printf("%7s", i);
			place++; 
		}
	}
	
	

}
