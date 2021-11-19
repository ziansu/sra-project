public void keyPressed(java.awt.event.KeyEvent e) {
    player.keys[e.getKeyCode()] = true;
    synchronized(player.strokes) {
        player.strokes.add(e.getKeyCode());
    }
}