@java.lang.Override
protected void serialize(java.lang.Boolean obj, javax.json.stream.JsonGenerator generator, java.lang.String key, org.eclipse.yasson.internal.Marshaller marshaller) {
    generator.write(key, java.lang.String.valueOf(obj));
}