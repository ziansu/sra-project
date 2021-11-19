public void rotateRight() {
    if (!(canRotate))
        return ;
    
    orientation = orientation.right();
    setHeightAndWidth();
}