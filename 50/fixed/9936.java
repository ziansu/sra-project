public java.util.Vector<de.tucottbus.kt.lcars.elements.EElement> getElements() {
    synchronized(elements) {
        return new java.util.Vector<de.tucottbus.kt.lcars.elements.EElement>(elements);
    }
}