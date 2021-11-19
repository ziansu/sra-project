public org.parboiled.Rule nakedStringLiteral() {
    return Sequence(TestNot(AnyOf("\r\n\"\'\\")), ZeroOrMore(io.smartcat.ranger.parser.ANY), push(match()));
}