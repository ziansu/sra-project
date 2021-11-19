public java.nio.CharBuffer get(org.netpreserve.openwayback.cdxlib.FieldType fieldType) {
    int f = lineFormatMapper.getInputFormat().indexOf(fieldType);
    return data.subSequence(fieldOffsets[f], ((fieldOffsets[f]) + (fieldLengths[f])));
}