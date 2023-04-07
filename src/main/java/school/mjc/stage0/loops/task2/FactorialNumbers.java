package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int count=1;
        int res=count;
        if (printToInclusive==0){
            System.out.println(1);
        }
        if (printToInclusive>0){
            System.out.println(1);
            while (count<=printToInclusive){
                res*=count;
                System.out.println(res);
                count++;
            }
        }
    }
}
