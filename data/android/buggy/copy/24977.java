private java.util.List<org.cqframework.cql.elm.tracking.TupleTypeElement> getSortedElements() {
    if ((sortedElements) == null) {
        sortedElements = new java.util.ArrayList(elements);
        sortedElements.sort(org.cqframework.cql.elm.tracking.TupleType.TupleTypeElementComparator);
    }
    return sortedElements;
}