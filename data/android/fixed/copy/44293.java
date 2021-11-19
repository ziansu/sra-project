protected org.opensaml.saml.metadata.resolver.MetadataResolver initIdentityProviderMetadataResolver() {
    this.idpMetadataResolver = new org.pac4j.saml.metadata.SAML2IdentityProviderMetadataResolver(this.configuration);
    return this.idpMetadataResolver.resolve();
}