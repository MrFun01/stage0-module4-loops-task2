package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int count=0;
        int convertToPositive=Math.abs(multiplyByAndToInclusive);
        if (multiplyByAndToInclusive!=0){
            while (count<=multiplyByAndToInclusive){
                System.out.println(count*multiplyByAndToInclusive);
                count++;
            }
            while (count<=convertToPositive){
                System.out.println(count*multiplyByAndToInclusive);
                count++;
            }
        }



    }
}
