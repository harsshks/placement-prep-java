import java.util.*;

public class reversestring {
    public static void reverse(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        char[] charArray = input.toCharArray();
        reverse(charArray);
        String reversedString = new String(charArray);
        System.out.println("Reversed string: " + reversedString);
        sc.close();
    }
}       