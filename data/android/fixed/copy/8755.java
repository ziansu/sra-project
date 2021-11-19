public void goBack() {
    if (goingBack)
        return ;
    
    distance *= 5;
    goingBack = true;
    isSolid = false;
}