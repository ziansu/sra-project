private static int maxLinesFilledForItems(java.util.List<org.eclipse.jdt.core.dom.Expression> expressions, int defaultThreshold) {
    return com.google.googlejavaformat.java.JavaInputAstVisitor.hasOnlyShortItems(expressions) ? com.google.googlejavaformat.java.JavaInputAstVisitor.ALWAYS_FILL : defaultThreshold;
}