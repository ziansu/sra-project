private lex.fa.Nfa concatenation(lex.fa.Nfa nfa) {
    lex.fa.node.NfaNode node = nfa.nodes.removeFirst();
    this.nodes.getLast().addAllTransitions(node.getAllTransitions());
    this.nodes.addAll(nfa.nodes);
    return this;
}