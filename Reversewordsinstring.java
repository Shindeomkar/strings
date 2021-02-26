package strings;

public class Reversewordsinstring {
    static void reverse(char arr[],int s,int n)
    {
        int i=s,j= n;
        char temp;
        while (i<j)
        {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
    }
    static void reversewords(char arr[],int n)
    {

        int start=0;
        for (int i=0;i<=n;i++)
        {
            if(arr[i]==' ')
            {
               reverse(arr,start,i-1);
                start=i+1;
            }

        }
        reverse(arr,start,n);
        reverse(arr,0,n);
    }
    public static void main(String[] args) {
        String s1="welcome to gfg";
        int n=s1.length()-1;
        char arr[]=s1.toCharArray();
        reversewords(arr,n);
        System.out.println(arr);
    }
}
