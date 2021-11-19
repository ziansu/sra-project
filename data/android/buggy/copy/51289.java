public void act(float delta) {
    super.act(delta);
    x = getX();
    y = getY();
    if (!(goal))
        moveHole();
    
}