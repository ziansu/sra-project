public org.parboiled.Rule TermList(org.parboiled.support.Var<java.lang.Integer> counter) {
    return Sequence(Term(), counter.set(((counter.get()) + 1)), ZeroOrMore(',', TermList(counter)));
}