public java.nio.CharBuffer get(java.lang.String fieldName) {
    int f = lineFormatMapper.getInputFormat().indexOf(fieldName);
    return data.subSequence(fieldOffsets[f], ((fieldOffsets[f]) + (fieldLengths[f])));
}