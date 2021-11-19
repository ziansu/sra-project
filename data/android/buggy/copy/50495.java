@java.lang.Override
public void run() {
    for (org.w3c.dom.Element value : elements.values()) {
        value.setAttributeNS(null, "fill", batikdockable.BatikDockable.FILL_NONE);
    }
    rootElement.removeAttributeNS(null, "transform");
}