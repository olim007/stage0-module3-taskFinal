package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public  void calculateSum(int number) {
        int a = number / 1000;
        int b = number % 1000 / 100;
        int c = number % 100 / 10;
        int d = number % 10;
        System.out.println(a + b + c + d);
    }
}
