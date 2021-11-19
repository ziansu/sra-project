public void tick() {
    (scoreKeep)++;
    for (int i = 0; i < 3; i++)
        handler.addObject(new lastPilot.Track_Enemy(50, 50, ID.Track_Enemy, handler));
    
}