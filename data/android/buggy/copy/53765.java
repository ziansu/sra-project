org.parboiled.Rule Identifier(org.parboiled.support.Var<java.lang.String> id) {
    return Sequence(Sequence(IdentifierStart(), ZeroOrMore(IdentifierPart()), id.set(match())), Whitespace());
}