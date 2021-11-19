@java.lang.Override
protected void serialize(java.lang.Boolean obj, javax.json.stream.JsonGenerator generator, org.eclipse.yasson.internal.Marshaller marshaller) {
    generator.write(java.lang.String.valueOf(obj));
}