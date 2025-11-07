
import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your wins: ");
            int userWins = scanner.nextInt();
            System.out.print("Enter your losses: ");
            int userLosses = scanner.nextInt();
            int userResults = calculatorRank(userWins, userLosses);
            String rank = getRank(userResults);

           System.out.println("User Rankeds Results: " + userResults);

           scanner.close();
}
    public static int calculatorRank(int wins, int losses) {
        return wins - losses;
    }
    public static String getRank(int results) {
        if (results <= 10) {
            return "Iron";
        } else if (results <= 20) {
            return "Bronze";
        } else if (results <= 30) {
            return "Silver";
        } else if (results <= 40) {
            return "Gold";
        } else if (results <= 50) {
            return "Platinum";
        } else if (results <= 60) {
            return "Diamond";
        } else if (results <= 70) {
            return "Master";
        } else if (results <= 80) {
            return "Grandmaster";
        } else if (results <= 90) {
            return "Challenger";
        } else {
            return "Demon";
    }
}
