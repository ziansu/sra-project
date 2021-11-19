public void remove(de.tucottbus.kt.lcars.elements.EElement el) {
    synchronized(elements) {
        elements.remove(el);
    }
}