public void addChild(edu.virginia.engine.display.DisplayObject d) {
    children.add(d);
    d.setParent(this);
}