private java.lang.String toLabel(eu.interedition.collatex.graph.VariantGraphEdge e) {
    return VariantGraphEdge.TO_CONTENTS.apply(e).replaceAll("\"", "\\\"");
}