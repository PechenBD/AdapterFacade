public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println(calc.sum(5, 7));
        System.out.println(calc.mult(3, 8));
        System.out.println(calc.pow(3, 4));
    }
}