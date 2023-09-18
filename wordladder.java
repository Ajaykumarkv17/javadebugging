import java.util.*;
import java.util.Queue;
public class wordladder {
    static public int wordLadderLength(String startWord, String targetWord, String[] wordList) {
        // Creating a queue ds of type {word,transitions to reach ‘word’}.
        Queue<Pair>q=new LinkedList<>();
        Set<String>s=new HashSet<>();
        for(int i=0;i<wordList.length;i++){
            s.add(wordList[i]);
        }
        q.add(new Pair(startWord, 1));
        s.remove(startWord);

        while(!q.isEmpty()){
           String word=q.peek().first;
           int steps=q.peek().second;
           q.remove();
           if(word.equals(targetWord)==true)
            {
                return steps;
            }
           for(int i=0;i<word.length();i++){
            for(char ch='a';ch<='z';ch++){
                char[] rep=word.toCharArray();
                rep[i]=ch;
                String ne=new String(rep);
                if(s.contains(ne)){
                q.add(new Pair(ne,steps+1));
            }
            }
           

           }


        }

        // Push all values of wordList into a set
        // to make deletion from it easier and in less time complexity.
        return 0;
    }
    public static void main(String[] args)  {
        String startWord = "der", targetWord = "dfs";
        String[] wordList = {
            "des",
            "der",
            "dfr",
            "dgt",
            "dfs"
        };

        
        int ans = wordLadderLength(startWord, targetWord, wordList);

        System.out.print(ans);

        System.out.println();
    }
}
class Pair {
    String first;
    int second;
    Pair(String _first, int _second) {
        this.first = _first;
        this.second = _second;
    }
}