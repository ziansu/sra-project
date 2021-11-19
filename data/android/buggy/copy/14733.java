public void setLocY(int locY) {
    if (locY > 1985)
        locY = 1985;
    else
        if (locY < 0)
            locY = 0;
        
    
    this.locY = locY;
}