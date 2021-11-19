@java.lang.Override
public org.exist.xquery.value.Sequence postEval(org.exist.xquery.value.Sequence seq) throws org.exist.xquery.XPathException {
    if ((returnExpr) instanceof org.exist.xquery.FLWORClause) {
        return ((org.exist.xquery.FLWORClause) (returnExpr)).postEval(seq);
    }
    return seq;
}