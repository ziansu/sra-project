protected static org.springframework.security.saml.metadata.ExtendedMetadata extendedMetadata() {
    org.springframework.security.saml.metadata.ExtendedMetadata extendedMetadata = new org.springframework.security.saml.metadata.ExtendedMetadata();
    extendedMetadata.setIdpDiscoveryEnabled(true);
    extendedMetadata.setSignMetadata(true);
    return extendedMetadata;
}