@java.lang.Override
public void addChild(com.caverock.androidsvg.SVG.SvgObject object) throws org.xml.sax.SAXException {
    if (object instanceof com.caverock.androidsvg.SVG.TextChild)
        children.add(object);
    else
        throw new org.xml.sax.SAXException((("Text content elements cannot contain " + object) + " elements."));
    
}