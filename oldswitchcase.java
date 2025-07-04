import java.util.Scanner;

public class oldswitchcase {
    // in old switch case we are not able to use strings for the expressions 
    // and we are not able to use many cases in one case 
    // and also the line of code was incresing 
    // and also use always break after every case .  
    //now we seeing old switch case 
    public static void main(String args[]){
        System.out.println("\nMenu\n1.Monday\n2.Tuesday\n3.Wednesday\n4.Thursday\n5.Friday\n6.Saturday\n7.Sunday\n");

        Scanner op = new Scanner(System.in);
        System.out.println("\nEnter the choice : ");

        int num = op.nextInt();

        switch(num){
            case 1:
                System.out.println("\nToday is working day so get up in early morning do your all work properly.Hope you have good day !");
                break;
            case 2:
                System.out.println("\nToday is working day so get up in early morning do your all work properly.Hope you have good day !");
                break;
            case 3:
                System.out.println("\nToday is working day so get up in early morning do your all work properly.Hope you have good day !");
                break;
            case 4:
                System.out.println("\nToday is working day so get up in early morning do your all work properly.Hope you have good day !");
                break;
            case 5:
                System.out.println("\nToday is working day so get up in early morning do your all work properly.Hope you have good day !");
                break;
            case 6:
                System.out.println("\nToday is holiday do your all kind of work properly and do not forgot to exercise and don not eat oily food outside !");
                break;
            case 7:
                System.out.println("\nToday is holiday do your all kind of work properly and do not forgot to exercise and don not eat oily food outside !");
                break;
           default:
                System.out.println("\nYou Entered invalid choice ! ");
        }

    }    
}
