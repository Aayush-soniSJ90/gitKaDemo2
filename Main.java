public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Addition " + Calculator.add(10, 56));
        System.out.println("Interest "+ InterestCalculator.calculate(10000000,9, 5));
        System.out.println("SIP Return " + SIPCalculator.calculate(10000, 12, 12, 20));
    }
}
