@java.lang.Override
public boolean acceptableParameterName(final java.lang.String paramName) {
    return !(relations.containsKey(paramName));
}