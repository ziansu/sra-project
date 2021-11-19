public void removeElementByID(java.lang.String ID) {
    for (com.github.infosimulators.gui.gelements.GElement element : elements) {
        if ((element.getID()) == ID) {
            elements.remove(element);
        }
    }
}