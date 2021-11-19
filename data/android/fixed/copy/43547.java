@org.junit.Test
public void import3() throws cop5555sp15.SimpleParser.SyntaxException {
    java.lang.String input = "import class A { } ";
    cop5555sp15.TokenStream.Kind ExpectedIncorrectTokenKind = KW_CLASS;
    parseIncorrectInput(input, ExpectedIncorrectTokenKind);
}