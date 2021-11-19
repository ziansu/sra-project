@java.lang.Override
public void toSnax(org.fwb.xml.sax.snax.SimpleContentHandler sch) throws org.xml.sax.SAXException {
    java.lang.String s = DELEGATE.toString();
    com.google.common.base.Preconditions.checkArgument((null != s), "delegate toString mustn't return null");
    sch.characters(toString());
}