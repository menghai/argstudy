/**
 * @author haicheng.lhc@alibaba-inc.com 2018/09/21
 * @date 2018/09/21
 */

public class PatternSolution {
    public static boolean isMatch(String text, String pattern) {

        if (pattern.isEmpty()){
            return text.isEmpty();
        }

        boolean first_match = (!text.isEmpty() &&
            (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.'));

        if (pattern.length() >= 2 && pattern.charAt(1) == '*'){
            return (isMatch(text, pattern.substring(2)) ||
                (first_match && isMatch(text.substring(1), pattern)));
        } else {
            return first_match && isMatch(text.substring(1), pattern.substring(1));
        }


    }


    public static void main(String[] args) {

        String testCode = "ab\uD83D\ude03cd";
        System.out.println(testCode);
        System.out.println(testCode.length());
        System.out.println(testCode.codePointCount(0,testCode.length()));

        System.out.println(testCode.offsetByCodePoints(0,3));
    }
}
