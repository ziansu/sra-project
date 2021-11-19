public void invalidate() {
    if (!(invalidateParent()))
        super.invalidate();
    else
        if ((getParent()) != null)
            getParent().invalidate();
        
    
}