package Practice;
import java.util.Random;
public class math {
    public static void main(String[] args){
        Random random = new Random();
        int number; 

        number = random.nextInt(1, 7);
        System.out.println("Your randon number is: " + number);
        
        boolean ishead = random.nextBoolean();

        if (ishead){
            System.out.println("head");
        }
        else{
            System.out.println("Tails");
        }

    }
    
}
    