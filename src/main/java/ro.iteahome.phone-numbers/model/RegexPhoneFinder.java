package model;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPhoneFinder {

    private String input;

    public RegexPhoneFinder(String input) {
        this.input = input;
    }

    /*
    (((\(07[0-8]{1}[0-9]{1}\))|(07[0-8]{1}[0-9]{1})){1}(\s|\-){1}([0-9]{6}))
    pentru
    07xx-xxxxxx
    (07xx)-xxxxx
    ((07[0-8]{1}[0-9]{1})(\s|\-){1}([0-9]{3})(\s|\-){1}([0-9]{3}))|(((\(07[0-8]{1}[0-9]{1}\))
    pentru
    07xx xxx xxx
    07xx xxx-xxx
    07xx-xxx-xxx
     */

    public void findAndDisplayPhoneNumbers(){
        String patternString = "((07[0-8]{1}[0-9]{1})(\\s|\\-){1}([0-9]{3})(\\s|\\-){1}([0-9]{3}))|(((\\(07[0-8]{1}[0-9]{1}\\))|(07[0-8]{1}[0-9]{1})){1}(\\s|\\-){1}([0-9]{6}))";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(input);

        int count = 0;
        while(matcher.find()) {
            count++;
            System.out.print("found: " + count + " : ");
            for(int i = matcher.start(); i<matcher.end(); i++){
                System.out.print(input.charAt(i));
            }
            System.out.println();
        }
    }


}
