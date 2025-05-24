
import java.util.Scanner;
import java.util.Stack;

public class ConvertToPrefix {

    public static int input_Precedence(char c) {
        if (c == '+' || c == '-') {
            return 2;
        }
        if (c == '*' || c == '/') {
            return 4;
        }
        if (c == '^') {
            return 5;
        }
        if (c == '(') {
            return 9;
        }
        if (c == ')') {
            return 0;
        } else {
            return 7;
        }
    }

    public static int stack_Precedence(char c) {
        if (c == '+' || c == '-') {
            return 1;
        }
        if (c == '*' || c == '/') {
            return 3;
        }
        if (c == '^') {
            return 6;
        }
        if (c == '(') {
            return 0;
        } else {
            return 8;
        }
    }

    public static int rank(char c) {
        if (c == '+' || c == '-' || c == '*' || c == '/' || c == '^') {
            return -1;
        }
        if (c == '(' || c == ')') {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Stack<Character> s = new Stack<Character>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter infix string : ");
        String input = sc.next() + ")";
        StringBuilder rev = new StringBuilder(input);
        System.out.println("reverce string is : " + rev.reverse());
        for (int i = 0; i < rev.length(); i++) {
            if (rev.charAt(i) == '(') {
                rev.setCharAt(i, ')');
            }
            if (rev.charAt(i) == ')') {
                rev.setCharAt(i, '(');
                i++;
            }
        }
        int charRank = 0;
        input = rev.toString();
        input += ")";
        s.push('(');
        String polish = "";
        for (int i = 0; i < input.length(); i++) {
            char next = input.charAt(i);
            if (s.isEmpty()) {
                System.out.println("invalid1");
            } else {
                while (stack_Precedence(s.peek()) > input_Precedence(next)) {
                    char temp = s.pop();
                    polish = polish + temp;
                    charRank = charRank + rank(temp);
                    if (charRank < 1) {
                        System.out.println("invalid2");
                    }
                }
                if (stack_Precedence(s.peek()) != input_Precedence(next)) {
                    s.push(next);
                } else {
                    s.pop();
                }
            }
        }
        StringBuilder reverseStr = new StringBuilder(polish);
        for (int i = 0; i < reverseStr.length(); i++) {
            if (reverseStr.charAt(i) == '(') {
                reverseStr.setCharAt(i, ')');
            }
            if (reverseStr.charAt(i) == ')') {
                reverseStr.setCharAt(i, '(');
                i++;
            }
        }
        if (s.isEmpty() == true && charRank != 1) {
            System.out.println("invalid3");
        } else {
            System.out.println("valid");
        }
        System.out.println("prefix string is : " + reverseStr.reverse());

    }
}
