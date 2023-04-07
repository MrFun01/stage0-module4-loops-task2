package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int count=0;
        StringBuilder res= new StringBuilder();
        while (count<chars.length){
            res.append(chars[count]);
            count++;
        }
        System.out.print(res);
    }
}
