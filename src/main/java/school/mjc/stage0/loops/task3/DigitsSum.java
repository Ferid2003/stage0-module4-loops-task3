package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        int sum = 0;
        while (t != 0) {
            sum = sum + t % 10;
            t /= 10;
        }
        if (sum < 0) {
            System.out.println(-sum);
        } else {
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        DigitsSum digitsSum = new DigitsSum();
        digitsSum.printDigitsSum(123);
    }
}
