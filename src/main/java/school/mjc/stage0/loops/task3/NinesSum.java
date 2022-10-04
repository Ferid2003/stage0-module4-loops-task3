package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        String nine = "9";
        int sum = 0;
        for (int i = 1; i<=lengthOfLastNumber; i++){
            int a = Integer.valueOf(nine.repeat(i));
            sum+=a;
        }
        System.out.println(sum);
    }


}
