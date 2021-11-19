private boolean isEqualityLiteral(final de.uni_freiburg.informatik.ultimate.smtinterpol.util.SymmetricPair<de.uni_freiburg.informatik.ultimate.smtinterpol.theory.cclosure.CCTerm> termPair) {
    return (mEqualityLiterals.containsKey(termPair)) && ((mEqualityLiterals.get(termPair).getSign()) < 0);
}