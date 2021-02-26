package strings;

public class Leftmostnonrepeatingelement {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        int count[] = new int[26];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i) - 'a'] == 1) {
                System.out.println(str.charAt(i));
                break;
            }

        }
    }
}
