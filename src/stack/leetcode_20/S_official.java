package stack.leetcode_20;

// 官方的更好的题解其实并没有多高级
// 只不过将栈换为数组
// 不过用数组代替栈确实是一个很好的思路
public class S_official {
    public static boolean isValid(String s) {
        char[] cs = s.toCharArray();
        int size = 0;
        char[] stack = new char[s.length()];
        for (char c : cs) {
            switch (c) {
                case '(' :
                case '[' :
                case '{' :
                    stack[size++] = c;
                    break;
                case ')' :
                    if (size > 0 && stack[size - 1] == '(') {
                        size--;
                    } else {
                        return false;
                    }
                    break;
                case ']' :
                    if (size > 0 && stack[size - 1] == '[') {
                        size--;
                    } else {
                        return false;
                    }
                    break;
                case '}' :
                    if (size > 0 && stack[size - 1] == '{') {
                        size--;
                    } else {
                        return false;
                    }
                    break;
            }
        }
        return size == 0;
    }
}
