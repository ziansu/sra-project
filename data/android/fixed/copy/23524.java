@java.lang.Override
public void write(io.legaldocml.io.XmlWriter writer) throws java.io.IOException {
    if ((this.language) != null) {
        writer.writeAttribute(io.legaldocml.module.xml.XmlLangImpl.ADDRESS, 8, io.legaldocml.unsafe.UnsafeString.getChars(this.language.getCode()));
    }
}