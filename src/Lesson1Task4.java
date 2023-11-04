public class Lesson1Task4 {

    public static void main(String[] args) {

        double a = 5.5;
        int a_rounded;
        int a_int = (int) a;
        double fract = a - (int) a;
        if (fract >= 0.5) {
            a_rounded = a_int + 1;
        } else {
            a_rounded = a_int;
        }
        System.out.println("Заданное дробное число: " + a);
        System.out.println("Округленное число: " + a_rounded);
    }
}
