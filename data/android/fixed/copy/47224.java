private boolean matchesArity(java.lang.reflect.Method method) {
    int parameterCount = method.getParameterTypes().length;
    return (!(method.isVarArgs())) && (parameterCount == (arity));
}