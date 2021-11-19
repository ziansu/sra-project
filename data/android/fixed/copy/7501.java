@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/{id}")
@javax.ws.rs.Produces(value = "application/json")
public com.liferay.adaptive.media.image.jaxrs.internal.ImageAdaptiveMediaConfigRepr getConfiguration(@javax.ws.rs.PathParam(value = "id")
java.lang.String id) {
    java.util.Optional<com.liferay.adaptive.media.image.configuration.ImageAdaptiveMediaConfigurationEntry> configurationEntryOptional = _configurationHelper.getImageAdaptiveMediaConfigurationEntry(_companyId, id);
    com.liferay.adaptive.media.image.configuration.ImageAdaptiveMediaConfigurationEntry configurationEntry = configurationEntryOptional.orElseThrow(NotFoundException::new);
    return new com.liferay.adaptive.media.image.jaxrs.internal.ImageAdaptiveMediaConfigRepr(configurationEntry);
}