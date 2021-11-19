public java.util.List<ch.imedias.rsccfx.model.xml.Supporter> getDefaultSupporters() {
    ch.imedias.rsccfx.model.xml.SupporterHelper.LOGGER.info("Loading default supporter list");
    java.io.File supportersXmlFile = new java.io.File(ch.imedias.rsccfx.model.xml.SupporterHelper.DEFAULT_SUPPORTERS_FILENAME);
    return getSupportersFromXml(supportersXmlFile);
}