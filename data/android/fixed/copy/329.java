@java.lang.SuppressWarnings(value = { "unchecked" , "rawtypes" })
protected org.bson.codecs.configuration.mapper.ClassModelCodec<?> createCodec(final org.bson.codecs.configuration.CodecRegistry registry, final org.bson.codecs.configuration.mapper.ClassModel classModel) {
    return new org.bson.codecs.configuration.mapper.ClassModelCodec(classModel, registry);
}