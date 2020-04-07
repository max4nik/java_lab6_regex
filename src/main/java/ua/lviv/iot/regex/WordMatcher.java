package ua.lviv.iot.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class WordMatcher {


    public static void findSecondWordOnLetterInEverySentenceOfText(final String stringToCheck, final String letterToFind) {

        System.out.println("\n-----Matches------");
        String collectedStrings = runPatterns("[.?!\\s]*+\\p{Upper}[\\S]+[\\s]" + letterToFind + "[\\w]+", stringToCheck, false).toString();
        String result = runPatterns("\\b\\p{Lower}\\w+", collectedStrings, true).toString();

        if (result.isEmpty()) {
            System.out.println("No matches...");
        }

    }

    public static void findAllWordsWithEnteredLengthInAllInterrogativeSentencesWithoutDuplicates(final String stringToCheck, final int wordLength) {

        System.out.println("\n-----Matches------");
        String collectedStrings = runPatterns("\\b(\\p{Upper}[^.!]*[?])+", stringToCheck, false).toString();
        String result = runPatterns("\\b\\w{" + wordLength + "}\\b", collectedStrings, true).toString();

        if (result.isEmpty()) {
            System.out.println("No matches...");
        }

    }

    private static StringBuilder runPatterns(final String patternString, String textToCheck, Boolean print) {

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(textToCheck);
        StringBuilder collectedString = new StringBuilder();

        while (matcher.find()) {
            collectedString.append(matcher.group()).append(" ");

            if (print) {
                System.out.println(matcher.group());
            }
        }
        return collectedString;
    }
}

