package ua.lviv.iot.regex;

import org.junit.jupiter.api.Test;

class WordMatcherTest {
    private static final String TEXT_TO_CHECK =
            "Procuring education on consulted assurance in do." +
                    " Is sympathize he expression mr by no travelling?" +
                    " Preference he he at travelling in resolution." +
                    " So striking at of to welcomed resolved." +
                    " Northward go described up household therefore attention?" +
                    " Excellence decisively nay man yet impression for contrasted remarkably." +
                    " There spoke happy for you are out." +
                    " Fertile how old address did showing because sitting replied six." +
                    " Had arose guest visit going off child she new.";

    private static final String LETTER_TO_FIND = "e";
    private static final int WORD_LENGTH = 2;

    @Test
    void testFindSecondWordOnLetterInEverySentenceOfText() {
        System.out.println("Enter text to check:");
        System.out.println(TEXT_TO_CHECK);
        System.out.println("Enter letter:");
        System.out.println(LETTER_TO_FIND);
        WordMatcher.findSecondWordOnLetterInEverySentenceOfText(TEXT_TO_CHECK, LETTER_TO_FIND);

    }

    @Test
    void testFindAllWordsWithEnteredLengthInAllInterrogativeSentencesWithoutDuplicates() {
        System.out.println("Enter text to check:");
        System.out.println(TEXT_TO_CHECK);
        System.out.println("Enter word length:");
        System.out.println(WORD_LENGTH);
        WordMatcher.findAllWordsWithEnteredLengthInAllInterrogativeSentencesWithoutDuplicates(TEXT_TO_CHECK, WORD_LENGTH);

    }
}