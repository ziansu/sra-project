@java.lang.Override
public void startDocument() throws org.xml.sax.SAXException {
    io.inkstand.scribble.rules.jcr.util.XMLContentHandler.LOG.info("BEGIN ContentImport");
    io.inkstand.scribble.rules.jcr.util.XMLContentHandler.LOG.info("IMPORT USER: {}", session.getUserID());
    startTime = java.lang.System.nanoTime();
}