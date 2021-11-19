@java.lang.Override
public java.lang.String getElement(javax.xml.transform.stream.StreamResult rt) {
    java.lang.String xml = rt.getWriter().toString();
    return xml.replaceFirst("<\\?.*\\?>", "");
}