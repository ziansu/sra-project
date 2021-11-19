private java.lang.String unparseTerm(org.kframework.kore.K input, org.kframework.definition.Module test) {
    return org.kframework.unparser.KOREToTreeNodes.toString(new org.kframework.unparser.AddBrackets(test).addBrackets(((org.kframework.parser.ProductionReference) (org.kframework.unparser.KOREToTreeNodes.apply(org.kframework.unparser.KOREToTreeNodes.up(input), test)))));
}