public void addChild(engine.core.GameObject child) {
    children.add(child);
    child.setApplication(application);
    child.parent = this;
    child.transform.setParent(transform);
}