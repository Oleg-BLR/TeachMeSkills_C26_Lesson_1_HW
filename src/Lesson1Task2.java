public class Lesson1Task2 {

    public static void main(String[] args) {

        int a = 123;
        int digitsSum = 0;
        int ost;

        while (a > 0) {
            ost = a % 10;
            digitsSum = digitsSum + ost;
            a = a / 10;
        }
        System.out.println("Сумма цифр числа а = " + digitsSum);
    }
}
