package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int count=1;
        int prime;
        int divisible;
        while (count<printToInclusive){
            prime=2;
            divisible=0;
            while (prime<=count/2){
                if (count%prime==0){
                    divisible++;
                    break;
                }
                prime++;
            }
            if (divisible==0&&count!=1){
                System.out.println(count);
            }
            count++;
        }
    }
}
