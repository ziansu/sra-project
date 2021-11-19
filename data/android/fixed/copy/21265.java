private int maxLinesFilledForItems(java.util.List<org.eclipse.jdt.core.dom.Expression> expressions, int defaultThreshold) {
    return hasOnlyShortItems(expressions) ? com.google.googlejavaformat.java.JavaInputAstVisitor.ALWAYS_FILL : defaultThreshold;
}