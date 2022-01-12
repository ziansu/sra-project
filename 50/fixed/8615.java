public boolean hasGrandParent() {
    return (this.hasParent()) && (this.getParent().hasParent());
}