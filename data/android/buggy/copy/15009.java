public java.lang.String codeCRC32(invar.TypeStruct type) {
    type.codecRule();
    java.lang.String crc = java.lang.Long.toHexString(type.getCodecRuleCRC32()).toUpperCase();
    return crc;
}