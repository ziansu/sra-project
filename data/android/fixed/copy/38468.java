@java.lang.Override
public org.jdom2.Element store(java.lang.Object o) {
    getInstance(o);
    org.jdom2.Element e = new org.jdom2.Element("connection");
    e.setAttribute("class", this.getClass().getName());
    return e;
}