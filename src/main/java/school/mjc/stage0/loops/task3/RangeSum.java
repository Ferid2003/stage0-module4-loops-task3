package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        for (int sum = 0; firstBoarder<=secondBoarder; firstBoarder++){
            sum+=firstBoarder;
            if (firstBoarder==secondBoarder){
                System.out.println(sum);
            }

        }

    }

}
