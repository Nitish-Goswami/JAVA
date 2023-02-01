import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        System.out.println("My name is "+name);

        System.out.println("Length is : "+name.length());

        System.out.println("First name : "+name.substring(0,6));

        System.out.println("Second name : "+name.substring(6));

        


        
    }
}
