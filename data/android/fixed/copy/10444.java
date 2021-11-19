private static java.lang.String getBitFieldText(com.google.common.base.Optional<java.lang.String> bitFieldName) {
    return bitFieldName.isPresent() ? java.lang.String.format("bit-field '%s'", bitFieldName.get()) : "an unnamed bit-field";
}