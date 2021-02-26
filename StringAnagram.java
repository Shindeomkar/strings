package strings;

import java.util.Scanner;

public class StringAnagram {
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
    public static void main(String[] args) {
        System.out.println("enter the srring s1");
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        System.out.println("enter the string s2");
        String s2= sc.nextLine();
        if(isAnagram(s1,s2))
            System.out.println("is anagram");
        else
            System.out.println("is not anagram");
    }
}
