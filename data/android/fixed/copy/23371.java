org.parboiled.Rule NumericLiteral() {
    return FirstOf(DoubleLiteral(), DecimalLiteral(), IntegerLiteral());
}