
import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your wins: ");
            int userWins = scanner.nextInt();
            System.out.print("Enter your losses: ");
            int userLosses = scanner.nextInt();
            int userResults = userWins - userLosses;

            int tier;
            if(userResults <= 10) tier = 1;
            else if(userResults <= 20) tier = 2;
            else if(userResults <= 50) tier = 3;
            else if(userResults <= 80) tier = 4;
            else if(userResults <= 90) tier = 5;
            else if(userResults <= 100) tier = 6;
            else if(userResults <= 200) tier = 7;
            else if(userResults <= 300) tier = 8;
            else if(userResults <= 400) tier = 9;
            else tier = 10;

            switch(tier) {
                case 1:
                    System.out.println("You are an Iron player.");
                    break;
                case 2:
                    System.out.println("You are a Bronze player.");
                    break;
                case 3:
                    System.out.println("You are a Silver player.");
                    break;
                case 4:
                    System.out.println("You are a Gold player.");
                    break;
                case 5:
                    System.out.println("You are a Platinum player.");
                    break;
                case 6:
                    System.out.println("You are a Diamond player.");
                    break;
                case 7:
                    System.out.println("You are an Ascendant player.");
                    break;
                case 8:
                    System.out.println("You are an Immortal player.");
                    break;
                case 9:
                    System.out.println("You are a Radiant player.");
                    break;
                case 10:
                    System.out.println("You are a Demon player.");
                    break;
            }
    }
    
}
