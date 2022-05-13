package ua.lviv.iot.manager;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpression {

    private final String pattern = "\\b(([0-9]|1[0-9]|2[0-5])|(2[6-9]|[34][0-9])|(5[0-9]|6[0-9]|70)|(7[1-9]|8[0-7])|(8[89]|9[0-9]|100))\\b";


    public String replaceGrade(String text) {
        Pattern p = Pattern.compile(pattern);
        StringBuilder sb = new StringBuilder();
        Matcher m = p.matcher(text);
        while (m.find()) {
            String matchedText = m.group();
            int grades = Integer.parseInt(matchedText);
            String replacementText = "";
            if (grades > 0 && grades < 26) {
                replacementText = "EXPEL";
            } else if (grades > 26 && grades < 50) {
                replacementText = "COMISSION";
            } else if (grades > 50 && grades < 71) {
                replacementText = "SATISFACTORY";
            } else if (grades > 71 && grades < 88) {
                replacementText = "GOOD";
            } else if (grades > 88 && grades <= 100) {
                replacementText = "EXCELLENT";
            } else {
                System.out.println("\n");
            }
            m.appendReplacement(sb, replacementText);
        }
        m.appendTail(sb);
        System.out.println(sb.toString());
        return text;
    }
}


