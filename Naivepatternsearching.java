package strings;

public class Naivepatternsearching {
    static void naiveSearching(String text,String pattern)
    {
        int n=text.length(),m=pattern.length();
        for (int i=0;i<=n-m;i++)
        {int j;
            for ( j=0;j<m;j++)
            {
                if(pattern.charAt(j)!=text.charAt(j+i))
                    break;
            }
            if(j==m)
                System.out.println(i);
        }
    }
    public static void main(String[] args) {
        String s1="abcabcd";
        String s2="abcd";
        naiveSearching(s1,s2);
    }
}
