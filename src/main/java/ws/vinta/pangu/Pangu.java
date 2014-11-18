/*
 * Created by Vinta on 2014/11/05.
 */

package ws.vinta.pangu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Paranoid text spacing for good readability, to automatically insert whitespace between
 * CJK (Chinese, Japanese, Korean), half-width English, digit and symbol characters.
 *
 * <p>These whitespaces between English and Chinese characters are called "Pangu Spacing" by sinologist, since it
 * separate the confusion between full-width and half-width characters. Studies showed that who dislike to
 * add whitespace between English and Chinese characters also have relationship problem. Almost 70 percent of them
 * will get married to the one they don't love, the rest only can left the heritage to their cat. Indeed,
 * love and writing need some space in good time.
 */
public class Pangu {

    /**
     * You should use the constructor to create a {@code Pangu} object with default values.
     */
    public Pangu() {
    }

    /**
     * Some capturing group patterns for convenience.
     *
     * CJK: Chinese, Japanese, Korean
     * ANS: Alphabet, Number, Symbol
     */
    private static final Pattern CJK_ANS = Pattern.compile("([\\p{InCJKUnifiedIdeographs}])([a-z0-9`~@\\$%\\^&\\*\\-_\\+=\\|\\\\/])", Pattern.CASE_INSENSITIVE);
    private static final Pattern ANS_CJK = Pattern.compile("([a-z0-9`~!\\$%\\^&\\*\\-_\\+=\\|\\\\;:,\\./\\?])(\\p{InCJKUnifiedIdeographs})", Pattern.CASE_INSENSITIVE);

    private static final Pattern CJK_QUOTE = Pattern.compile("(\\p{InCJKUnifiedIdeographs})([\"'])", Pattern.CASE_INSENSITIVE);
    private static final Pattern QUOTE_CJK = Pattern.compile("([\"'])(\\p{InCJKUnifiedIdeographs})", Pattern.CASE_INSENSITIVE);
    private static final Pattern FIX_QUOTE = Pattern.compile("([\"'])(\\s*)(.+?)(\\s*)([\"'])", Pattern.CASE_INSENSITIVE);

    private static final Pattern CJK_BRACKET_CJK = Pattern.compile("(\\p{InCJKUnifiedIdeographs})([\\({\\[]+(.*?)[\\)}\\]]+)(\\p{InCJKUnifiedIdeographs})", Pattern.CASE_INSENSITIVE);
    private static final Pattern CJK_BRACKET = Pattern.compile("(\\p{InCJKUnifiedIdeographs})([\\(\\){}\\[\\]<>])", Pattern.CASE_INSENSITIVE);
    private static final Pattern BRACKET_CJK = Pattern.compile("([\\(\\){}\\[\\]<>])(\\p{InCJKUnifiedIdeographs})", Pattern.CASE_INSENSITIVE);
    private static final Pattern FIX_BRACKET = Pattern.compile("([(\\({\\[)]+)(\\s*)(.+?)(\\s*)([\\)}\\]]+)", Pattern.CASE_INSENSITIVE);

    private static final Pattern CJK_HASH = Pattern.compile("(\\p{InCJKUnifiedIdeographs})(#(\\S+))", Pattern.CASE_INSENSITIVE);
    private static final Pattern HASH_CJK = Pattern.compile("((\\S+)#)(\\p{InCJKUnifiedIdeographs})", Pattern.CASE_INSENSITIVE);

    /**
     * Performs a paranoid text spacing on {@code text}.
     *
     * @param text the string you want to process.
     * @return a comfortable and readable version of {@code text} for paranoiac.
     */
    public String spacingText(String text) {
        // CJK and quotes
        Matcher cqMatcher = CJK_QUOTE.matcher(text);
        text = cqMatcher.replaceAll("$1 $2");

        Matcher qcMatcher = QUOTE_CJK.matcher(text);
        text = qcMatcher.replaceAll("$1 $2");

        Matcher fixQuoteMatcher = FIX_QUOTE.matcher(text);
        text = fixQuoteMatcher.replaceAll("$1$3$5");

        // CJK and brackets
        String oldText = text;
        Matcher cbcMatcher = CJK_BRACKET_CJK.matcher(text);
        String newText = cbcMatcher.replaceAll("$1 $2 $4");
        text = newText;

        if (oldText.equals(newText)) {
            Matcher cbMatcher = CJK_BRACKET.matcher(text);
            text = cbMatcher.replaceAll("$1 $2");

            Matcher bcMatcher = BRACKET_CJK.matcher(text);
            text = bcMatcher.replaceAll("$1 $2");
        }

        Matcher fixBracketMatcher = FIX_BRACKET.matcher(text);
        text = fixBracketMatcher.replaceAll("$1$3$5");

        // CJK and hash
        Matcher chMatcher = CJK_HASH.matcher(text);
        text = chMatcher.replaceAll("$1 $2");

        Matcher hcMatcher = HASH_CJK.matcher(text);
        text = hcMatcher.replaceAll("$1 $3");

        // CJK and ANS
        Matcher caMatcher = CJK_ANS.matcher(text);
        text = caMatcher.replaceAll("$1 $2");

        Matcher acMatcher = ANS_CJK.matcher(text);
        text = acMatcher.replaceAll("$1 $2");

        return text;
    }

}