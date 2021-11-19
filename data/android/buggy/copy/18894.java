private org.cqframework.cql.elm.tracking.TupleType getTupleType() {
    if ((tupleType) == null) {
        tupleType = buildTupleType();
    }
    return tupleType;
}