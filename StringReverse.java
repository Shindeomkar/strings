package strings;

public class StringReverse {
    static void reverse(char arr[],int n)
    {
        int i=0,j= n;
        char temp;
        while (i<j)
                {
               temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               i++;j--;
                }
    }
    public static void main(String[] args) {
        String str="omkar";
        int n=str.length()-1;
        char arr[]=str.toCharArray();
       reverse(arr,n);
        System.out.println(arr);
    }
}
