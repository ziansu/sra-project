public static org.apache.sis.feature.DefaultFeatureType capital() {
    return new org.apache.sis.feature.DefaultFeatureType(java.util.Collections.singletonMap(DefaultFeatureType.NAME_KEY, "Capital"), false, new org.apache.sis.feature.DefaultFeatureType[]{ org.apache.sis.feature.DefaultFeatureTypeTest.city() }, org.apache.sis.feature.DefaultAttributeTypeTest.parliament());
}