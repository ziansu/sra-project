public void addChild(processing.core.PApplet p, processing.core.PVector pos, float radius, com.iragreenberg.ocIconDetail shape) {
    com.iragreenberg.ocIcon child = new com.iragreenberg.ocIcon(p, pos, radius, shape);
    child.setParent(this);
    children.add(child);
}