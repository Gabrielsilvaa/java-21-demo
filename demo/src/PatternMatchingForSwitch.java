import java.util.*;

/**
 * To run: `java PatternMatchingForSwitchTest.java`
 */
public class PatternMatchingForSwitch {
    public static void main(String[] args) {
        switchExpressionWithPatternMatching();
    }
    static void switchExpressionWithPatternMatching() {
        Object obj = "42";

        String message = switch (obj) {
            case Integer i -> String.format("int %d", i);
            case String s -> String.format("string %s", s);
            case Double d -> String.format("double %d", d);
            case null -> "null =s";
            default -> obj.toString();
        };
        System.out.println(message);
    }
}
