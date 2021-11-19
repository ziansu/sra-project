public void setState(boolean state) {
    this.state = state;
    if (this.state)
        color = java.awt.Color.GREEN;
    else
        color = java.awt.Color.BLACK;
    
}