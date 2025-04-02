package Folder1;

public class Q1 {
    public static void main(String[] args){
        String str = "ABCDE";

        str = reverse(str);
        System.out.println(str);
    }

    public static String reverse(String str) {
        Stack s1 = new Stack(6);

        // push each character in the string into the stack
        char[] chars = str.toCharArray();
        for (char c : chars) {
            s1.push(c);
        }

        // pop all characters and put them back to the character array
        for (int i = 0; i < str.length(); i++) {
            chars[i] = (char) s1.pop();
        }

        // convert the char array to a string and return
        return new String(chars);
    }
}
