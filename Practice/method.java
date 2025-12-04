package Practice;

public class method {
    public static void main(String[] args){
        String name = "Phu";
        int age = 18;
        
        happyBirthDay(name, age);   

    }

    static void happyBirthDay(String name, int age){
        System.out.println("Happy birthday to you!");
        System.out.println("Happy birthday to you!");
        System.out.printf("Happy birthday dear %s\n", name);
        System.out.printf("You are %d now\n", age);
    }
}
