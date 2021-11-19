private synchronized void load() throws java.io.IOException {
    hudson.XmlFile xml = getConfigFile();
    if (xml.exists()) {
        xml.unmarshal(this);
    }
}