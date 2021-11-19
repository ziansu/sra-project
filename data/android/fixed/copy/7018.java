public void jump(double force) {
    if (!(isJumping))
        this.velY = (-(this.weight)) * force;
    
}