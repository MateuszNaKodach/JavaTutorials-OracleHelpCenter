package udemy;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Mateusz on 28.12.2016.
 */
public class AdvancedStringManipulation {
    public static void main(String[] args) {
        String myString = "Mateusz x Ania x Wojtek x Aleksandra";
        String[] splitString = myString.split(" x ");
        System.out.println(Arrays.toString(splitString));

        String string = "MississipiMiasdadasdpi";
        String stringPart = string.substring(2, 5);
        System.out.println(stringPart);

        //JAVA REGEX!!!
       /* Pattern p = Pattern.compile("Mi(.*?)pi");
        Matcher m = p.matcher(string);
        while(m.find()){
            System.out.println(m.group(1));
        }*/

        String html = "<div class=\"image\">\n" +
                "\t\t\t\t\t\t<img src=\"http://cdn.posh24.com/images/:profile/014cf47ca44daf8f44a3e0720929ee327\" alt=\"Zayn Malik\"/>\n" +
                "\t\t\t\t\t</div>";

        Pattern srcPattern = Pattern.compile("src=\"(.*?)\"");
        Matcher scrMatcher = srcPattern.matcher(html);
        while(scrMatcher.find())
            System.out.println(scrMatcher.group(1));

        Pattern altPattern = Pattern.compile("alt=\"(.*?)\"");
        Matcher altMatcher = altPattern.matcher(html);
        while(altMatcher.find())
            System.out.println(altMatcher.group(1));

    }
}
