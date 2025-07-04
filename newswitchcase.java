import java.util.Scanner;

public class newswitchcase {
    
    public static void main(String args[]){
        System.out.println("\nMenu\nMonday\nTuesday\nWednesday\nThursday\nFriday\nSaturday\nSunday\n");
        
        Scanner op = new Scanner(System.in);
        
        System.out.println("\nEnter  your choice : ");

        String day = op.nextLine();

        switch(day){
            case "Monday","Tuesday","Wednesday","Thursday","Friday" -> System.out.println("\nToday is working day so get up in early morning do your all work properly.Hope you have good day !");
            
            case "Saturday","Sunday" -> System.out.println("\nToday is holiday do your all kind of work properly and do not forgot to exercise and don not eat oily food outside !");

            default -> System.out.println("\nYou Entered the invalid choice so choice enter the following way !\n first ex : if you want to enter monday so enter 'Monday' like this ok have a good day !");
        }
    }  
}
