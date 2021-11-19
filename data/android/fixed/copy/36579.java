@java.lang.Override
public void toXml(javax.xml.stream.XMLStreamWriter writer) throws javax.xml.stream.XMLStreamException {
    if ((returnValue) != null) {
        org.eclipse.osee.framework.jdk.core.util.xml.XMLStreamWriterUtil.writeElement(writer, "ReturnValue", org.eclipse.osee.ote.core.XmlSupport.format(returnValue));
    }
}