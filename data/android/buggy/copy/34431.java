public boolean reset() {
    if ((this.cards) != null)
        this.cards.clear();
    
    this.active = true;
    this.lastAction = null;
    return true;
}