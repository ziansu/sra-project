private void reindexChildren() {
    for (int i = 0; i < (childNodes.size()); i++) {
        childNodes.get(i).setSiblingIndex(i);
    }
}