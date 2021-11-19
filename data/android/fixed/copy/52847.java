protected void die() {
    super.die();
    if (!(Active))
        Play.GameOver();
    
}