public int getIndexOfFirstElement() {
    return (this.elements) == (visibleElements) ? 0 : ((int) ((elements) * (scrollPos)));
}