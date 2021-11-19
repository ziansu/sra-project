public void addTo(de.blau.android.util.rtree.RTree.Node parent) {
    assert (parent.children) != null;
    parent.children.add(this);
    this.parent = parent;
    computeMBR();
    splitter.split(parent);
}