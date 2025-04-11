package Folder1;

public class Q1 {
    public static void main(String[] args){
        String str = "ABCDE";

        str = reverse(str);
    }

    public static String reverse(String str) {

        // push each character in the string into the stack
        char[] chars = str.toCharArray();
        for (char c : chars) {
            s1.push(c);
        }

        // pop all characters and put them back to the character array
        for (int i = 0; i < str.length(); i++) {
        }

        // convert the char array to a string and return
        return new String(chars);
    }
}
