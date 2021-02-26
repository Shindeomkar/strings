package strings;

public class Stringpalindrome {
    static boolean palindrome(String s1)
    {
        int i=0;
        int j=s1.length()-1;
        while(i<j)
        {
            if(s1.charAt(i)!=s1.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s1="bagffgab";
        if(palindrome(s1))
        System.out.println("is palindrome");
        else
            System.out.println("is not palindrome");

    }
}
