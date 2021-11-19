public void unparent() {
    disableParentControl();
    parent.removeChildFromChildren(this);
    parent = null;
}