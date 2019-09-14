import java.util.TreeSet;

public class ￥804Unique_morse_code_words {
    public int uniqueMorseRepresentations(String[] words) {
        String[] arr = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        TreeSet set = new TreeSet();
        for(String word:words){
            StringBuffer sbr = new StringBuffer();
            for(int j=0;j<word.length();j++){
                sbr.append(arr[word.charAt(j)-'a']);
            }
            set.add(sbr.toString());
        }
        return set.size();

    }
}
