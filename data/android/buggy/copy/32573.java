public static de.konnekting.xml.schema.konnekting.KONNEKTING readConfiguration(java.io.File f) throws javax.xml.bind.JAXBException, org.xml.sax.SAXException {
    de.konnekting.xml.schema.konnekting.KONNEKTING konnekting = de.konnekting.xmlschema.KonnektingXmlService.unmarshal(null, f.getAbsolutePath(), de.konnekting.xml.schema.konnekting.KONNEKTING.class);
    return konnekting;
}