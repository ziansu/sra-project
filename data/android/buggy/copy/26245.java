@java.lang.Override
public java.nio.file.Path getPwd() {
    java.lang.System.err.println("getpwd");
    try {
        autoLoad();
    } catch (java.io.IOException | org.xml.sax.SAXException | javax.xml.parsers.ParserConfigurationException e) {
        e.printStackTrace();
    }
    return super.getPwd();
}