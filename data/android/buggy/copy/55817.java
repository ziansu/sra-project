@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    try {
        newGame();
    } catch (java.io.IOException e1) {
        e1.printStackTrace();
    }
}