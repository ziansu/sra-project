public void update(float dt) {
    super.update(dt);
    incrementLife(dt);
    if ((currentLife) >= (lifetime))
        dispose();
    
}