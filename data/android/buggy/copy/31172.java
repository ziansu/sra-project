protected void addChildren(Node[] children) throws java.lang.CloneNotSupportedException {
    if (hasKids()) {
        union(children);
    }else {
        this.children = children;
        setKids(children.length);
    }
}