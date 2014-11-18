package ws.vinta.pangu;

import static org.junit.Assert.*;
import org.junit.*;

public class PanguTest {

    private Pangu pangu;

    private void assertEqualsSpacingText(String input, String expected) {
        String actual = pangu.spacingText(input);

        assertEquals(expected, actual);
    }

    @Before
    public void setUp() {
        pangu = new Pangu();
    }

    @Test
    public void testSpacingText() {
        assertEqualsSpacingText(
            "請問Jackie的鼻子有幾個？123個！",
            "請問 Jackie 的鼻子有幾個？123 個！"
        );

        assertEqualsSpacingText(
            "請問 Jackie 的鼻子有幾個？123 個！",
            "請問 Jackie 的鼻子有幾個？123 個！"
        );
    }

    @Test
    public void testTilde() {
        assertEqualsSpacingText(
            "前面~後面",
            "前面 ~ 後面"
        );

        assertEqualsSpacingText(
            "前面 ~ 後面",
            "前面 ~ 後面"
        );
    }

    @Test
    public void testBackQuote() {
        assertEqualsSpacingText(
            "前面`後面",
            "前面 ` 後面"
        );
    }

    @Test
    public void testExclamationMark() {
        assertEqualsSpacingText(
            "前面!後面",
            "前面! 後面"
        );

        assertEqualsSpacingText(
            "前面! 後面",
            "前面! 後面"
        );

        assertEqualsSpacingText(
            "前面 ! 後面",
            "前面 ! 後面"
        );
    }

    @Test
    public void testAt1() {
        assertEqualsSpacingText(
            "請@vinta吃大便",
            "請 @vinta 吃大便"
        );
    }

    @Test
    public void testAt2() {
        assertEqualsSpacingText(
            "請@陳上進 吃大便",
            "請 @陳上進 吃大便"
        );
    }

    @Test
    public void testHash1() {
        assertEqualsSpacingText(
            "前面#H2G2後面",
            "前面 #H2G2 後面"
        );
    }

    @Test
    public void testHash2() {
        assertEqualsSpacingText(
            "前面#銀河便車指南 後面",
            "前面 #銀河便車指南 後面"
        );
    }

    @Test
    public void testHash3() {
        assertEqualsSpacingText(
            "前面#銀河公車指南 #銀河大客車指南 後面",
            "前面 #銀河公車指南 #銀河大客車指南 後面"
        );
    }

    @Test
    public void testHash4() {
        assertEqualsSpacingText(
            "前面#銀河閃電霹靂車指南#後面",
            "前面 #銀河閃電霹靂車指南# 後面"
        );
    }

    @Test
    public void testDollar() {
        assertEqualsSpacingText(
            "前面$後面",
            "前面 $ 後面"
        );
    }

    @Test
    public void testPercent() {
        assertEqualsSpacingText(
            "前面%後面",
            "前面 % 後面"
        );
    }

    @Test
    public void testCarat() {
        assertEqualsSpacingText(
            "前面^後面",
            "前面 ^ 後面"
        );
    }

    @Test
    public void testAmpersand() {
        assertEqualsSpacingText(
            "前面&後面",
            "前面 & 後面"
        );
    }

    @Test
    public void testAsterisk() {
        assertEqualsSpacingText(
            "前面*後面",
            "前面 * 後面"
        );
    }

    @Test
    public void testParenthesis() {
        assertEqualsSpacingText(
            "前面(後面",
            "前面 ( 後面"
        );

        assertEqualsSpacingText(
            "前面 ( 後面",
            "前面 ( 後面"
        );

        assertEqualsSpacingText(
            "前面)後面",
            "前面 ) 後面"
        );

        assertEqualsSpacingText(
            "前面 ) 後面",
            "前面 ) 後面"
        );
    }

    @Test
    public void testParenthesisPair() {
        assertEqualsSpacingText(
            "前面(中文123漢字)後面",
            "前面 (中文 123 漢字) 後面"
        );

        assertEqualsSpacingText(
            "前面(中文123)後面",
            "前面 (中文 123) 後面"
        );

        assertEqualsSpacingText(
            "前面(123漢字)後面",
            "前面 (123 漢字) 後面"
        );

        assertEqualsSpacingText(
            "前面(中文123漢字) tail",
            "前面 (中文 123 漢字) tail"
        );

        assertEqualsSpacingText(
            "head (中文123漢字)後面",
            "head (中文 123 漢字) 後面"
        );

        assertEqualsSpacingText(
            "head (中文123漢字) tail",
            "head (中文 123 漢字) tail"
        );
    }

    @Test
    public void testMinus() {
        assertEqualsSpacingText(
            "前面-後面",
            "前面 - 後面"
        );
    }

    @Test
    public void testUnderscore() {
        assertEqualsSpacingText(
            "前面_後面",
            "前面 _ 後面"
        );

        assertEqualsSpacingText(
            "前面 _ 後面",
            "前面 _ 後面"
        );
    }

    @Test
    public void testPlus() {
        assertEqualsSpacingText(
            "前面+後面",
            "前面 + 後面"
        );
    }

    @Test
    public void testEqual() {
        assertEqualsSpacingText(
            "前面=後面",
            "前面 = 後面"
        );
    }

    @Test
    public void testBrace() {
        assertEqualsSpacingText(
            "前面{後面",
            "前面 { 後面"
        );
    }

    @Test
    public void testBracket() {
        assertEqualsSpacingText(
            "前面[後面",
            "前面 [ 後面"
        );
    }

    @Test
    public void testPipe() {
        assertEqualsSpacingText(
            "前面|後面",
            "前面 | 後面"
        );
    }

    @Test
    public void testBackslash() {
        assertEqualsSpacingText(
            "前面\\後面",
            "前面 \\ 後面"
        );
    }

    @Test
    public void testColon() {
        assertEqualsSpacingText(
            "前面:後面",
            "前面: 後面"
        );

        assertEqualsSpacingText(
            "前面: 後面",
            "前面: 後面"
        );

        assertEqualsSpacingText(
            "前面 : 後面",
            "前面 : 後面"
        );
    }

    @Test
    public void testSemicolon() {
        assertEqualsSpacingText(
            "前面;後面",
            "前面; 後面"
        );

        assertEqualsSpacingText(
            "前面; 後面",
            "前面; 後面"
        );

        assertEqualsSpacingText(
            "前面 ; 後面",
            "前面 ; 後面"
        );
    }

    @Test
    public void testQuote() {
        assertEqualsSpacingText(
            "前面\"後面",
            "前面 \" 後面"
        );

        assertEqualsSpacingText(
            "前面\"中文123漢字\"後面",
            "前面 \"中文 123 漢字\" 後面"
        );

        assertEqualsSpacingText(
            "前面\"\"後面",
            "前面 \"\" 後面"
        );

        assertEqualsSpacingText(
            "前面\" \"後面",
            "前面 \" \" 後面"
        );
    }

    @Test
    public void testSingleQuote() {
        assertEqualsSpacingText(
            "前面'後面",
            "前面 ' 後面"
        );

        assertEqualsSpacingText(
            "前面'中文123漢字'後面",
            "前面 '中文 123 漢字' 後面"
        );

        assertEqualsSpacingText(
            "前面''後面",
            "前面 '' 後面"
        );

        assertEqualsSpacingText(
            "前面' '後面",
            "前面 ' ' 後面"
        );
    }

    @Test
    public void testLessThan() {
        assertEqualsSpacingText(
            "前面<後面",
            "前面 < 後面"
        );
    }

    @Test
    public void testComma() {
        assertEqualsSpacingText(
            "前面,後面",
            "前面, 後面"
        );

        assertEqualsSpacingText(
            "前面, 後面",
            "前面, 後面"
        );

        assertEqualsSpacingText(
            "前面, 後面",
            "前面, 後面"
        );
    }

    @Test
    public void testGreaterThan() {
        assertEqualsSpacingText(
            "前面>後面",
            "前面 > 後面"
        );
    }

    @Test
    public void testPeriod() {
        assertEqualsSpacingText(
            "前面.後面",
            "前面. 後面"
        );

        assertEqualsSpacingText(
            "前面. 後面",
            "前面. 後面"
        );

        assertEqualsSpacingText(
            "前面. 後面",
            "前面. 後面"
        );
    }

    @Test
    public void testQuestionMark() {
        assertEqualsSpacingText(
            "前面?後面",
            "前面? 後面"
        );

        assertEqualsSpacingText(
            "前面? 後面",
            "前面? 後面"
        );

        assertEqualsSpacingText(
            "前面? 後面",
            "前面? 後面"
        );
    }

    @Test
    public void testSlash() {
        assertEqualsSpacingText(
            "前面/後面",
            "前面 / 後面"
        );
    }

}