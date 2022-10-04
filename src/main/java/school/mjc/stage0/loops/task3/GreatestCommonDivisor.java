package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int result = Math.min(first,second);
        if (first==second){
            System.out.println(second);
        }else if(first==0 || second==0){
            System.out.println(Math.max(first,second));
        }else {
            while (result>0){
                if (first%result==0 && second%result==0){
                    break;
                }
                result--;
            }
            System.out.println(result);
        }
    }
}
