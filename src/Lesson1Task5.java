public class Lesson1Task5 {

    public static void main(String[] args) {

        int q = 21;
        int w = 8;

        int int_div = q / w;

        int int_mult = w * int_div;
        int rest = q - int_mult;

        System.out.println("Результат целочисленного деления " + q + " на " + w + " равен " + int_div
                + ", остаток " + rest);
    }
}
