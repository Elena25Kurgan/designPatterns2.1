public class Main {

    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println("Сумма чисел 2 и 2 равно " + calc.sum(2,2));
        System.out.println("Произведение чисел 10 и 22 равно " + calc.mult(10,22));
        System.out.println("2 в степени 10 равно " + calc.pow(2,10));

    }
}
