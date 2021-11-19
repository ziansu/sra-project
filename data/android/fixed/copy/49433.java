public void death() {
    if (this.alive)
        this.deathSound.playSound();
    
    this.alive = false;
    this.channel.setAnim(death, 0.5F);
    this.channel.setLoopMode(LoopMode.DontLoop);
}