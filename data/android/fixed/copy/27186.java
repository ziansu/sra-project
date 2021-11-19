public T get() {
    try {
        T value = getValue(getRawValue());
        if (value == null)
            return defaultValue;
        
        return value;
    } catch (fr.zcraft.zlib.components.configuration.ConfigurationParseException ex) {
        return defaultValue;
    }
}