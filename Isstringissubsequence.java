package strings;

public class Isstringissubsequence {
    static boolean isSubSequence(String s1,String s2)
    {
        int j=0;
        for (int i=0;i<s1.length()-1 && j<s2.length()-1;i++)
        {
            if(s2.charAt(j)==s1.charAt(i))
                j++;
        }
        return (j==s2.length()-1);
    }
    public static void main(String[] args) {
        String s1="abcd";
        String s2="ad";
        if(isSubSequence(s1,s2))
            System.out.println("string s2 is subsequence of s1");
        else
            System.out.println("is not subsequence");
    }
}
