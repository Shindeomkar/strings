package strings;

public class Checkifstringsarerotational {
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
                System.out.println("yes strings are rotational");
        }
    }
    public static void main(String[] args) {
        String s1="abcd";
        String s2="cdab";
        String s3=s1+s1;
        naiveSearching(s3,s2);
    }
}

