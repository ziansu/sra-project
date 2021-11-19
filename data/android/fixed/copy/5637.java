protected T getValue(java.lang.Object object) throws fr.zcraft.zlib.components.configuration.ConfigurationParseException {
    return fr.zcraft.zlib.components.configuration.ConfigurationValueHandlers.handleValue(getRawValue(), valueType, null, null);
}