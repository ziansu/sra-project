public T getOrElse(final T defaultValue) {
    if (isDefined())
        return defaultValue;
    
    return defaultValue;
}