public synchronized <T extends de.tucottbus.kt.lcars.elements.EElement> T add(T el) {
    if (!(elements.contains(el)))
        elements.add(el);
    
    return el;
}