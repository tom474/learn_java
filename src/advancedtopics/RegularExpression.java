package advancedtopics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    static void main(String[] args) {
        Pattern pattern = Pattern.compile("cuong", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Hello Cuong!");
        boolean isMatchFound = matcher.find();
        if (isMatchFound) {
            System.out.println("Match found!");
        } else {
            System.out.println("Match not found!");
        }
    }
}
