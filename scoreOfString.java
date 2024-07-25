package Easy;
public class scoreOfString {
    public static int scoreOfString(String s) {
        int score = 0;

        for(int i=0; i<s.length()-1; i++) {   
               int first = s.charAt(i);
               int second = s.charAt(i+1);

                score +=  Math.abs(first - second);   
        }                
        return score;
    }

    public static void main(String[] args) {
        String s = "zaz";
        System.out.println(scoreOfString(s));
    }
}

