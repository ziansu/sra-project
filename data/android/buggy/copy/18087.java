public void setLocX(int locX) {
    if (locX > 1985)
        locX = 1984;
    else
        if (locX < 0)
            locX = 0;
        
    
    this.locX = locX;
}