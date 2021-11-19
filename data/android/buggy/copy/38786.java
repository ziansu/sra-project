public void call() {
    if (this.finit) {
        (this.left)--;
        this.result.timerCall();
        if ((this.left) <= 0)
            this.running = false;
        
    }
}