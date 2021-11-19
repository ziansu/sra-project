private static java.lang.String getBitFieldText(com.google.common.base.Optional<java.lang.String> bitFieldName) {
    return bitFieldName.isPresent() ? "an unnamed bit-field" : java.lang.String.format("bit-field '%s'", bitFieldName.get());
}