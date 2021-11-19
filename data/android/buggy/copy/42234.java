private int extractInt(android.content.res.XmlResourceParser xpp) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
    xpp.next();
    int val = java.lang.Integer.parseInt(xpp.getName());
    xpp.next();
    xpp.next();
    return val;
}