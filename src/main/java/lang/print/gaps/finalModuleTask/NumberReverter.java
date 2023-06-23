package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int a = number % 10;
        int b = (number / 10) % 10;
        int c = number / 100;
        int x = a * 100 + b * 10 + c;
        System.out.println(x);
    }
}
