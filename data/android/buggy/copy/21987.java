private void log(java.lang.String methodName, org.openl.types.IOpenClass[] argumentTypes, java.lang.String bindingType) {
    if (log.isTraceEnabled()) {
        log.trace("Method '{}' with parameters '{}' was binded as {}", methodName, getArgumentsAsString(argumentTypes), bindingType);
    }
}