public boolean hasGrandParent() {
    return (hasParent()) && (getParent().hasParent());
}