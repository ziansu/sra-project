@java.lang.Override
public void paint(java.awt.Graphics g) {
    super.paint(g);
    while (running) {
        if ((state) == 0)
            paintGame(g);
        
    } 
}