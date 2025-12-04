package Projects;
import java.util.Scanner;
public class banking {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        double balance = 0;
        
        while (isRunning) {
            showOption();
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 4){
                isRunning = false;
            }  
            balance = manageChoice(choice, balance, scanner);  

        }
        System.out.println("Exit the program");
        scanner.close();
    }
    static void showOption(){
        System.out.println("1. Show Balance");
        System.out.println("2. Deposite");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    static double manageChoice(int choice, double balance, Scanner scanner){
        switch (choice) {
            case 1:
                System.out.printf("You have %.2f in your bank account\n", balance);
                break;
            case 2:
                System.out.println("Enter the amount you want to deposit: ");
                double depo = scanner.nextDouble();
                scanner.nextLine();
                balance += depo;
                System.out.println("You've already deposited successfully");
                break;
            case 3:
                System.out.println("Enter the amount you want to deposit: ");
                double withdrawal = scanner.nextDouble();
                scanner.nextLine();
                if (withdrawal < balance){
                    balance -= withdrawal;
                    System.out.println("You've already withdrew successfully");
                }
                else{System.out.println("Cannot withdraw the amount of money that is larger than the total in your account");}
                
                break;
            default:
                break;
        }
        return balance;
    }
}
