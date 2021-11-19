public void dispose() {
    if ((getParent()) != null)
        getParent().remove(this);
    
}