public java.lang.String render(final java.lang.String markdown) {
    org.publo.model.PageMarkup.LOGGER.info("Rendering the markup.");
    return org.publo.controller.utils.TemplateRenderer.render(pageTemplate.getTemplate().getValue(), markdown);
}