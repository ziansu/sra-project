@java.lang.Override
protected java.lang.String getIdByTuple(T tuple) {
    return ((idField) == null) || (tuple.containsKey(idField)) ? null : ((java.lang.String) (tuple.get(idField)));
}