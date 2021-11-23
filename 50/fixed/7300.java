public void remove() {
    if ((getParent()) != null)
        getParent().remove(this);
    
    dispose();
}