@java.lang.Override
public org.apache.carbondata.core.datastore.page.encoding.ColumnPageDecoder createDecoder(org.apache.carbondata.core.datastore.page.encoding.ColumnPageEncoderMeta meta) {
    assert meta instanceof org.apache.carbondata.core.datastore.page.encoding.bool.BooleanEncoderMeta;
    return new org.apache.carbondata.core.datastore.page.encoding.bool.BooleanPageCodec.BooleanDecompressor(meta);
}