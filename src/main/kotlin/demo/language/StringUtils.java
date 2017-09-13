package demo.language;

public class StringUtils {

    public static char lastChar(String str) {
        return str.charAt(str.length() - 1);
    }

    public static void main(String[] args) {
        char last = StringUtils.lastChar("Hello");
        System.out.println(last);
    }

}

