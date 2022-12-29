import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        s=s.trim();
        String token[]=s.split("[^a-zA-Z]+");
        if(s.length()==0)
            System.out.println(0);
        
        else
        System.out.println(token.length);
        for(String word:token)
        System.out.println(word);
        scan.close();
    }
}
