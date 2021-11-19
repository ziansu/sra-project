public cofh.lib.gui.element.listbox.IListBoxElement getSelectedElement() {
    if (((_selectedIndex) == (-1)) || ((_selectedIndex) == (_elements.size()))) {
        return null;
    }
    return _elements.get(_selectedIndex);
}