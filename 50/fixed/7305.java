public void addChild(kz.pvnhome.pvnt.File child) {
    child.setParent(this);
    children.add(child);
}