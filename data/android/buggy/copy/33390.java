public void dispose() {
    for (it.polito.atlas.alea2.Property p : getProperties())
        p.dispose();
    
    getProperties().clear();
    if ((getParent()) != null)
        getParent().remove(this);
    
}