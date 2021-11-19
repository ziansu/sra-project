public SymbolicValue.ExceptionalSymbolicValue createExceptionalSymbolicValue(@javax.annotation.Nullable
org.sonar.plugins.java.api.semantic.Type exceptionType) {
    org.sonar.java.se.symbolicvalues.SymbolicValue.ExceptionalSymbolicValue result = new org.sonar.java.se.symbolicvalues.SymbolicValue.ExceptionalSymbolicValue(nextId(), exceptionType);
    return result;
}