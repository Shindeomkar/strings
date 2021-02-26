package strings;

public class Anagramintext {
    static boolean isAnagram(String s1,String s2)
    {
        int count1[]=new int[26];
        int count2[]=new int[26];
        for (int i=0;i<s1.length();i++)
            count1[s1.charAt(i)-'a']++;
        for (int i=0;i<s2.length();i++)
            count2[s2.charAt(i)-'a']++;
        for (int i=0;i<26;i++)
            if (count1[i]!=count2[i])
                return false;
        return true;
    }
    static boolean isanagramintext(String s1,String s2)
    {
        int n=s1.length(),m=s2.length();
        for (int i=0;i<=n-m;i++)
        {
            if(isAnagram(s2,s1.substring(i,m)))
                return true;
            m++;

        }
        return false;
    }

    public static void main(String[] args) {
        String s1="geeksforgeeks";
        String s2="skof";
        if (isanagramintext(s1,s2))
            System.out.println("anagram present");
        else
            System.out.println("anagram not present");
    }
}
