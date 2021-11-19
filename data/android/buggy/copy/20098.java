@org.mule.api.annotations.MetaDataRetriever
public MetaData getMetaData(final MetaDataKey key) throws SomeException {
    DefaultMetaDataBuilder builder = new DefaultMetaDataBuilder();
    return new DefaultMetaData(builder.build());
}