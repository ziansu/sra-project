@java.lang.Override
public void paintComponents(java.awt.Graphics g) {
    if (isInMenu) {
        DrawMenu(g);
    }else {
        getHighScore(g);
    }
}