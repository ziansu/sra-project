public static cascading.tuple.Tuple nulledCopy(cascading.tuple.Fields declarator, cascading.tuple.Tuple tuple, cascading.tuple.Fields selector) {
    return tuple.nulledCopy(declarator.getPos(selector, tuple.size()));
}