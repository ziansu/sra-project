@org.junit.Test
public void paragraphWithOneLine() {
    java.lang.String html = parseToHtml("a paragraph");
    org.junit.Assert.assertEquals("<p>a paragraph</p>\n", html);
}