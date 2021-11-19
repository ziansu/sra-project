public <T> T macro(boolean asIs, java.lang.String source, final java.util.Map<org.codehaus.groovy.macro.runtime.MacroSubstitutionKey, groovy.lang.Closure<org.codehaus.groovy.ast.expr.Expression>> context, java.lang.Class<T> resultClass) {
    return macro(CompilePhase.CONVERSION, asIs, source, context, resultClass);
}