package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int first = 1;
        int second = 1;
        System.out.println(0);
        while (second<lastFibonacci && first<lastFibonacci){
            System.out.println(first);
            System.out.println(second);
            first=first+second;
            second+=first;
        }
    }

}
