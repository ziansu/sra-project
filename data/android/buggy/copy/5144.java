public void setFinished(boolean finished) {
    this.finished = finished;
    if (finished)
        this.turns.clear();
    
}