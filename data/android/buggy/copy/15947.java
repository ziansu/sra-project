@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent event) {
    challengeDialog.reset();
    challengeDialog.setSearchOpponent(((event.getSource()) == (menuButtons[0])));
}