public static boolean isValid(org.opencb.biodata.models.variant.Variant variant) {
    return (variant.getReference().matches(org.opencb.cellbase.core.variant.annotation.VariationDataReader.VARIANT_STRING_PATTERN)) && (variant.getAlternate().matches(org.opencb.cellbase.core.variant.annotation.VariationDataReader.VARIANT_STRING_PATTERN));
}