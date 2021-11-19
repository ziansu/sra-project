public void setX(int x) {
    if (editing)
        comp.getPosition().setLocation(x, getY());
    
    this.x = x;
}