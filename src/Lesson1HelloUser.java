import java.util.Scanner;

public class Lesson1HelloUser {

    public static void main(String[] args) {
        System.out.println("Введите Ваше имя ");
        Scanner inputName = new Scanner(System.in);
        String name  = inputName.nextLine();
        System.out.println("Hello, " + name +"!");
    }

}
