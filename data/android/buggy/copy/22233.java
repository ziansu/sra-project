@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((e.getSource()) == (load)) {
        Chess.Utils.Parser.readFromFile(gameManager, this);
    }
}