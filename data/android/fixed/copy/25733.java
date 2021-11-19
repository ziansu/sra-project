public static fhirconverter.spark.Representation fromString(java.lang.String repr_string) {
    fhirconverter.spark.Representation.LOGGER.debug(("Format Received: " + repr_string));
    if (repr_string == null) {
        return fhirconverter.spark.Representation.JSON;
    }
    if (repr_string.matches(fhirconverter.spark.Representation.XML_STRINGS_REGEX)) {
        return fhirconverter.spark.Representation.XML;
    }
    return fhirconverter.spark.Representation.JSON;
}